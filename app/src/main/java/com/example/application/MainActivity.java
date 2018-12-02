package com.example.application;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onContinue(View view){
        Intent intent = new Intent(this, AuthorizationActivity.class);
        startActivity(intent);
    }

    public void vkLogin(View view){
        Intent browseIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com"));
    }

    public  void facebookLogin(View view){
        Intent browseIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ru-ru.facebook.com"));
    }

    public void googleLogin(View view){
        Intent browseIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://accounts.google.com"));
    }
}
