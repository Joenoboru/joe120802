package com.example.user.joe120802;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by user on 2016/12/8.
 */

public class MyOpenHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "student.sqlite";
    //public static final int version = 1; 新建一個sqlite檔用的
    public static final int version = 2; //sqlite版本更新用的
    public MyOpenHelper(Context context) {
        super(context, DB_NAME, null, version);
    }

    //app第一次執行時,建立sqlite檔案在手機內部(database)中,檔名為student.sqlite,table名稱為phone
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE \"phone\" (\"ID\" INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , \"SName\" VARCHAR, \"Tel\" VARCHAR, \"Addr\" VARCHAR)");
    }

    //若sqlite檔內的資料庫有更新則執行以下程式段
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion == 1 && newVersion == 2)//檢查舊版與最新版的資訊,如版本更新越後面,程式碼也越多段
        {
            db.execSQL("ALTER TABLE \"main\".\"phone\" ADD COLUMN \"note\" TEXT");
        }

    }
}
