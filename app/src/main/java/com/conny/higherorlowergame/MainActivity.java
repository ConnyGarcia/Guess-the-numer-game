package com.conny.higherorlowergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random ;
import android.text.InputFilter;

public class MainActivity extends AppCompatActivity {

    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        num = rand.nextInt(21);
    }

    public void Toastie(String string){
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

    public void EnterNum (View view){

        EditText Number = (EditText) findViewById(R.id.Number);
        Number.setFilters(new InputFilter[]{new InputFilterMinMax("0", "20")});

        int guessNumber = Integer.parseInt(Number.getText().toString());

        if (num < guessNumber) {
            Toastie("Lower!");
        }
        else if (num > guessNumber){
            Toastie("Higher!");
        }
        else {
            Toastie("You got it winner!");
        }

    }
}
