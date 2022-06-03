package com.example.projetoprog

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaBDCategorias(db: SQLiteDatabase) : TabelaBD(db, NOME) {
    override fun cria(){
        db.execSQL("CREATE TABLE $NOME (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, $CAMPO_NOME TEXT NOT NULL)")

    }
    companion object{
        const val NOME = "categorias"
        const val CAMPO_NOME = "nome"
        
    }
}