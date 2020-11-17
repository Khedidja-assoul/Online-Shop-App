package com.example.elkehnashop;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity {
    ImageView toppic;
    ImageView top3;
    ImageView top5;
    ImageView top8;
    ImageView top9;
    ImageView shortpic;
    ImageView short2;
    ImageView short3;
    ImageView short6;
    ImageView short1;
    ImageView conversepic;
    ImageView converse3;
    ImageView converse6;
    ImageView converse8;
    MediaPlayer mediaPlayer ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2main);
        mediaPlayer= MediaPlayer.create(this,R.raw.lily);

        mediaPlayer.start();


        toppic = findViewById(R.id.toppic);
        top3 = findViewById(R.id.top3);
        top5 = findViewById(R.id.top5);
        top8 = findViewById(R.id.top8);
        top9 = findViewById(R.id.top9);
        shortpic= findViewById(R.id.shortpic);
        short2= findViewById(R.id.short2);
        short3= findViewById(R.id.short3);
        short6= findViewById(R.id.short6);
        short1= findViewById(R.id.short1);
        conversepic= findViewById(R.id.conversepic);
        converse3= findViewById(R.id.converse3);
        converse6= findViewById(R.id.converse6);
        converse8= findViewById(R.id.converse8);


        toppic =(ImageView)findViewById(R.id.toppic);
        Animation animation0= AnimationUtils.loadAnimation(this,R.anim.topsanimation);
        toppic.startAnimation(animation0);

        top3 =(ImageView)findViewById(R.id.top3);
        Animation animation1= AnimationUtils.loadAnimation(this,R.anim.topsanimation);
        top3.startAnimation(animation1);

        top5 =(ImageView)findViewById(R.id.top5);
        Animation animation2= AnimationUtils.loadAnimation(this,R.anim.topsanimation);
        top5.startAnimation(animation2);

   View.OnLongClickListener listener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            int id = v.getId();
            if(id == R.id.top5){
                top5.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v0) {
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("img",R.drawable.top5);
                        i.putExtra("title","The blanco perla ");
                        i.putExtra("Descreption","This white offsholders top is a must have in your closet , " +
                                "you can use all the summer,with jeans or you can dress it up with a skirt and high heals " +
                                "");
                        i.putExtra("delivery","we have a delivary service to all the wilayas 1 we can reach you at home only in 15 days maximum and it is for free ");
                        i.putExtra("link","https://www.amazon.com/Womens-Clothing/b?ie=UTF8&node=1040660");
                        startActivity(i);
                        return false;
                    }
                });
            }
            else if (id ==R.id.top3){
                top3.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v1) {
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("img",R.drawable.top3);
                        i.putExtra("title","The kawai alias ");
                        i.putExtra("Descreption","This pink summary top is a cute addition  your closet , simple , comfy , girly and pink , how can you resist this !!" );
                        i.putExtra("delivery","we have a delivary service to all the wilayas 1 we can reach you at home only in 15 days maximum and it is for free ");
                        i.putExtra("link","https://www.amazon.com/Womens-Clothing/b?ie=UTF8&node=1040660");
                        startActivity(i);
                        return false;
                    }
                });
            }
            else if (id ==R.id.toppic){
                toppic.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v1) {
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("img",R.drawable.toppic);
                        i.putExtra("title","Colored cake ");
                        i.putExtra("Descreption","For university, shopping or hangingout with friends , this is a good choice whene you don't want to think much about what to wear , a white legging would be great with" );
                        i.putExtra("delivery","we have a delivary service to all the wilayas 1 we can reach you at home only in 15 days maximum and it is for free ");
                        i.putExtra("link","https://www.amazon.com/Womens-Clothing/b?ie=UTF8&node=1040660");
                        startActivity(i);
                        return false;
                    }
                });
            }
            else if (id ==R.id.top8){
                top8.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v1) {
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("img",R.drawable.top8);
                        i.putExtra("title"," Red it");
                        i.putExtra("Descreption"," A work meeting or a dinner date , that would be a great choice to dress it up or down , simple , unicolored and glamour" );
                        i.putExtra("delivery"," we have a delivary service to all the wilayas 1 we can reach you at home only in 15 days maximum and it is for free");
                        i.putExtra("link","https://www.amazon.com/Womens-Clothing/b?ie=UTF8&node=1040660");
                        startActivity(i);
                        return false;
                    }
                });
            }
            else if (id ==R.id.top9){
                top9.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v1) {
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("img",R.drawable.top9);
                        i.putExtra("title"," The kawai alias");
                        i.putExtra("Descreption","This gray summary top is a cute addition  your closet , simple , comfy , girly and pink , how can you resist this !! " );
                        i.putExtra("delivery","we have a delivary service to all the wilayas 1 we can reach you at home only in 15 days maximum and it is for free ");
                        i.putExtra("link","https://www.amazon.com/Womens-Clothing/b?ie=UTF8&node=1040660");
                        startActivity(i);
                        return false;
                    }
                });
            }
            else if (id ==R.id.short1){
                short1.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v1) {
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("img",R.drawable.short1);
                        i.putExtra("title","Kawai alias ");
                        i.putExtra("Descreption","Goes perfectly with the kawai alias top , you can use it for workout or as a pjs as much as you can use to outds" );
                        i.putExtra("delivery","we have a delivary service to all the wilayas 1 we can reach you at home only in 15 days maximum and it is for free ");
                        i.putExtra("link","https://www.amazon.com/Womens-Clothing/b?ie=UTF8&node=1040660");
                        startActivity(i);
                        return false;
                    }
                });
            }
            else if (id ==R.id.short3){
                short3.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v1) {
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("img",R.drawable.short3);
                        i.putExtra("title","Sunflower storm ");
                        i.putExtra("Descreption","Shorts, summer and sunflower a great combination in this piece of art ,don't hesitate to have it  !!" );
                        i.putExtra("delivery","we have a delivary service to all the wilayas 1 we can reach you at home only in 15 days maximum and it is for free ");
                        i.putExtra("link","https://www.amazon.com/Womens-Clothing/b?ie=UTF8&node=1040660");
                        startActivity(i);
                        return false;
                    }
                });
            }
            else if (id ==R.id.short2){
                short2.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v1) {
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("img",R.drawable.short2);
                        i.putExtra("title","\n" +
                                "Strawbery pie");
                        i.putExtra("Descreption","Shorts, summer and strawbery a great combination in this piece of art ,don't hesitate to have it  !!" );
                        i.putExtra("delivery","we have a delivary service to all the wilayas 1 we can reach you at home only in 15 days maximum and it is for free ");
                        i.putExtra("link","https://www.amazon.com/Womens-Clothing/b?ie=UTF8&node=1040660");
                        startActivity(i);
                        return false;
                    }
                });
            }
            else if (id ==R.id.shortpic){
                shortpic.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v1) {
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("img",R.drawable.shortpic);
                        i.putExtra("title"," Classy it up");
                        i.putExtra("Descreption","For those who say that shorts can't be formal , have this short and prove they are wrong,confy and classy with a great color " );
                        i.putExtra("delivery","we have a delivary service to all the wilayas 1 we can reach you at home only in 15 days maximum and it is for free ");
                        i.putExtra("link","https://www.amazon.com/Womens-Clothing/b?ie=UTF8&node=1040660");
                        startActivity(i);
                        return false;

                    }
                });
            }
            else if (id ==R.id.short6){
                short6.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v1) {
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("img",R.drawable.short6);
                        i.putExtra("title","Yellow garden ");
                        i.putExtra("Descreption","Going wild in shorts , who does not like that , this short is a good preposition for you to go wild" );
                        i.putExtra("delivery","we have a delivary service to all the wilayas 1 we can reach you at home only in 15 days maximum and it is for free ");
                        i.putExtra("link","https://www.amazon.com/Womens-Clothing/b?ie=UTF8&node=1040660");
                        startActivity(i);
                        return false;
                    }
                });
            }
            else if (id ==R.id.conversepic){
                conversepic.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v1) {
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("img",R.drawable.conversepic);
                        i.putExtra("title","Rainbow ");
                        i.putExtra("Descreption","Perfect for swag styles , original, confortable and cozy at once , add this to your shoes colloction and you won't regret it " );
                        i.putExtra("delivery","we have a delivary service to all the wilayas 1 we can reach you at home only in 15 days maximum and it is for free ");
                        i.putExtra("link","https://www.amazon.com/Womens-Clothing/b?ie=UTF8&node=1040660");
                        startActivity(i);
                        return false;
                    }
                });
            }
            else if (id ==R.id.converse3){
                converse3.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v1) {
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("img",R.drawable.converse3);
                        i.putExtra("title","Calma ");
                        i.putExtra("Descreption","It gives the feeling of peace, with its adorable color and hight quality this converse is a great option " );
                        i.putExtra("delivery","we have a delivary service to all the wilayas 1 we can reach you at home only in 15 days maximum and it is for free ");
                        i.putExtra("link","https://www.amazon.com/Womens-Clothing/b?ie=UTF8&node=1040660");
                        startActivity(i);
                        return false;
                    }
                });
            }
            else if (id ==R.id.converse8){
                converse8.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v1) {
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("img",R.drawable.converse8);
                        i.putExtra("title","Blue bees");
                        i.putExtra("Descreption","Hight quality, confortable and cute yellow converse with little bees drawings " );
                        i.putExtra("delivery","we have a delivary service to all the wilayas 1 we can reach you at home only in 15 days maximum and it is for free ");
                        i.putExtra("link","https://www.amazon.com/Womens-Clothing/b?ie=UTF8&node=1040660");
                        startActivity(i);
                        return false;
                    }
                });
            }
            else if (id ==R.id.converse6){
                converse6.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v1) {
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("img",R.drawable.converse6);
                        i.putExtra("title","Suicide squade");
                        i.putExtra("Descreption","Who is not in love with suicide squad since 2016 , if you are one don't miss this piece of art" );
                        i.putExtra("delivery","we have a delivary service to all the wilayas 1 we can reach you at home only in 15 days maximum and it is for free ");
                        i.putExtra("link","https://www.amazon.com/Womens-Clothing/b?ie=UTF8&node=1040660");
                        startActivity(i);
                        return false;
                    }
                });
            }


            return false;
        }
    };


        View.OnClickListener L = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int idtoast = v.getId();
                Context context =getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast price;
                CharSequence text ;
                if (idtoast==R.id.toppic ) {
                    text="1000DA";
                }
                else if (idtoast==R.id.top3){
                    text= "1000DA";
                }
                else if (idtoast==R.id.top5){
                    text= "1000DA";
                }
                else if (idtoast==R.id.top8){
                    text= "1000DA";
                }
                else if (idtoast==R.id.top9){
                    text= "1000DA";
                }
                else if (idtoast==R.id.shortpic){
                    text= "1000DA";
                }
                else if (idtoast==R.id.short2){
                    text= "1000DA";
                }
                else if (idtoast==R.id.short3){
                    text= "1000DA";
                }
                else if (idtoast==R.id.short6){
                    text= "1000DA";}

                    else if (idtoast==R.id.short1){
                        text= "1000DA";
                }
                else if (idtoast==R.id.conversepic){
                    text="1000DA";
                }
                else if (idtoast==R.id.converse3){
                    text="1000DA";
                }
                else if (idtoast==R.id.converse6){
                    text="1000DA";
                }
                else if (idtoast==R.id.converse8){
                    text="1000DA";
                }
                else{text="";}
                price=Toast.makeText(context,text,duration);
                price.show();
            }
        };

        top5.setOnLongClickListener(listener);
        top3.setOnLongClickListener(listener);
        toppic.setOnLongClickListener(listener);
        top8.setOnLongClickListener(listener);
        top9.setOnLongClickListener(listener);
        shortpic.setOnLongClickListener(listener);
        short3.setOnLongClickListener(listener);
        short2.setOnLongClickListener(listener);
        short6.setOnLongClickListener(listener);
        short1.setOnLongClickListener(listener);
        conversepic.setOnLongClickListener(listener);
        converse3.setOnLongClickListener(listener);
        converse6.setOnLongClickListener(listener);
        converse8.setOnLongClickListener(listener);


        toppic.setOnClickListener(L);
        top3.setOnClickListener(L);
        top5.setOnClickListener(L);
        top8.setOnClickListener(L);
        top9.setOnClickListener(L);
        shortpic.setOnClickListener(L);
        short3.setOnClickListener(L);
        short2.setOnClickListener(L);
        short6.setOnClickListener(L);
        short1.setOnClickListener(L);
        conversepic.setOnClickListener(L);
        converse3.setOnClickListener(L);
        converse6.setOnClickListener(L);
        converse8.setOnClickListener(L);


    }


    @Override
    protected void onRestart() {
        super.onRestart();
        mediaPlayer.start();
    }
    @Override
    protected void onStop() {
        super.onStop();
        mediaPlayer.pause();
    }






}





