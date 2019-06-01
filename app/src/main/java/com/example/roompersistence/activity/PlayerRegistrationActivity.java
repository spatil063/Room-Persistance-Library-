package com.example.roompersistence.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.databinding.DataBindingUtil;
import android.view.View;

import com.example.roompersistence.R;
import com.example.roompersistence.database.AppDatabase;
import com.example.roompersistence.databinding.ActivityPlayerRegistrationBinding;
import com.example.roompersistence.utils.DatabaseInitializer;

public class PlayerRegistrationActivity extends AppCompatActivity {

    private String firstName;
    private String lastName;
    private String country;
    private String birthPlace;
    private String iplTeam;
    private int debutyear;
    private int age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityPlayerRegistrationBinding mbinding=DataBindingUtil.setContentView(this, R.layout.activity_player_registration);

        mbinding.registerFacebookLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputPlayerInfo(mbinding);
            }
        });
    }

    private void inputPlayerInfo(ActivityPlayerRegistrationBinding mbinding) {
        firstName=mbinding.edtFirstName.getText().toString();
        lastName=mbinding.edtLastName.getText().toString();
        country=mbinding.edtCountry.getText().toString();
        iplTeam=mbinding.edtIplteam.getText().toString();
        birthPlace=mbinding.edtBirthPlace.getText().toString();
        debutyear= Integer.parseInt(mbinding.edtDebutyear.getText().toString());
        age= Integer.parseInt(mbinding.edtAge.getText().toString());
        DatabaseInitializer.populateWithTestData(AppDatabase.getAppDatabse(this),firstName,lastName,country,iplTeam,birthPlace,debutyear,age);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        AppDatabase.destroyInstance();
    }
}
