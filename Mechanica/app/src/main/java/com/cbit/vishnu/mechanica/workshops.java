package com.cbit.vishnu.mechanica;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class workshops extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workshops);
        TextView textview = (TextView)findViewById(R.id.textView16);
        TextView textview1 = (TextView)findViewById(R.id.textView17);
        TextView textview2 = (TextView)findViewById(R.id.textView18);
        TextView textview3 = (TextView)findViewById(R.id.textView19);
        TextView register = (TextView)findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent local=new Intent("android.intent.action.VIEW");
                local.setData(Uri.parse("https://docs.google.com/forms/d/15u_Iwt2-AgBTfsgzqs8eYh61_1RXPkJLrWBQtLqMGEA/viewform?c=0&w=1"));
                workshops.this.startActivity(local);
            }
        });
        textview.setText("A technical engineer from renowned automobile industry will be addressing the students about basic problems of automobiles and there remedies say breake failure, Clutch shipping etc. To enlighten A student regarding the problems and remedies of a vechicle is the essence of workshop. It helps students to acquire practical knowledge about the automobiles");
        textview1.setText("Registration Fees Rs.200/- Certificates Participation and appreciation certifcates");
        textview2.setText("Contact Details:\n" +
                "M.Harika-9052286433");


    }



}
