
package com.example.nasri.examine;



import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;


public class About extends AppCompatActivity {



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_about);
        WebView webViewAbout;
        webViewAbout = findViewById(R.id.webViewAbout);
        webViewAbout.loadUrl("file:///android_asset/about_plain.html");

    }

}