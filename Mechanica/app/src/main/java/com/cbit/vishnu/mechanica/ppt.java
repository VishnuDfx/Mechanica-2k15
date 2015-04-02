package com.cbit.vishnu.mechanica;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class ppt extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ppt);
        TextView textview = (TextView)findViewById(R.id.textView16);
        TextView textview1 = (TextView)findViewById(R.id.textView17);
        TextView textview2 = (TextView)findViewById(R.id.textView18);
        TextView textview3 = (TextView)findViewById(R.id.textView19);
        TextView register = (TextView)findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent local=new Intent("android.intent.action.VIEW");
                local.setData(Uri.parse("https://docs.google.com/forms/d/1Z9BWhfRMDNXUgiZ7mAq2nTJSAc9LcsL8gBA7DFstSwo/viewform?c=0&w=1"));
                ppt.this.startActivity(local);
            }
        });
        textview.setText("\"Time to combine your creativity with knowledge\"\n" +
                "Poster session or Poster presentation is a part of MECHANICA 2K15 conducted on 10th and 11th of March. The interested students are supposed to form a team of two. The registration fee is Rs. 200/- per team. Participants can make their poster on any of the topics listed below");

        textview1.setText("1. Thermal Field\n" +
                "2. Manufacturing Field\n" +
                "3. Design Field\n" +
                "4. Composite materials\n" +
                "5. Industrial Field");
        textview2.setText("RULES: 1. The poster should be confined to the selected theme.\n" +
                "2. The poster should consist of a title regarding the selected theme.\n" +
                "3. The maximum size of the poster should be A1 size.\n" +
                "4. The details about the names and college of the participants should be written at the back of the poster.\n" +
                "5. The posters shall be evaluated by the judges and the judges call is final.");

        textview3.setText("CONTACT: Mohan-9948935141\n" +
                "Sarath-8686240516\n" +
                "Aashish-9701390187");


    }





}
