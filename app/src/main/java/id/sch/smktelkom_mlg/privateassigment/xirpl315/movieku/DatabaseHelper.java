package id.sch.smktelkom_mlg.privateassigment.xirpl315.movieku;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by KEVIN_E15 on 5/14/2017.
 */


public class DatabaseHelper extends SQLiteOpenHelper {
    private int DATABASE_VERSION = 1;
    private String DATABASE_NAME = "db_moview";

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}


