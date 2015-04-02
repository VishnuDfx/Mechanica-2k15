package com.cbit.vishnu.mechanica;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class junkyardwars extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.junkyardwars);

        TextView textview = (TextView)findViewById(R.id.textView16);
        TextView textview1 = (TextView)findViewById(R.id.textView17);
        TextView textview2 = (TextView)findViewById(R.id.textView18);
        TextView textview3 = (TextView)findViewById(R.id.textView19);
        TextView register = (TextView)findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent local=new Intent("android.intent.action.VIEW");
                local.setData(Uri.parse("https://docs.google.com/forms/d/1pYVe9nJgSTcWqfvtUN_AW9UrJiYiRd_S0JaaN0shY3Y/viewform?c=0&w=1"));
                junkyardwars.this.startActivity(local);
            }
        });
        textview.setText("The event pits teams against each other to build engineering projects from junk material.\n" +
                "Be the king of scrapheap by challenging yourself and conquering our puzzle and stand a chance to win exciting prizes and certificates...!!");

        textview1.setText("Each team will be given scrap material.They are free to make use of machine tools,welding and metal forming labs to produce the component.There is no time constraint.Lab assistants guidance is permitted.");

        textview2.setText("REGISTRATION FEE :- RS 100\n" +
                "NUMBER OF MEMBERS PER TEAM :- MAXIMUM OF 2");

        textview3.setText("COORDINATORS OF JUNKYARD WARS :-\n" +
                "P V PARTHEEP SIVA PRASSAD - 8985810277\n" +
                "K SHRAVYA..\n" +
                "B MRUNALINI\n" +
                "VINAY REDDY\n" +
                "NIKHIL\n" +
                "MAHESH");


    }


   }
