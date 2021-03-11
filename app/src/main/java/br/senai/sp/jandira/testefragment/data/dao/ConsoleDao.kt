package br.senai.sp.jandira.testefragment.data.dao

import androidx.room.*
import br.senai.sp.jandira.testefragment.model.Console

@Dao
interface ConsoleDao {

    @Insert
    fun salvar(console: Console)

    @Update
    fun atualizar(console: Console)

    @Query("select * from Console")
    fun listarTodos() : List<Console>

    @Delete
    fun excluir(console: Console)

}