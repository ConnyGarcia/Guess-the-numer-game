package com.conny.higerorlowergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random ;
import android.text.InputFilter;
import android.text.Spanned;

public class MainActivity extends AppCompatActivity {

    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        num = rand.nextInt(21);
    }

    public void EnterNum (View view){

        EditText Number = (EditText) findViewById(R.id.Number);
        Number.setFilters(new InputFilter[]{new InputFilterMinMax("0", "20")});

        int guessNumber = Integer.parseInt(Number.getText().toString());

        if (num < guessNumber) {
            Toast.makeText(this, "Lower", Toast.LENGTH_SHORT).show();
        }
        else if (num > guessNumber){
            Toast.makeText(this, "Higher", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "You got it!", Toast.LENGTH_SHORT).show();
        }

    }
}
