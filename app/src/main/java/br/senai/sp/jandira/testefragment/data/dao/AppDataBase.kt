package br.senai.sp.jandira.testefragment.data.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import br.senai.sp.jandira.testefragment.model.Console

@Database(entities = [Console::class], version = 1)
abstract class AppDataBase : RoomDatabase(){

    abstract fun consoleDao(): ConsoleDao

}