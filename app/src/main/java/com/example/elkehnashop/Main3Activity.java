package com.example.elkehnashop;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.icu.text.Transliterator;
import android.media.AudioRecord;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class Main3Activity extends AppCompatActivity {

                    ImageView articlpic;
                    TextView nomarticl;
                    TextView displayprice;
                    EditText uneDescreption;
                    EditText livraison;
                    EditText lien;


            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                Intent i = getIntent();        setContentView(R.layout.activity_main3);

                displayprice= findViewById(R.id.displayprice);

                articlpic= findViewById(R.id.top5);
                int picid  = i.getIntExtra("img",1);
                articlpic.setImageResource(picid);


                nomarticl= findViewById(R.id.title);
                String title  = i.getStringExtra("title");
                nomarticl.setText(title);


                uneDescreption= findViewById(R.id.descreption);
                String descreption  = i.getStringExtra("Descreption");
                uneDescreption.setText(descreption);


                livraison= findViewById(R.id.delivary);
                String delivary  = i.getStringExtra("delivery");
                livraison.setText(delivary);


                lien= findViewById(R.id.link);
                String link  = i.getStringExtra("link");
                lien.setText(link);

            }
    public void onRadioButtonClicked (View view)
    {
        boolean checked =((RadioButton)view ).isChecked();
        switch (view.getId())
        {
            case R.id.withgaranty:
                if (checked){  displayprice.setText("1200DA");}break;
            case R.id.withougaranty:
                if (checked){  displayprice.setText("1000DA");}break;
        }
    }

    public void browser1 (View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com/Womens-Clothing/b?ie=UTF8&node=1040660"));
        startActivity(browserIntent);
    }

};