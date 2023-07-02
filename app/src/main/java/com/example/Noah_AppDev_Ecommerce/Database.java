//package com.example.Noah_AppDev_Ecommerce;
//
//
//
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//
//import androidx.annotation.Nullable;
//
//public class Database extends SQLiteOpenHelper {
//    public Database(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
//        super(context, name, factory, version);
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase sqLiteDatabase) {
//        String query1="create table users(username text,email text,password text)";
//        sqLiteDatabase.execSQL(query1);
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
//
//    }
//
//    public void register(String username,String email,String password){
//        ContentValues contentValues=new ContentValues();
//        contentValues.put("username",username);
//        contentValues.put("email",email);
//        contentValues.put("password",password);
//        SQLiteDatabase database=getWritableDatabase();// to insert the data
//        database.insert("users",null,contentValues);
//        database.close();
//
//    }
//    public int login(String username,String password){
//        int flag=0;
//        String[] str=new String[2];
//        str[0]=username;
//        str[1]=password;
//        SQLiteDatabase database=getReadableDatabase();
//        Cursor cursor=database.rawQuery("select * from users where username=? and password=?",str);
//        if(cursor.moveToFirst()){
//            flag=1;//to be sure if the user exists
//        }
//        return flag;
//    }
//
//
//}
