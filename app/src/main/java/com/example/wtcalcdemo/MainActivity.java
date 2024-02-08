package com.example.wtcalcdemo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setLogo(R.mipmap.ic_launcher_wt_round);
        actionBar.setTitle(R.string.txtTitle);

        TextView txtViewResults = findViewById(R.id.txtViewResults);
        EditText editTextInputWt = findViewById(R.id.editTextInputWt);
        RadioGroup radGroupConv = findViewById(R.id.radGroupConv);
        Button btnConvertWt = findViewById(R.id.btnConvertWt);
        radGroupConv.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radBtnKgsToLbs){
                    Toast.makeText(MainActivity.this,"Let us convert Kilo to Pound",
                            Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.radBtnLbsToKgs) {
                    Toast.makeText(MainActivity.this,"Let us convert Pounds to Kilo",
                            Toast.LENGTH_SHORT).show();

                }
            }
        });

        // -1 if nothing is onContextID
        // -> R.id.radBtnKgtoLbs if that button is check
        // -> R.id.radBtnLbToKg if that button is check
        radGroupConv.getCheckedRadioButtonId();


        btnConvertWt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radGroupConv.getCheckedRadioButtonId() == -1) {
                    //radio button group is not checked
                    Toast.makeText(MainActivity.this,"Please choose calculation",
                            Toast.LENGTH_SHORT).show();
                }
                else if (radGroupConv.getCheckedRadioButtonId() == R.id.radBtnKgsToLbs) {
                    //option kg to pounds selected
                    Toast.makeText(MainActivity.this,"Kg to Pound selected",
                            Toast.LENGTH_SHORT).show();
                }
                else if (radGroupConv.getCheckedRadioButtonId() == R.id.radBtnLbsToKgs) {
                    //option pound to kg selected
                    Toast.makeText(MainActivity.this,"Kg to Pound selected",
                            Toast.LENGTH_SHORT).show();
                    //test
                }
            }
        });
    }
}