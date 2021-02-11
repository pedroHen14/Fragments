package br.senai.sp.jandira.testefragment.holder

import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.model.Console

class ConsoleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val textConsoleName = itemView.findViewById<TextView>(R.id.console_name)
    val textConsoleMaker = itemView.findViewById<TextView>(R.id.console_maker)
    val textConsoleDate = itemView.findViewById<TextView>(R.id.text_view_console_release_date)
    val imageConsole = itemView.findViewById<ImageView>(R.id.image_console)
    val textConsoleDescription = itemView.findViewById<TextView>(R.id.text_view_console_description)

        fun bind(console: Console) {
            textConsoleName.text = console.consoleName
            textConsoleMaker.text = console.consoleMaker
            textConsoleDate.text = console.consoleReleaseDate
            textConsoleDate.text = console.consoleReleaseDate
            textConsoleDescription.text = console.consoleDescription
            imageConsole.setImageDrawable(console.consoleImage)
        }
}