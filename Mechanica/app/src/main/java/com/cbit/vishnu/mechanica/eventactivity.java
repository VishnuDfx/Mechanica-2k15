package com.cbit.vishnu.mechanica;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;


public class eventactivity extends Activity {
   Animation animation;
    Button mockplacements, ppt, intoindustry, workshops, junkyardwars, robotics, techquiz,powerppt,autoquiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eventactivity);
        autoquiz = ((Button) findViewById(R.id.autoquiz));
        powerppt=((Button) findViewById(R.id.powerppt));
        mockplacements = ((Button) findViewById(R.id.mockplacements));
        ppt = ((Button) findViewById(R.id.ppt));
        intoindustry = ((Button) findViewById(R.id.intotheindustry));
        workshops = ((Button) findViewById(R.id.workshops));
        junkyardwars = ((Button) findViewById(R.id.junkyardwars));
        robotics = ((Button) findViewById(R.id.robotics));
        techquiz = ((Button) findViewById(R.id.techquiz));



        autoquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liaIntent = new Intent(eventactivity.this, autoquiz.class);
                eventactivity.this.startActivity(liaIntent);
            }
        });

        powerppt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liaIntent = new Intent(eventactivity.this, powerppt.class);
                eventactivity.this.startActivity(liaIntent);
            }
        });
        mockplacements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liaIntent = new Intent(eventactivity.this, mockplacements.class);
                eventactivity.this.startActivity(liaIntent);
            }
        });

        ppt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liaIntent = new Intent(eventactivity.this, ppt.class);
                eventactivity.this.startActivity(liaIntent);
            }
        });

        junkyardwars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liaIntent = new Intent(eventactivity.this, junkyardwars.class);
                eventactivity.this.startActivity(liaIntent);
            }
        });

        workshops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liaIntent = new Intent(eventactivity.this, workshops.class);
                eventactivity.this.startActivity(liaIntent);
            }
        });

        intoindustry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liaIntent = new Intent(eventactivity.this, intoindustry.class);
                eventactivity.this.startActivity(liaIntent);
            }
        });

        robotics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liaIntent = new Intent(eventactivity.this, robotics.class);
                eventactivity.this.startActivity(liaIntent);
            }
        });

        techquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liaIntent = new Intent(eventactivity.this, techquiz.class);
                eventactivity.this.startActivity(liaIntent);
            }
        });


    }

}


