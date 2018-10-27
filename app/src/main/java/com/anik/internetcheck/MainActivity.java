package com.anik.internetcheck;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import am.appwise.components.ni.NoInternetDialog;

public class MainActivity extends AppCompatActivity {

    NoInternetDialog noInternetDialog;;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       // Suggestion: add 'tools:replace="android:theme"' to element at AndroidManifest.xml:5:5-23:19 to override.

        noInternetDialog = new NoInternetDialog.Builder(this).build();

        noInternetDialog.setCancelable(true);
        noInternetDialog.showDialog();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        noInternetDialog.onDestroy();
    }
}
