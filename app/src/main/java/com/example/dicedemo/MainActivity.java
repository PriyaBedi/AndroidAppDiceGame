package com.example.dicedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.util.Log;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // we have two images left dice and right dice

        final ImageView leftDie = findViewById(R.id.Left_dice);
        final ImageView rightDie = findViewById(R.id.right_dice);
        Button lower = findViewById(R.id.low_button);
        Button higher=findViewById(R.id.high_button);

        final TextView res=findViewById(R.id.result);
        //-------------------------------------------------------------------

        final int [] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};
        // we want to pick one of the dices in array randomly and replace it with left and right
        // image view inside your app!
        // Click listener look for an event on your view components.
        lower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rand = new Random();
                int randLeftDie = rand.nextInt(6);
                int randRightDie = rand.nextInt(6);
                Log.d("left die",String.valueOf(randLeftDie));
                Log.d("right die",String.valueOf(randRightDie));

                leftDie.setImageResource(diceArray[randLeftDie]);
                rightDie.setImageResource(diceArray[randRightDie]);
                // we need to create a random integer for picking the dices randomly!

                if(randLeftDie>randRightDie){
                    res.setText("USER WINS!!");

                }
                else if(randLeftDie==randRightDie){
                    res.setText("OOPS!! ITS A TIE!!");

                }
                else{
                    res.setText("COMPUTER WINS!!");
                }


            }
        });

        higher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rand = new Random();
                int randLeftDie = rand.nextInt(6);
                int randRightDie = rand.nextInt(6);
                Log.d("left die",String.valueOf(randLeftDie));
                Log.d("right die",String.valueOf(randRightDie));

                leftDie.setImageResource(diceArray[randLeftDie]);
                rightDie.setImageResource(diceArray[randRightDie]);
                // we need to create a random integer for picking the dices randomly!

                if(randLeftDie>randRightDie){
                    res.setText("COMPUTER WINS!!");

                }
                else if(randLeftDie==randRightDie){
                    res.setText("OOPS!! ITS A TIE!!");

                }
                else{
                    res.setText("USER WINS!!");
                }


            }
        });
    }



}
