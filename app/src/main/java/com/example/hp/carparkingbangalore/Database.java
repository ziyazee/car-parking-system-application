package com.example.hp.carparkingbangalore;




import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by hp on 29-03-2018.
 */

public class Database  extends SQLiteOpenHelper {
    public static  final String DB="Parking.db";
    public static  final String TN="area3";
    public static  final String COL_1="ID";
    public static  final String COL_2="CAR_NO";
    public static  final String COL_3="MID";
    public static  final String COL_4="NAME";
    public static  final String COL_5="CONTACT";






    public Database(Context context) {
        super(context, DB, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TN+" (ID INTEGER PRIMARY KEY,MID INTEGER  ,CAR_NO TEXT,NAME TEXT,CONTACT TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // db.execSQL("DROP TABLE OF EXOSTS"+TN);
        onCreate(db);
    }
    public boolean insertData(Integer MID,String CAR_NO,String NAME,String CONTACT){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(COL_2,CAR_NO);
        cv.put(COL_3,MID);
        cv.put(COL_4,NAME);
        cv.put(COL_5,CONTACT);


        long result=db.insert(TN,null,cv);
        if(result == -1)
            return false;
        else
            return true;

    }
    public void delete(){
        SQLiteDatabase db=this.getWritableDatabase();
        db.execSQL("delete from "+ TN);
        // db.execSQL("ALTER TABLE "+ TN+" CHANGE "+COL_1+" CARID INTEGER");

    }
    public Cursor getData(){

        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("select * from "+TN,null);
        return res;


    }
}
