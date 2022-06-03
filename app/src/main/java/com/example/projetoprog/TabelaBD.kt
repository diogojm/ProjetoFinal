package com.example.projetoprog

import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase

abstract class TabelaBD(val db: SQLiteDatabase, val nome: String) {
    abstract fun cria()

    fun insert(values: ContentValues) =
        db.insert(nome, null, values)

    fun update(whereClause: String, values: ContentValues, whereArgs: Array<String>) =
        db.update(nome, values,whereClause, whereArgs)

    fun delete(whereClause: String, whereArgs: Array<String>) =
        db.delete(nome, whereClause, whereArgs)

    //fun query(columns: Array<String>, selection: String, selectionArgs: Any, groupBy: Any) =
        //db.query(nome, columns, selection, selectionArgs, groupBy)

}






