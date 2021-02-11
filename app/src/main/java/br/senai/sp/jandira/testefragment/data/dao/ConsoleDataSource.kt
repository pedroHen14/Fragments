package br.senai.sp.jandira.testefragment.data.dao

import android.content.Context
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.model.Console

class ConsoleDataSource {

    companion object{
        fun getConsoles(context: Context) : ArrayList<Console> {
            var consoles = ArrayList<Console>()

            consoles.add(Console(
                1,
                "Xbox 360",
                "Microsoft",
                "2005-01-01",
                context.getDrawable(R.drawable.xbox)!!,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
            ))

            consoles.add(Console(
                2,
                "Xbox One",
                "Microsoft",
                "2011-01-01",
                context.getDrawable(R.drawable.xbox)!!,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, "
            ))

            consoles.add(Console(
                3,
                "Xbox Series X",
                "Microsoft",
                "2020-01-01",
                context.getDrawable(R.drawable.xbox)!!,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, "
            ))

            consoles.add(Console(
                4,
                "Playstation 3",
                "Sony",
                "2011-01-01",
                context.getDrawable(R.drawable.xbox)!!,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, "
            ))

            consoles.add(Console(
                5,
                "Playstation 4",
                "Sony",
                "2015-01-01",
                context.getDrawable(R.drawable.xbox)!!,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, ."
            ))

            consoles.add(Console(
                6,
                "Playstation 5",
                "Sony",
                "2020-01-01",
                context.getDrawable(R.drawable.xbox)!!,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, "
            ))

            return consoles
            
        }
    }
}