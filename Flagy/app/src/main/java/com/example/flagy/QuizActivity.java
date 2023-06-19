package com.example.flagy;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class QuizActivity extends AppCompatActivity {




    private  int collectionNumber=1;
    private  int score = 0;

    //Yes, if two classes belong to the same lifecycle (such as two activities or two services)
    // within an Android application, they will typically share the same application context.
    // The application context represents the overall context of the application,
    // regardless of the specific component or class within it.
    // and they must be inside the on create so that there will be an application context


    private Map <String,String>countries ;
    private Map <String,Object>countryDrawables;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_activity);


        countries = MapUtils.loadMap1(getApplicationContext());
        countryDrawables = MapUtils.loadMap2(getApplicationContext());

        // print countryDrawables (DEBUG)
//        for (Map.Entry<String, Object> entry : countryDrawables.entrySet()) {
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }

        // Initialize UI elements


        TextView scoreTextView = findViewById(R.id.score_text);

        TextView content_text = findViewById(R.id.content_text);


        scoreTextView.setText("Score: "+ score);

        Flag[] flags = new Flag[4];

        Button button1 = findViewById(R.id.ans_1);
        Button button2 = findViewById(R.id.ans_2);
        Button button3 = findViewById(R.id.ans_3);
        Button button4 = findViewById(R.id.ans_4);

        reset(flags);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(button1, flags, scoreTextView,content_text);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(button2, flags, scoreTextView,content_text);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(button3, flags, scoreTextView,content_text);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(button4, flags, scoreTextView,content_text);
            }
        });



    }

    private void reset(Flag[] flags ) {
        ImageView flagImageView =  findViewById(R.id.flag_image);

        Button button1 = findViewById(R.id.ans_1);
        Button button2 = findViewById(R.id.ans_2);
        Button button3 = findViewById(R.id.ans_3);
        Button button4 = findViewById(R.id.ans_4);



        Flag[] generatedFlags = generateFlagQuestion(flags);

        button1.setText(generatedFlags[0].getName());
        button2.setText(generatedFlags[1].getName());
        button3.setText(generatedFlags[2].getName());
        button4.setText(generatedFlags[3].getName());

        for (Flag item : generatedFlags){
            if(item.getAnswer()){
                try {
                    int imageId = getResources().getIdentifier(item.getst(), "drawable", getPackageName());
                    flagImageView.setImageResource(imageId);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

        button1.setBackgroundColor(Color.GRAY);
        button2.setBackgroundColor(Color.GRAY);
        button3.setBackgroundColor(Color.GRAY);
        button4.setBackgroundColor(Color.GRAY);

    }



    private Flag[] generateFlagQuestion( Flag[] flags){

        ArrayList<String> keys = new ArrayList<>(countries.keySet());

        // shuffle the keys in the list
        Collections.shuffle(keys);

        // get the first four keys
        ArrayList<String> selectedKeys = new ArrayList<>(keys.subList(0, 4));



        // create Flag objects for each key
        for (int i = 0; i < selectedKeys.size(); i++) {
            String name = (String) countries.get(selectedKeys.get(i));
            String imgSrc = "drawable/" + selectedKeys.get(i);

            flags[i] = new Flag(name,0, false,selectedKeys.get(i).toLowerCase());
        }


        int correctAnswerIndex = new Random().nextInt(4);
        System.out.println(  "#####################################################");
        System.out.println(  "CORRECT ANSWER:" +flags[correctAnswerIndex].getName());
        System.out.println(  "#####################################################");
        // set the value of the answer for the correct flag to true
        flags[correctAnswerIndex].setAnswer(true);

        return flags;

    }


    public void checkAnswer(Button clickedButton, Flag[] flags, TextView scoreTextView, TextView content_text) {
        String clickedButtonName = clickedButton.getText().toString();
        Flag correctAnswer = null;

        for (Flag flag : flags) {
            if (flag.getAnswer()) {
                correctAnswer = flag;
                break;
            }
        }

        if (clickedButtonName.equals(correctAnswer.getName())) {
            clickedButton.setBackgroundColor(Color.GREEN);
            score++;
            scoreTextView.setText("Score: " + score);
        } else {
            clickedButton.setBackgroundColor(Color.RED);
        }

        // Set a Timer to change the button color back to its original color after a delay
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        clickedButton.setBackgroundColor(Color.WHITE);
                        if (collectionNumber >= 25) {
                            finish();
                        } else {
                            content_text.setText(collectionNumber + "/25");
                            reset(generateFlagQuestion(flags));
                        }
                    }
                });
            }
        }, 500); // Delay the Timer by 0.5 second (adjust as needed) so you can see the color

        collectionNumber++;
    }

    @Override
    public void onBackPressed() {
        showConfirmationDialog();
    }

    private void showConfirmationDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to go back?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // If the user confirms, close the activity
                        QuizActivity.super.onBackPressed();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // If the user cancels, dismiss the dialog
                        dialog.dismiss();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
