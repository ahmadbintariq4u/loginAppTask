
package com.example.loginscreentask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class WelcomeScreen extends AppCompatActivity {

    TextView name1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        name1=findViewById(R.id.hold);

        Bundle bundle=getIntent().getExtras();
        String name=bundle.getString("name");

        name1.setText(name);

    }




}