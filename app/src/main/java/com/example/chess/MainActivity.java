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
    public ImageView white_king, black_king, white_queen, black_queen, white_bishop_left, white_bishop_right, black_bishop_left, black_bishop_right, white_knight_left, white_knight_right, black_knight_left, black_knight_right, white_rook_left, white_rook_right, black_rook_right;

    public ImageView a8, b8, c8, d8, e8, f8, g8, h8;
    public ImageView a7, b7, c7, d7, e7, f7, g7, h7;
    public ImageView a6, b6, c6, d6, e6, f6, g6, h6;
    public ImageView a5, b5, c5, d5, e5, f5, g5, h5;
    public ImageView a4, b4, c4, d4, e4, f4, g4, h4;
    public ImageView a3, b3, c3, d3, e3, f3, g3, h3;
    public ImageView a2, b2, c2, d2, e2, f2, g2, h2;
    public ImageView a1, b1, c1, d1, e1, f1, g1, h1;

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

        white_king = findViewById(R.id.white_king);
        white_queen = findViewById(R.id.white_queen);
        white_bishop_left = findViewById(R.id.white_bishop_left);
        white_bishop_right = findViewById(R.id.white_bishop_right);
        white_knight_left = findViewById(R.id.white_knight_left);
        white_knight_right = findViewById(R.id.white_knight_right);
        white_rook_left = findViewById(R.id.white_rook_left);
        white_rook_right = findViewById(R.id.white_rook_right);

        a1 = findViewById(R.id.a1);
        b1 = findViewById(R.id.b1);
        c1 = findViewById(R.id.c1);
        d1 = findViewById(R.id.d1);
        e1 = findViewById(R.id.e1);
        f1 = findViewById(R.id.f1);
        g1 = findViewById(R.id.g1);
        d1 = findViewById(R.id.h1);

        a2 = findViewById(R.id.a2);
        b2 = findViewById(R.id.b2);
        c2 = findViewById(R.id.c2);
        d2 = findViewById(R.id.d2);
        e2 = findViewById(R.id.e2);
        f2 = findViewById(R.id.f2);
        g2 = findViewById(R.id.g2);
        d2 = findViewById(R.id.h2);

        a3 = findViewById(R.id.a3);
        b3 = findViewById(R.id.b3);
        c3 = findViewById(R.id.c3);
        d3 = findViewById(R.id.d3);
        e3 = findViewById(R.id.e3);
        f3 = findViewById(R.id.f3);
        g3 = findViewById(R.id.g3);
        d3 = findViewById(R.id.h3);

        a4 = findViewById(R.id.a4);
        b4 = findViewById(R.id.b4);
        c4 = findViewById(R.id.c4);
        d4 = findViewById(R.id.d4);
        e4 = findViewById(R.id.e4);
        f4 = findViewById(R.id.f4);
        g4 = findViewById(R.id.g4);
        d4 = findViewById(R.id.h4);


        a5 = findViewById(R.id.a5);
        b5 = findViewById(R.id.b5);
        c5 = findViewById(R.id.c5);
        d5 = findViewById(R.id.d5);
        e5 = findViewById(R.id.e5);
        f5 = findViewById(R.id.f5);
        g5 = findViewById(R.id.g5);
        d5 = findViewById(R.id.h5);

        a6 = findViewById(R.id.a6);
        b6 = findViewById(R.id.b6);
        c6 = findViewById(R.id.c6);
        d6 = findViewById(R.id.d6);
        e6 = findViewById(R.id.e6);
        f6 = findViewById(R.id.f6);
        g6 = findViewById(R.id.g6);
        d6 = findViewById(R.id.h6);

        a7 = findViewById(R.id.a7);
        b7 = findViewById(R.id.b7);
        c7 = findViewById(R.id.c7);
        d7 = findViewById(R.id.d7);
        e7 = findViewById(R.id.e7);
        f7 = findViewById(R.id.f7);
        g7 = findViewById(R.id.g7);
        d7 = findViewById(R.id.h7);

        a8 = findViewById(R.id.a8);
        b8 = findViewById(R.id.b8);
        c8 = findViewById(R.id.c8);
        d8 = findViewById(R.id.d8);
        e8 = findViewById(R.id.e8);
        f8 = findViewById(R.id.f8);
        g8 = findViewById(R.id.g8);
        d8 = findViewById(R.id.h8);

    }

    public void white_pawn_1_active(View view) {
        active = 9;
    }

    public void a3_active(View view) {
        if (active == 9) {
            a3.setImageResource(R.drawable.white_pawn);
            white_pawn_1.setImageResource(R.drawable.empty);
        }
    }

}