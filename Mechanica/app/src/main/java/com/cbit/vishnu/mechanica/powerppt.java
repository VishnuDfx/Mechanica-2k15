package com.cbit.vishnu.mechanica;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class powerppt extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.powerppt);


        TextView textview = (TextView)findViewById(R.id.textView16);
        TextView textview1 = (TextView)findViewById(R.id.textView17);
        TextView textview2 = (TextView)findViewById(R.id.textView18);
        TextView textview3 = (TextView)findViewById(R.id.textView19);
        TextView register = (TextView)findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent local=new Intent("android.intent.action.VIEW");
                local.setData(Uri.parse("https://docs.google.com/forms/d/1dEYukiiNhCIlgU2j7c2BUR2oNpNuhcvxLNfoZSM0pto/viewform?c=0&w=1"));
                powerppt.this.startActivity(local);
            }
        });
        textview.setText("Paper presentations will be conducted as a part of mechanica on 10th and 11th march, 2015.\n" +
                "Students from 3rd year should present from the following topics:");
        textview1.setText("1.Manufacturing Field\n" +
                "2.Design Field\n" +
                "3.Industrial Field\n" +
                "4.Thermal Field\n" +
                "5.Composite Material");
        textview2.setText("Abstracts must be mailed to mechanica.sudhee2k15@gmail.com before 9th March, 2015.\n" +
                "Certificates: Submission, Participation & Appreciation Registration fee:200 per team of 2 members\n" +
                "Spot registrations are available\n" +
                "Special Panels for 1st & 2nd Year Students");
        textview3.setText("For further details contact:\n" +
                "1)Akhila:9490000645\n" +
                "2)Ishaq:8106714445\n" +
                "3)Shravan:9550328169");
    }


}
