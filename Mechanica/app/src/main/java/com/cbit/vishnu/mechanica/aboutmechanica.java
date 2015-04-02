package com.cbit.vishnu.mechanica;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class aboutmechanica extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutmechanica);


        TextView textview = (TextView)findViewById(R.id.textView3);
        TextView textview1 = (TextView)findViewById(R.id.textView4);
        TextView textview2 = (TextView)findViewById(R.id.textView5);

        textview.setText("MECHANICA 2K15");
        textview1.setText("CBIT Sudhee presents Mechanica 2k15 organised by mechanical engineering department");
        textview2.setText("The first and second days of MECHANICA-2015 are packed with events designed to test every engineering/design notion in the participant. We’ve left no stone unturned in realizing our aim of proving the existence of creative engineering/design abilities in the participating students through these events and are sure that they will bring out the best of those capabilities.");
    }

}

