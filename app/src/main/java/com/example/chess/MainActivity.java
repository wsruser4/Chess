package com.example.chess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int[] x = {1,2,3,4,5,6,7,8};
    public int[] y = {1,2,3,4,5,6,7,8};
    public ImageView white_pawn_1, white_pawn_2, white_pawn_3, white_pawn_4, white_pawn_5, white_pawn_6, white_pawn_7, white_pawn_8;
    public ImageView black_pawn_1, black_pawn_2, black_pawn_3, black_pawn_4, black_pawn_5, black_pawn_6, black_pawn_7, black_pawn_8;
    public ImageView a3;
    public int active = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        white_pawn_1 = findViewById(R.id.white_pawn_1);
        white_pawn_2 = findViewById(R.id.white_pawn_2);
        white_pawn_3 = findViewById(R.id.white_pawn_3);
        white_pawn_4 = findViewById(R.id.white_pawn_4);
        white_pawn_5 = findViewById(R.id.white_pawn_5);
        white_pawn_6 = findViewById(R.id.white_pawn_6);
        white_pawn_7 = findViewById(R.id.white_pawn_7);
        white_pawn_8 = findViewById(R.id.white_pawn_8);

        black_pawn_1 = findViewById(R.id.black_pawn_1);
        black_pawn_2 = findViewById(R.id.black_pawn_2);
        black_pawn_3 = findViewById(R.id.black_pawn_3);
        black_pawn_4 = findViewById(R.id.black_pawn_4);
        black_pawn_5 = findViewById(R.id.black_pawn_5);
        black_pawn_6 = findViewById(R.id.black_pawn_6);
        black_pawn_7 = findViewById(R.id.black_pawn_7);
        black_pawn_8 = findViewById(R.id.black_pawn_8);

        a3 = findViewById(R.id.a3);


    }

    public void white_pawn_1_active(View view) {
        active = 9;
    }

    public void a3_active(View view) {
        if (active == 9) {
            //white_pawn_1.draw(a3);
        }
    }

}