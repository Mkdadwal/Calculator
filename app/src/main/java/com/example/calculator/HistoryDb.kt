package com.example.calculator

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class HistoryDb(var ctx: Context):SQLiteOpenHelper(ctx,"history",null,1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        if(p0 != null){
            p0.execSQL("create table simpleHistory( _id integer primary key autoincrement, eqn text,ans text)")
        }
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {}
}