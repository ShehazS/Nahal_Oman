package com.example.nahaloman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NewUserType extends AppCompatActivity {

    ImageView imageView,imageView6,imageView2;
    TextView textView,textoverlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user_type);



        imageView6=(ImageView)findViewById(R.id.imageView6);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NewUserType.this,LoginPage.class);
                startActivity(intent);
                Toast.makeText(NewUserType.this,"Going to back to Login Page", Toast.LENGTH_SHORT).show();
            }
        });

        imageView=(ImageView)findViewById(R.id.imageView5);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NewUserType.this,customer_register.class);
                startActivity(intent);
                Toast.makeText(NewUserType.this,"Going to Customer Registration", Toast.LENGTH_SHORT).show();
            }
        });

        imageView2 = (ImageView)findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(NewUserType.this,business_registeration.class);
                startActivity(intent);
                Toast.makeText(NewUserType.this,"Going to Business Registration", Toast.LENGTH_SHORT).show();
            }
        });

        textoverlay = (TextView)findViewById(R.id.textOverlay);
        textoverlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(NewUserType.this,business_registeration.class);
                startActivity(intent);
                Toast.makeText(NewUserType.this,"Going to Business Registration", Toast.LENGTH_SHORT).show();
            }
        });
        textView=(TextView)findViewById(R.id.textOverlay3);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NewUserType.this,customer_register.class);
                startActivity(intent);
                Toast.makeText(NewUserType.this,"Going to Customer Registration", Toast.LENGTH_SHORT).show();
            }
        });

    }
}