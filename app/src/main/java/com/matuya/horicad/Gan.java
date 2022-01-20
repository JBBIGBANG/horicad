package com.matuya.horicad;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Gan extends AppCompatActivity {
    private static final String TAG = "Gan";
    private Context mContext;
    private Bundle extras;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gan);

        mContext=Gan.this;

        webView= (WebView)findViewById(R.id.ganid);

        extras= getIntent().getExtras();
        if(!extras.equals(null)){
            String data=extras.getString("singer");
            int pos=extras.getInt("position");
            Log.d(TAG, "onCreate: the data is coming"+data);




            webView.loadUrl("file:///android_asset/"+data+pos+".html");


            WebSettings webSettings=webView.getSettings();
            webSettings.setBuiltInZoomControls(true);
            webSettings.setDisplayZoomControls(false);
            webSettings.setJavaScriptEnabled(true);

        }
    }
}

