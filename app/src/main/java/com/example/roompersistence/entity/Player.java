package com.example.roompersistence.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "cricket")
public class Player {

    @PrimaryKey(autoGenerate = true)
    private int playerID;

    @ColumnInfo(name = "first_Name")
    private String firstName;

    @ColumnInfo(name = "last_Name")
    private String lastName;

    @ColumnInfo(name = "country")
    private String country;

    @ColumnInfo(name = "player_role")
    private String playerRole;

    @ColumnInfo(name = "birth_place")
    private String birthPlace;

    @ColumnInfo(name = "ipl_team")
    private String iplTeam;

    @ColumnInfo(name = "debut_year")
    private int debutYear;

    @ColumnInfo(name = "age")
    private int age;

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPlayerRole() {
        return playerRole;
    }

    public void setPlayerRole(String playerRole) {
        this.playerRole = playerRole;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getIplTeam() {
        return iplTeam;
    }

    public void setIplTeam(String iplTeam) {
        this.iplTeam = iplTeam;
    }

    public int getDebutYear() {
        return debutYear;
    }

    public void setDebutYear(int debutYear) {
        this.debutYear = debutYear;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
