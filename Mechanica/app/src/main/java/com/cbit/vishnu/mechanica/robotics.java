package com.cbit.vishnu.mechanica;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class robotics extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.robotics);


        TextView textview = (TextView)findViewById(R.id.textView16);
        TextView textview1 = (TextView)findViewById(R.id.textView17);
        TextView textview2 = (TextView)findViewById(R.id.textView18);
        TextView textview3 = (TextView)findViewById(R.id.textView19);

        TextView register = (TextView)findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent local=new Intent("android.intent.action.VIEW");
                local.setData(Uri.parse("https://docs.google.com/forms/d/1VnNQUTJE28bF1H8ZqBUkjvoAyt89hDhMvt3TaY3hQyk/viewform?c=0&w=1"));
                robotics.this.startActivity(local);
            }
        });
        textview.setText("Details Of the Event: A team of two members");
        textview1.setText("The bot should go in a specified path consisting of obstacles\n" +
                "Track width is 30 cms \n" +
                "Registration fee - 200 Rs \n" +
                "-300 Rs if we provide the bot");
        textview2.setText("For Winner 1200 Rs \n" +
                "For Runner 600 Rs \n" +
                "Rules of the event:\n" +" Minimum bot size 20 cms\n" +
                "Penalty of +5 sec for each touch of the boundary");

        textview3.setText("CONTACTS \n" + "1.Perla Sai Surya Rakesh -9573324544 \n" +
                "2. Shravya -8688639496 ");
    }



}
