package br.senai.sp.jandira.testefragment.data.dao

import android.content.Context
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.model.Console
import br.senai.sp.jandira.testefragment.model.Game

class GameDataSource {

    companion object{
        fun getGames(context: Context) : ArrayList<Game> {
            var games = ArrayList<Game>()

            games.add(Game(
                1,
                "Mortal Kombat",
                context.getDrawable(R.drawable.mortal)!!,
                "Mortal Kombat é uma série de jogos criados pelo estúdio de Chicago da Midway Games. Em 2011, depois da falência da Midway, a produção de Mortal Kombat foi adquirida pela Warner Bros, tornando-se em seguida na Netherealm. A Warner detém atualmente os direitos da série.",
                4.5f,
                listOf(
                    Console(1, "PlayStation 4", "Sony", "2015-11-21", "context.getDrawable(R.drawable.midnight)!!",
                        "Fodaseyagwdyagwdgatwgdtagwtdgtagwtdgatwgdagwdawdawd"),
                    Console(2, "Xbox One", "Microsoft", "2015-12-12", "context.getDrawable(R.drawable.midnight)!!",
                        "Fodaseyagwdyagwdgatwgdtagwtdgtagwtdgatwgdagwdawdawd")
                ))
            )

            games.add(Game(
                2,
                "Midnight Club 3",
                context.getDrawable(R.drawable.midnight)!!,
                "Midnight Club 3: Dub Edition é um jogo de corrida desenvolvido pela Rockstar San Diego e publicado pela Rockstar Games. É a terceira parcela da série Midnight Club.",
                4.5f,
                listOf(
                    Console(1, "PlayStation 2", "Sony", "2009-11-21", "context.getDrawable(R.drawable.midnight)!!",
                        "Fodaseyagwdyagwdgatwgdtagwtdgtagwtdgatwgdagwdawdawd")
                ))
            )

            games.add(Game(
                3,
                "Call of Duty: Black Ops 2",
                context.getDrawable(R.drawable.cod)!!,
                "Call of Duty: Black Ops II é um videojogo de tiro em primeira pessoa, desenvolvido pela Treyarch e publicado pela Activision. Black Ops II foi um dos videojogos mais esperados de 2012, e foi lançado em 13 de novembro de 2011 para Microsoft Windows, PlayStation 3, Xbox 360.",
                4.5f,
                listOf(
                    Console(1, "PlayStation 3", "Sony", "2009-11-21", "context.getDrawable(R.drawable.midnight)!!",
                        "Fodaseyagwdyagwdgatwgdtagwtdgtagwtdgatwgdagwdawdawd"),
                    Console(2, "Xbox 360", "Microsoft", "2008-12-12", "context.getDrawable(R.drawable.midnight)!!",
                        "Fodaseyagwdyagwdgatwgdtagwtdgtagwtdgatwgdagwdawdawd")
                ))
            )

            return games

        }
    }

}