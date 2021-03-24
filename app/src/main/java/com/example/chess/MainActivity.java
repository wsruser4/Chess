package com.example.chess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int[] x = {1,2,3,4,5,6,7,8};
    private int[] y = {1,2,3,4,5,6,7,8};
    private TextView white_pawn_1, white_pawn_2, white_pawn_3, white_pawn_4, white_pawn_5, white_pawn_6, white_pawn_7, white_pawn_8;
    private TextView black_pawn_1, black_pawn_2, black_pawn_3, black_pawn_4, black_pawn_5, black_pawn_6, black_pawn_7, black_pawn_8;

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


    }
}