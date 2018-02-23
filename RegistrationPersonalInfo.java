package com.qnally.shappapp;

import android.support.annotation.NonNull;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.seatgeek.placesautocomplete.OnPlaceSelectedListener;
import com.seatgeek.placesautocomplete.PlacesAutocompleteTextView;
import com.seatgeek.placesautocomplete.model.Place;

public class RegistrationPersonalInfo extends AppCompatActivity {

    Toolbar toolbar;
    PlacesAutocompleteTextView address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_personal_info);

        //setting up toolbar to give option to close if registration is not completed
        toolbar = (Toolbar) findViewById (R.id.toolbar);
        setSupportActionBar(toolbar);

        //setting up navigation button to go back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        //hide app title within toolbar
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        address = (PlacesAutocompleteTextView) findViewById(R.id.address_autocomplete);
        address.setOnPlaceSelectedListener(new OnPlaceSelectedListener() {
            @Override
            public void onPlaceSelected(@NonNull Place place) {

            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
