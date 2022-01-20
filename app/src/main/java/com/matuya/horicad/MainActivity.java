package com.matuya.horicad;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        ImageView imageView = (ImageView) findViewById(R.id.image);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.horicad);
        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        roundedBitmapDrawable.setCircular(true);
        imageView.setImageDrawable(roundedBitmapDrawable);

        //Button1
        button1=(Button)findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openJibonkahini();
            }
        });

        //Button2
        button2=(Button)findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendhormoprocar();
            }
        });

        //Button3
        button3=(Button)findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHoriSongit();
            }
        });
        //Button4
        button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMatuyaDhormoProcar();

            }
        });
        //Button5
        button5=(Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMohautsob("mohautsob.html");
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.developer) {
            Intent intent=new Intent(MainActivity.this,Developer.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void openMatuyaDhormoProcar() {
        Intent intent=new Intent(this,MatuyaDhormoProcar.class);
        intent.putExtra("button4","invisible");
        startActivity(intent);
    }


    //button1
    private void openJibonkahini() {

        Intent intent = new Intent(this,Jibonkahini.class);
        intent.putExtra("button1" , "invisible");
        startActivity(intent);
    }
    //button2
    private void opendhormoprocar() {
        Intent intent= new Intent(this,dhormoprocar.class);
        intent.putExtra("button2" , "invisible");
        startActivity(intent);

    }
    //button3
    private void openHoriSongit() {
        Intent intent= new Intent(this,HoriSongit.class);
        intent.putExtra("button3" , "invisible");
        startActivity(intent);

    }
    //Button4
    private void openMohautsob( String joy) {
        Intent intent=new Intent(this,Mohautsob.class);
        intent.putExtra("joy",joy);
        startActivity(intent);
    }

}
