package br.senai.sp.jandira.testefragment.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.adapter.GameAdapter
import br.senai.sp.jandira.testefragment.data.dao.GameDataSource
import br.senai.sp.jandira.testefragment.model.Game

class GamesFragment : Fragment() {

    private lateinit var recyclerGames: RecyclerView
    private val gameAdapter = GameAdapter()
    private var gameList = listOf<Game>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_games, container, false)

        //instanciar a recycler view
        recyclerGames = view.findViewById(R.id.recycler_view_games)

        //determinar a orientação da recyclerview
        recyclerGames.layoutManager = LinearLayoutManager(view.context)

        //informar para a recyclerview qual é o adapter que ela vai usar
        recyclerGames.adapter = gameAdapter

        //dizer ao adapter qual é a fonte de dados
        gameList = GameDataSource.getGames(view.context)

        //atualizar a lista de jogos do adapter
        gameAdapter.updateGameList(gameList)

        //Tornar o menu visivel
        setHasOptionsMenu(true)

        return view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)

        inflater.inflate(R.menu.menu_game, menu)
    }

}