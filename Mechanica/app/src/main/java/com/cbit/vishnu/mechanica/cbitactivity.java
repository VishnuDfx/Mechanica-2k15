package com.cbit.vishnu.mechanica;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class cbitactivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cbit);
        TextView textview = (TextView) findViewById(R.id.textView);
        TextView textview2 = (TextView) findViewById(R.id.textView2);

        textview.setText("CHAITANYA BHARATHI INSTITUTE OF TECHNOLOGY");
        textview2.setText("Chaitanya Bharathi Institute of Technology is one of the premier Engineering  Colleges in the self-financing category in Andhra Pradesh. The Institution, shaping its students into disciplined young citizens of good character and culture lays emphasis on practical experience so as to enable them to secure employment in industry thereby to become entrepreneurs.");
    }
}
