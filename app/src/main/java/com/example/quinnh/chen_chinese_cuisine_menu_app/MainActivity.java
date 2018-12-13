package com.example.quinnh.chen_chinese_cuisine_menu_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageButton btn_menu = (ImageButton) findViewById(R.id.btn_menu);
        final ImageButton btn_member = (ImageButton) findViewById(R.id.btn_member);

        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(MainActivity.this, MainMenu.class);
                startActivity(nextScreen);

            }
        });

        btn_member.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(MainActivity.this, MemberRegister.class);
                startActivity(nextScreen);

            }
        });
    }
}
