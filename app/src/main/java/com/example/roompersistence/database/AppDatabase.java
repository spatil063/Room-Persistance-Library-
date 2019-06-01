package com.example.roompersistence.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.roompersistence.dao.PlayerDao;
import com.example.roompersistence.entity.Player;

@Database(entities = {Player.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase INSTANCE;

    public abstract PlayerDao playerDao();

    public static AppDatabase getAppDatabse(Context context){
        if(INSTANCE==null){
            INSTANCE= Room.databaseBuilder(context.getApplicationContext(),AppDatabase.class,"player-database")
                    //allow queries on the main  thread.
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;
    }
    public static void destroyInstance(){
        INSTANCE=null;
    }
}
