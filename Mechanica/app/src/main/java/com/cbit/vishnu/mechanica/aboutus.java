package com.cbit.vishnu.mechanica;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class aboutus extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutus);

        TextView textview = (TextView) findViewById(R.id.textView7);


        textview.setText("-> Vishnu Vardhan Reddy - 9032966475 \n" + " -> 2/4-Mechanical");



    }
}
