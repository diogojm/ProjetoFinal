package com.example.projetoprog

import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteQueryBuilder
import android.provider.BaseColumns

class TabelaBDInstrumentos (db: SQLiteDatabase) : TabelaBD(db, NOME_INSTRUMENTO) {
    override fun cria() {
        db.execSQL("CREATE TABLE $NOME_INSTRUMENTO (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, $CAMPO_ID INT NOT NULL, $CAMPO_PRECO FLOAT NOT NULL, $CAMPO_CATEGORIA_ID INTEGER NOT NULL, FOREIGN KEY($CAMPO_CATEGORIA_ID)REFERENCES ${TabelaBDCategorias.NOME}(${BaseColumns._ID}) ON DELETE RESTRICT )")

    }

    override fun query(
        columns: Array<String>,
        selection: String?,
        selectionArgs: Array<String>?,
        groupBy: String?,
        having: String?,
        orderBy: String?
    ): Cursor {
        val queryBuilder = SQLiteQueryBuilder()
        queryBuilder.tables = "$NOME_INSTRUMENTO INNER JOIN ${TabelaBDCategorias.NOME} ON ${TabelaBDCategorias.CAMPO_ID} = $CAMPO_CATEGORIA_ID"

        return queryBuilder.query(db, columns, selection, selectionArgs, groupBy, having, orderBy)
    }


    companion object {
        const val NOME_INSTRUMENTO = "instrumento"
        const val CAMPO_ID = "id"
        const val CAMPO_PRECO = "preco"
        const val CAMPO_CATEGORIA_ID = "categoria_id"

        val TODAS_COLUNAS = arrayOf(CAMPO_ID, NOME_INSTRUMENTO, CAMPO_PRECO, CAMPO_CATEGORIA_ID)
    }
}