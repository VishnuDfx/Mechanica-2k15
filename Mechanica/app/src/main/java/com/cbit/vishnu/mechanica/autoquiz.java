package com.cbit.vishnu.mechanica;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class autoquiz extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autoquiz);

        TextView textview = (TextView)findViewById(R.id.textView16);
        TextView textview1 = (TextView)findViewById(R.id.textView17);
        TextView textview2 = (TextView)findViewById(R.id.textView18);
        TextView textview3 = (TextView)findViewById(R.id.textView19);
        TextView register = (TextView)findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent local=new Intent("android.intent.action.VIEW");
                local.setData(Uri.parse("https://docs.google.com/forms/d/1OCiDtrom1x0ol5D1txujJg3V-phuYCCl26ciL8DXZX4/viewform?c=0&w=1"));
                autoquiz.this.startActivity(local);
            }
        });



        textview.setText("Main idea of the event is to test the knowledge of the students related to automobiles.\n" +
                "-> A maximum of 2 members per team.\n" +
                "->Registration fee Rupees 100/- per team.\n" +
                "->The competition will be having three rounds in total.");

        textview1.setText("1st round being 'Written test',all the teams will get to answer simple questions on logos,car specifications,driving skills,etc,.\n" +
                "->Teams will be awarded ranks based on their performance in round 1.\n" +
                "->In round 2, 5 questions of high difficulty level will be asked per team.Questions which are unanswered or wrongly answered will be passed on to other teams. ->2 points will be given for right answer.\n" +
                "0 for wrong answer/unanswered.\n" +
                "1 point for answering passed on questions.");

        textview2.setText("In round 3,which is rapid fire round,each team gets a department from any one of the following :- engines,power transmission,braking and tire dynamics,suspension systems,steering geometry,aerodynamics by picking chits. ->The winner will be finally decided based on the total points a team scores in all the three rounds");

        textview3.setText("Contacts:-\n" +
                "G.Chandra Vamshi-8801148263.\n" +
                "N.R.Dinesh Reddy-8333897125\n" +
                "Udaya-9642998121.");
    }



}
