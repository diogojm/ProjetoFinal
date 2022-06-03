package com.example.projetoprog

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaBDCompras (db: SQLiteDatabase) : TabelaBD(db, NOME_CLIENTE) {
    override fun cria() {
        db.execSQL("CREATE TABLE $NOME_CLIENTE (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, $CAMPO_ID INT NOT NULL, $CAMPO_EMAIL TEXT NOT NULL, $NOME_INSTRUMENTO TEXT NOT NULL, $CAMPO_CATEGORIA_ID INTEGER NOT NULL, FOREIGN KEY($CAMPO_CATEGORIA_ID)REFERENCES ${TabelaBDCategorias.NOME}(${BaseColumns._ID}) ON DELETE RESTRICT )")

    }

    companion object {
        const val NOME_CLIENTE = "cliente"
        const val CAMPO_ID = "id"
        const val CAMPO_EMAIL = "email"
        const val NOME_INSTRUMENTO = "instrumentos"
        const val CAMPO_CATEGORIA_ID = "categoria_id"
    }
}