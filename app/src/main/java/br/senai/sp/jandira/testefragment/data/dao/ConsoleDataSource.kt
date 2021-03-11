package br.senai.sp.jandira.testefragment.data.dao

import android.content.Context
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.model.Console

class ConsoleDataSource {

    companion object{
        fun getConsoles(context: Context) : List<Console> {
            val consoleDao = Database.getDatabase(context).consoleDao()

            val consoles = consoleDao.listarTodos()

            return consoles
            
        }
    }
}