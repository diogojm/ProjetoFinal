package com.example.projetoprog

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaBDInstrumentos (db: SQLiteDatabase) : TabelaBD(db, NOME_INSTRUMENTO) {
    override fun cria() {
        db.execSQL("CREATE TABLE $NOME_INSTRUMENTO (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, $CAMPO_ID INT NOT NULL, $CAMPO_PRECO FLOAT NOT NULL, $CAMPO_CATEGORIA_ID INTEGER NOT NULL, FOREIGN KEY($CAMPO_CATEGORIA_ID)REFERENCES ${TabelaBDCategorias.NOME}(${BaseColumns._ID}) ON DELETE RESTRICT )")

    }

    companion object {
        const val NOME_INSTRUMENTO = "instrumento"
        const val CAMPO_ID = "id"
        const val CAMPO_PRECO = "preço"
        const val CAMPO_CATEGORIA_ID = "categoria_id"
    }
}