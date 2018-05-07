package com.example.abdulrahman.project8;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context) {
        super(context, DB_Detels.DBName, null, DB_Detels.DBversion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DB_Detels.CreateDB);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("Drop table " + DB_Detels.DBTable);
        onCreate(db);
    }
}
