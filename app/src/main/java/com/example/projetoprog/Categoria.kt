package com.example.projetoprog

import android.content.ContentValues
import android.database.Cursor
import android.provider.BaseColumns

data class Categoria(var nome: String, var id: Long = -1) {
    fun toContentValues() : ContentValues {
        val values = ContentValues()
        values.put(TabelaBDCategorias.CAMPO_NOME, nome)

        return values
    }

    companion object {
        fun fromCursor(cursor: Cursor): Categoria {
            val posId = cursor.getColumnIndex(BaseColumns._ID)
            val posName = cursor.getColumnIndex(TabelaBDCategorias.CAMPO_NOME)

            val id = cursor.getLong(posId)
            val name = cursor.getString(posName)

            return Categoria(name, id)
        }
    }
}