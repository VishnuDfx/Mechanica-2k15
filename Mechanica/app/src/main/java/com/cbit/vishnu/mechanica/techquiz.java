package com.cbit.vishnu.mechanica;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class techquiz extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.techquiz);


        TextView textview = (TextView)findViewById(R.id.textView16);
        TextView textview1 = (TextView)findViewById(R.id.textView17);
        TextView textview2 = (TextView)findViewById(R.id.textView18);
        TextView textview3 = (TextView)findViewById(R.id.textView19);

        TextView register = (TextView)findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent local=new Intent("android.intent.action.VIEW");
                local.setData(Uri.parse("https://docs.google.com/forms/d/1c5zogii9LPmy9sffGgVZ9KDD1KjJSnenDc0whgfK4-8/viewform?c=0&w=1"));
                techquiz.this.startActivity(local);
            }
        });
        textview.setText("The quiz basically consists of subjects related to DESIGN, MECHANICS, THERMAL, MANUFACTURING and MATERIAL SCIENCE that are common for both Mechanical and Production.");

        textview1.setText("NO. OF ROUNDS:3\n" +
                "ROUND 1: Written test\n" +
                "ROUND 2: Technical Quiz\n" +
                "ROUND 3: Solutions for Problem Statements");
        textview2.setText("No. of persons per team: 2\n" +
                "Registration fee: 100/-\n" +
                "Persons qualified for the second round will be provided with the Participation certificate.\n" +
                "Winning team will be awarded with Merit certificate and exciting prizes.");

        textview3.setText("CONTACT NUMBERS:\n" +
                "1:P.SINDHUJA: 9640330528\n" +
                "2:Md.RISHAB: 8121748163\n" +
                "Special Entry for 1st year students");
    }



}
