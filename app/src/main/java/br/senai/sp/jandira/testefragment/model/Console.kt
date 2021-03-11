package br.senai.sp.jandira.testefragment.model

import android.graphics.drawable.Drawable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Console(
    @PrimaryKey(autoGenerate = true)
    var id: Long,

    @ColumnInfo(name = "name")
    var consoleName: String,

    @ColumnInfo(name = "maker")
    var consoleMaker: String,

    @ColumnInfo(name = "release_date")
    var consoleReleaseDate: String,

    @ColumnInfo(name = "image")
    var consoleImage: String,

    @ColumnInfo(name = "description")
    var consoleDescription: String
)