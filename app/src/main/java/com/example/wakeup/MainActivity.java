package com.example.wakeup;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

// НЕ  ЗАБУДЬ ОТКЛЮЧИТЬ ДЕБАГ НА 82-Й СТРОКЕ
public class MainActivity extends AppCompatActivity {

    String code = "";
    int counter = 0;
    int fuckingcounter = 0;
    String logflag = "!! WATCH THIS !! WATCH THIS !! WATCH THIS !! WATCH THIS !! WATCH THIS !! WATCH THIS !! WATCH THIS !! WATCH THIS !! WATCH THIS !! WATCH THIS !! WATCH THIS !! WATCH THIS !! WATCH THIS !! WATCH THIS !! WATCH THIS !! WATCH THIS !! WATCH THIS !! WATCH THIS !! WATCH THIS !! WATCH THIS !! WATCH THIS !! WATCH THIS !! WATCH THIS !! WATCH THIS !! WATCH THIS !! WATCH THIS !! WATCH THIS !! WATCH THIS !!";


    public void code_equals(){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.nigger );

        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        TextView txt1 = findViewById(R.id.txt1);
        mediaPlayer.setVolume(100,100);
        Button btnR = findViewById(R.id.btnR);
        Button btny = findViewById(R.id.btny);
        Button btna = findViewById(R.id.btna);
        Button btnn = findViewById(R.id.btnn);

        if(code.equals("111111")) {
            btnR.setVisibility(View.VISIBLE);

        }else if(code.equals("123456789")){
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.nigger);
            videoView.setVisibility(View.VISIBLE);
            videoView.start();

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView logo = findViewById(R.id.logo);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btnR = findViewById(R.id.btnR);
        Button btny = findViewById(R.id.btny);
        Button btna = findViewById(R.id.btna);
        Button btnn = findViewById(R.id.btnn);

        Button btndone = findViewById(R.id.btndone);
        TextView txt1 = findViewById(R.id.txt1);
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.nigger );
        VideoView videoView = (VideoView) findViewById(R.id.videoView);

        btndone.setOnClickListener(view -> {
            fuckingcounter += 1;
            if (code.equals("") && fuckingcounter == 1) {
                Toast.makeText(MainActivity.this, R.string.error1, Toast.LENGTH_LONG).show();
            } else if (code.equals("") && fuckingcounter == 2) {
                Toast.makeText(MainActivity.this, R.string.error2, Toast.LENGTH_LONG).show();
            } else if (code.equals("") && fuckingcounter >= 3) {
                Toast.makeText(MainActivity.this, R.string.error3, Toast.LENGTH_LONG).show();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.exit(0);
            } else {
                Toast.makeText(MainActivity.this, R.string.error4, Toast.LENGTH_LONG).show();
                System.out.println(logflag);
                System.out.println(counter);
                System.out.println(code);
                System.out.println(logflag);
                code = "";
                counter = 0;
                fuckingcounter = 0;
                logo.setText("Код состоит из 6 знаков");
                mediaPlayer.stop();
                txt1.setVisibility(View.INVISIBLE);
                videoView.setVisibility(View.INVISIBLE);

            }
        });
        btnR.setOnClickListener(view -> {
            btny.setVisibility(View.VISIBLE);
            btnR.setVisibility(View.INVISIBLE);

        });

        btny.setOnClickListener(view -> {
            btna.setVisibility(View.VISIBLE);
            btny.setVisibility(View.INVISIBLE);

        });

        btna.setOnClickListener(view -> {
            btnn.setVisibility(View.VISIBLE);
            btna.setVisibility(View.INVISIBLE);

        });

        btnn.setOnClickListener(view -> {
            btnn.setVisibility(View.INVISIBLE);
            logo.setText("Райан Гослинг");
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ryan);
            videoView.setVisibility(View.VISIBLE);
            videoView.start();

        });

        btn1.setOnClickListener(view -> {
            code = code + "1";
            counter = counter + 1;
            code_equals();

        });
        btn2.setOnClickListener(view -> {
            code = code + "2";
            counter = counter + 1;
            code_equals();

        });
        btn9.setOnClickListener(view -> {
            code = code + "9";
            counter = counter + 1;
            code_equals();

        });
        btn3.setOnClickListener(view -> {
            code = code + "3";
            counter = counter + 1;
            code_equals();

        });
        btn4.setOnClickListener(view -> {
            code = code + "4";
            counter = counter + 1;
            code_equals();

        });
        btn5.setOnClickListener(view -> {
            code = code + "5";
            counter = counter + 1;
            code_equals();

        });
        btn6.setOnClickListener(view -> {
            code = code + "6";
            counter = counter + 1;
            code_equals();

        });
        btn7.setOnClickListener(view -> {
            code = code + "7";
            counter = counter + 1;
            code_equals();

        });
        btn8.setOnClickListener(view -> {
            code = code + "8";
            counter = counter + 1;
            code_equals();

        });








    }




}












