package br.senai.sp.jandira.testefragment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.testefragment.MainActivity
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.adapter.ConsoleAdapter
import br.senai.sp.jandira.testefragment.data.dao.ConsoleDataSource
import br.senai.sp.jandira.testefragment.model.Console
import kotlinx.android.synthetic.*

class ConsoleFragment : Fragment(), View.OnClickListener {

    private lateinit var recyclerConsoles: RecyclerView
    private val consoleAdapter = ConsoleAdapter()
    private var consoleList = listOf<Console>()
    private lateinit var buttonAddConsole: ImageButton
    private lateinit var dialog: AlertDialog

    private lateinit var consoleName: EditText
    private lateinit var consoleDescription: EditText
    private lateinit var consoleMaker: EditText
    private lateinit var consoleReleaseDate: EditText
    private lateinit var consoleImage: EditText
    private lateinit var buttonSave: Button
    private lateinit var buttonCancel: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    private fun abrirCadastroConsole() {
        val alertDialog = AlertDialog.Builder(this)
        val view = layoutInflater.inflate(R.layout.cadastro_console_dialog, null)
        alertDialog.setView(view)

        consoleName = view.findViewById(R.id.console_name)
        consoleDescription = view.findViewById(R.id.console_description)
        consoleMaker = view.findViewById(R.id.console_maker)
        consoleReleaseDate = view.findViewById(R.id.console_release_date)
        consoleImage = view.findViewById(R.id.image_console)

        buttonSave = view.findViewById(R.id.button_salvar)
        buttonCancel = view.findViewById(R.id.button_cancelar)

        dialog = alertDialog.create()
        dialog.setCancelable(false)
        dialog.show()

        buttonSave.setOnClickListener(this)
        buttonCancel.setOnClickListener(this)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_console, container, false)

        buttonAddConsole = view.findViewById(R.id.button_add_consoles)
        buttonAddConsole.setOnClickListener(this)

        recyclerConsoles = view.findViewById(R.id.recycler_view_consoles)

        recyclerConsoles.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)

        recyclerConsoles.adapter = consoleAdapter

        consoleList = ConsoleDataSource.getConsoles(view.context)

        consoleAdapter.updateConsoleList(consoleList)

        return view
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_add_consoles)
            abrirCadastroConsole()

    }

}