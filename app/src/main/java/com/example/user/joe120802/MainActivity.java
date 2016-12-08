package com.example.user.joe120802;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //app執行時 才建立sqlite檔案
        MyOpenHelper helper = new MyOpenHelper(MainActivity.this);
        db = helper.getWritableDatabase();
    }
}
