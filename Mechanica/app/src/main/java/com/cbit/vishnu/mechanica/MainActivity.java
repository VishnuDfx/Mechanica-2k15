package com.cbit.vishnu.mechanica;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class MainActivity extends Activity {
      Animation zoom;
    ImageView cbit,aboutmechanica,aboutUs,sponsers,facebook,contact,video,events;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.events = ((ImageView) findViewById(R.id.events));

        this.cbit = ((ImageView) findViewById(R.id.cbit));
        aboutmechanica = ((ImageView) findViewById(R.id.aboutmechanica));
        this.aboutUs = ((ImageView) findViewById(R.id.aboutus));
        this.facebook = ((ImageView) findViewById(R.id.facebook));
        this.sponsers = ((ImageView) findViewById(R.id.sponsors));
        this.contact = ((ImageView) findViewById(R.id.contactus));
        this.video = ((ImageView) findViewById(R.id.video));

        zoom = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        events.startAnimation(zoom);
        contact.startAnimation(zoom);
        sponsers.startAnimation(zoom);
        cbit.startAnimation(zoom);
        aboutmechanica.startAnimation(zoom);
        video.startAnimation(zoom);
        aboutUs.startAnimation(zoom);
        facebook.startAnimation(zoom);


        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent local=new Intent("android.intent.action.VIEW");
                local.setData(Uri.parse("https://www.facebook.com/video.php?v=876566902400439&set=vb.594810487242750&type=2&theater"));
                MainActivity.this.startActivity(local);
            }
        });

        this.facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent local=new Intent("android.intent.action.VIEW");
                local.setData(Uri.parse("https://www.facebook.com/mechanicacbit"));
                MainActivity.this.startActivity(local);
            }
        });



        this.cbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liIntent=new Intent(MainActivity.this,cbitactivity.class);
                MainActivity.this.startActivity(liIntent);

            }
        });
        aboutmechanica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liaIntent = new Intent(MainActivity.this, aboutmechanica.class);
                MainActivity.this.startActivity(liaIntent);

            }
        });
        this.aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liaIntent=new Intent(MainActivity.this,aboutus.class);
                MainActivity.this.startActivity(liaIntent);
            }
        });
            this.sponsers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liaIntent=new Intent(MainActivity.this,sponser.class);
                MainActivity.this.startActivity(liaIntent);

            }
        });
       this.events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liaIntent = new Intent(MainActivity.this, eventactivity.class);
                MainActivity.this.startActivity(liaIntent);

            }
        });
        this.contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liaIntent=new Intent(MainActivity.this,contactUs.class);
                MainActivity.this.startActivity(liaIntent);

            }
        });

    }
}
