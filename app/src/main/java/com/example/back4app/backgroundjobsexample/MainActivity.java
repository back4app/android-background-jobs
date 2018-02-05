package com.example.back4app.backgroundjobsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
// Java Dependencies
import java.util.ArrayList;
// Parse Dependencies
import com.parse.Parse;
import com.parse.ParseInstallation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Parse.initialize(this);
        ArrayList<String> channels = new ArrayList<>();
        channels.add("News");
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        // don't forget to change the line below with the sender ID you obtained at Firebase
        installation.put("GCMSenderId", "YOUR_FIREBASE_GCM_SENDER_ID_HERE");
        installation.put("channels", channels);
        installation.saveInBackground();
    }
}
