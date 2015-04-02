package com.cbit.vishnu.mechanica;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class intoindustry extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intoindustry);



        TextView textview = (TextView)findViewById(R.id.textView16);
        TextView textview1 = (TextView)findViewById(R.id.textView17);
        TextView textview2 = (TextView)findViewById(R.id.textView18);
        TextView textview3 = (TextView)findViewById(R.id.textView19);
        TextView textview4 = (TextView)findViewById(R.id.textView20);

        TextView register = (TextView)findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent local=new Intent("android.intent.action.VIEW");
                local.setData(Uri.parse("https://docs.google.com/forms/d/1t2CNal224XJCND81ZaApXanfPw5Ps6oBa0JRjbkW8JM/viewform?c=0&w=1"));
                intoindustry.this.startActivity(local);
            }
        });
        textview.setText("Rack your brain and change yourself with your fundamentals of engineering and tinge of common sense and prove yourself as \" THE ULTIMATE ENGINEERS\"\n" +
                "Comingup with Innovative solutions for the problem or challenges faced by today's industries.\n" +
                "Number of levels: 2");

        textview1.setText("Level 1:\n" +
                "Registered participants will be divided into teams.3 per team.\n" +
                "Teams wil be given a common PROBLEM and they need to come up with a best solution possible. Rules:\n" +
                "1. NO books allowed. 2.Browsing of net is restricted.");
        textview4.setText("Level 2:\n" +
                "In the level 2 the short listed students of level 1 are given a problem ,they should come up with a best innovative solution. the best solution will be awarded the prize. Rules:\n" +
                "1.solution should be unique. REGISTRATION FEE: RS.49/-\n" +
                "Awards:\n" +
                "1.First prize :-Intenship in industry.\n" +
                "2.second prize:-cash prize is awarded.\n" +
                "JUDGEMENT:\n" +
                "By faculty of MECHANICAL DEPARTMENT");

        textview2.setText("CONTACTS:\n" +
                "Nikitha Reddy: 9700253919\n" +
                "Vishnu: 9666424649");

        textview3.setText("Type Of Registration:\n" +
                "Limited Registrations\n" +
                "Online Registrations accepted till 9th Evening 4:16 P.M");



    }



}
