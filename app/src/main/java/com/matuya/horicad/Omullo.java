package com.matuya.horicad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Omullo extends AppCompatActivity {
    ListView listView;
    TextView textView;
    private AdView mAdView;
    String[] listItem;
    Intent intent;
    int singer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omullo);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        MobileAds.initialize(this, "ca-app-pub-1628835868187039~6690540129");

        intent = getIntent();
        singer = intent.getIntExtra("position",0);
        listView=(ListView)findViewById(R.id.Omullo);
        textView=(TextView)findViewById(R.id.OmulloGanlist);
        if (singer==0){
            listItem = getResources().getStringArray(R.array.Gan0);
        }
        else if (singer==1){
            listItem = getResources().getStringArray(R.array.Gan1);
        }
        else if (singer==2){
            listItem = getResources().getStringArray(R.array.Gan2);
        }
        else if (singer==3){
            listItem = getResources().getStringArray(R.array.Gan3);
        }
        else if (singer==4){
            listItem = getResources().getStringArray(R.array.Gan4);
        }
        else if (singer==5){
            listItem = getResources().getStringArray(R.array.Gan5);
        }
        else if (singer==6){
            listItem = getResources().getStringArray(R.array.Gan6);
        }
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, listItem);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // TODO Auto-generated method stub
                String value=adapter.getItem(position);
                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(Omullo.this,Gan.class);
                intent.putExtra("singer",String.valueOf(singer));
                intent.putExtra("position",position);
                startActivity(intent);


            }
        });

    }
}
