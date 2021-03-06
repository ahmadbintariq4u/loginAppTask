package com.example.loginscreentask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    TextView userName;
    TextView password;

    String userNames[]={"arslan","ahmad","muhammad","hamad","bilal","naeem"};
    String passwords[]={"arslan1","ahmad1","muhammad1","hamad1","bilal1","naeem1"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName=findViewById(R.id.username);
        password=findViewById(R.id.password);
    }


    public void login(View view) {

        String name=userName.getText().toString();
        String pass=password.getText().toString();

        int index=-1;

        for(int a=0; a<userNames.length; a++) {
            if (name.equalsIgnoreCase(userNames[a])) {

                index=a;
                Snackbar.make(view, "User_Found", Snackbar.LENGTH_LONG).show();
                if(password.getText().toString().equalsIgnoreCase(passwords[index])){
                    Intent intent=new Intent(this,WelcomeScreen.class);
                    intent.putExtra("name",userNames[index]);
                    startActivity(intent);
                }else{
                    Snackbar.make(view, "Password Not Matched", Snackbar.LENGTH_LONG).show();
                }

            }

        }

        if(index==-1){

            Snackbar.make(view, "User Not Found", Snackbar.LENGTH_LONG).show();
        }



    }




}