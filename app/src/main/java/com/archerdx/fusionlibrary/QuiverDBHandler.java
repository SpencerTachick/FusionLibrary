package com.archerdx.fusionlibrary;

import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;
import android.content.Context;
import android.content.ContentValues;
import android.database.sqlite.SQLiteQueryBuilder;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;


public class QuiverDBHandler extends SQLiteAssetHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "testing.db";


    public QuiverDBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public String getJoke(String noun){

        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String [] sqlSelect = {"joke"};
        String sqlTables = "penis";
        String columnName = "penis_name";
        String [] sqlArgs = {noun};
        qb.setTables(sqlTables);
        Cursor c = db.rawQuery("SELECT joke FROM penis WHERE penis_name = ?", sqlArgs);

        c.moveToFirst();
        return c.getString(0);
    }
}
