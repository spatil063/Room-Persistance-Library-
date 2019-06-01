package com.example.roompersistence.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.roompersistence.entity.Player;

import java.util.List;

@Dao
public interface PlayerDao {

    @Query("SELECT * FROM cricket")
    List<Player> getAll();

    @Query("SELECT * FROM cricket where first_name LIKE  :firstName AND last_name LIKE :lastName")
    Player findByName(String firstName, String lastName);

    @Query("SELECT COUNT(*) from cricket")
    int countUsers();

    @Insert
    void insertAll(Player...players);

    @Delete
    void delete(Player...players);
}
