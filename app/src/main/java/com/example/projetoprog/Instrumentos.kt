package com.example.projetoprog

import android.content.ContentValues
import android.database.Cursor
import android.provider.BaseColumns


data class Instrumentos(
    var nome : String,
    var preco: String,
    var Categoria: Long,
    var id: Long = -1
) {


    fun toContentValues() : ContentValues {
        val valores = ContentValues()

        valores.put(TabelaBDInstrumentos.NOME_INSTRUMENTO, nome)
        valores.put(TabelaBDInstrumentos.CAMPO_PRECO, preco)
        valores.put(TabelaBDInstrumentos.CAMPO_CATEGORIA_ID, Categoria)
        valores.put(TabelaBDInstrumentos.CAMPO_ID, id)
        return valores
    }

    companion object {


        fun fromCursor(cursor: Cursor): Instrumentos {
            val posId = cursor.getColumnIndex(BaseColumns._ID)
            val posNome = cursor.getColumnIndex(TabelaBDInstrumentos.NOME_INSTRUMENTO)
            val pospreco = cursor.getColumnIndex(TabelaBDInstrumentos.CAMPO_PRECO)
            val posIdCateg = cursor.getColumnIndex(TabelaBDInstrumentos.CAMPO_CATEGORIA_ID)

            val id = cursor.getLong(posId)
            val nome = cursor.getString(posNome)
            val preco = cursor.getString(pospreco)
            val idCategoria = cursor.getLong(posIdCateg)

            return Instrumentos(nome, preco, idCategoria, id)
        }
    }
}
