package com.example.roompersistence.utils;

import android.util.Log;

import com.example.roompersistence.database.AppDatabase;
import com.example.roompersistence.entity.Player;

import java.util.List;

public class DatabaseInitializer {


    private static final String TAG = DatabaseInitializer.class.getName();


    public static void populateWithTestData(AppDatabase db, String first_Name, String last_Name, String country, String birthPlace, String iplTeam, int debutyear, int age) {
        Player player = new Player();
        player.setFirstName(first_Name);
        player.setLastName(last_Name);
        player.setCountry(country);
        player.setBirthPlace(birthPlace);
        player.setIplTeam(iplTeam);
        player.setDebutYear(debutyear);
        player.setAge(age);
        addPlayer(db, player);

        List<Player> userList = db.playerDao().getAll();
        Log.d(DatabaseInitializer.TAG, "Rows Count: " + userList.size());
    }

    private static Player addPlayer(final AppDatabase db, Player player) {
        db.playerDao().insertAll(player);
        Log.d("Addedd_Sucessfully", player.getFirstName() + " " + player.getLastName() + " " + player.getCountry() + " " + player.getBirthPlace() + " " + player.getIplTeam() + " " + player.getDebutYear() + " " + player.getAge());
        return player;
    }

}
