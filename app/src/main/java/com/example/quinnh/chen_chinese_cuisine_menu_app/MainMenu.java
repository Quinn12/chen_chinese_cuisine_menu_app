package com.example.quinnh.chen_chinese_cuisine_menu_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        final Button btn_cancel = (Button) findViewById(R.id.btn_cancel);
        final Button btn_payment = (Button) findViewById(R.id.btn_payment);

        final Spinner aptz_spin = (Spinner) findViewById(R.id.appz_spin);
        final Spinner drink_spin = (Spinner) findViewById(R.id.drinks_spin);
        final Spinner soup_spin = (Spinner) findViewById(R.id.soup_spin);
        final Spinner chick_spin = (Spinner) findViewById(R.id.chick_spin);
        final Spinner pork_spin = (Spinner) findViewById(R.id.pork_spin);
        final Spinner sea_spin = (Spinner) findViewById(R.id.sea_spin);

        final EditText quant_appz = (EditText) findViewById(R.id.quant_appz);
        final EditText quant_drink = (EditText) findViewById(R.id.quant_drink);
        final EditText quant_chick = (EditText) findViewById(R.id.quant_chick);
        final EditText quant_pork = (EditText) findViewById(R.id.quant_pork);
        final EditText quant_sea = (EditText) findViewById(R.id.quant_sea);
        final EditText quant_soup = (EditText) findViewById(R.id.quant_soup);

        double TotalPrice = 0;

        if(aptz_spin.getSelectedItem().toString().equals("King egg roll $1.85"))
        {
            TotalPrice = TotalPrice + 1.85 * Double.parseDouble(quant_appz.getText().toString());
        }
        if(aptz_spin.getSelectedItem().toString().equals("Vegetable spring egg rolls(2) $3.25"))
        {
            TotalPrice = TotalPrice + 3.25 * Double.parseDouble(quant_appz.getText().toString());
        }
        if(aptz_spin.getSelectedItem().toString().equals("King egg roll $1.85"))
        {
            TotalPrice = TotalPrice + 1.85 * Double.parseDouble(quant_appz.getText().toString());
        }
        if(aptz_spin.getSelectedItem().toString().equals("King egg roll $1.85"))
        {
            TotalPrice = TotalPrice + 1.85 * Double.parseDouble(quant_appz.getText().toString());
        }
        if(aptz_spin.getSelectedItem().toString().equals("King egg roll $1.85"))
        {
            TotalPrice = TotalPrice + 1.85 * Double.parseDouble(quant_appz.getText().toString());
        }
        if(aptz_spin.getSelectedItem().toString().equals("King egg roll $1.85"))
        {
            TotalPrice = TotalPrice + 1.85 * Double.parseDouble(quant_appz.getText().toString());
        }

        btn_payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(MainMenu.this, PaymentConfirm.class);
                startActivity(nextScreen);

            }
        });

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(MainMenu.this, MainActivity.class);
                startActivity(nextScreen);

            }
        });
    }
}
