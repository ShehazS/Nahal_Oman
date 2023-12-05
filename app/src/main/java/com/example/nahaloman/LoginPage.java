package com.example.nahaloman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.nahaloman.databinding.ActivityLoginPageBinding;

public class LoginPage extends AppCompatActivity {

    TextView textView;
    EditText username,password;
    ImageView imageView;
    Button button;
    String un,pw,iun,ipw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        button = (Button)findViewById(R.id.lbtn);
        username=(EditText)findViewById(R.id.etext);
        password=(EditText)findViewById(R.id.ptext);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                un = username.getText().toString();
                pw = password.getText().toString();
                iun = "buss";
                ipw = "cust";
                if(un.equals(iun) && pw.equals(iun))
                {
                    Intent intent=new Intent(LoginPage.this,MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(LoginPage.this,"Going to Business Home:)", Toast.LENGTH_SHORT).show();
                }
                else if(un.equals(ipw) && pw.equals(ipw))
                {
                    Intent intent=new Intent(LoginPage.this,CusMainActivity.class);
                    startActivity(intent);
                    Toast.makeText(LoginPage.this,"Going to Customer Home:)", Toast.LENGTH_SHORT).show();
                }

            }
        });
        textView=(TextView)findViewById(R.id.nuser);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginPage.this,NewUserType.class);
                startActivity(intent);
            }
        });



    }
}