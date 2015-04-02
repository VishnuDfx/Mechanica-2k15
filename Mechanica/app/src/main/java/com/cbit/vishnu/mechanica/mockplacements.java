package com.cbit.vishnu.mechanica;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class mockplacements extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mockplacements);

        TextView textview = (TextView)findViewById(R.id.textView16);
        TextView textview1 = (TextView)findViewById(R.id.textView17);
        TextView textview2 = (TextView)findViewById(R.id.textView18);
        TextView textview3 = (TextView)findViewById(R.id.textView19);

        TextView register = (TextView)findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent local=new Intent("android.intent.action.VIEW");
                local.setData(Uri.parse("https://docs.google.com/forms/d/12K4I9eJsT7bNKJC6gr0JdQV5J9aJ7V7yRS9Pfxo53T4/viewform?c=0&w=1"));
                mockplacements.this.startActivity(local);
            }
        });
        textview.setText("Mock placements is being conducted on 10th & 11th March as a part of MECHANICA 2K15\n" +
                "Main aim of this event is to create awareness among the students how a recruitment process goes on, how to behave in an interview, Behavioural aspects etc. This event consists of 3 rounds. ");
        textview1.setText("1) Written Exam.\n" +
                "2) Group Discussion.\n" +
                "3) Personal Interview.(Technical + HR)");
        textview2.setText("Candidates will be given participation certificate.\n" +
                "Registration Fee: Rs.100/- per head\n" +
                "Venue: CBIT placement cell.");
        textview3.setText("Contact details:\n" +
                "Harika-9052286433\n" +
                "Spot Registrations are available");
    }



}
