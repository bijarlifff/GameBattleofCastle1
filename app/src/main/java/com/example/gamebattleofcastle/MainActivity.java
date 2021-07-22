package com.example.gamebattleofcastle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.gamebattleofcastle.Gameplay.Castle;
import com.example.gamebattleofcastle.Gameplay.CavalryCastle;
import com.example.gamebattleofcastle.Gameplay.InfantryCastle;

public class MainActivity extends AppCompatActivity {

    Button btnFight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CavalryCastle c1 = new CavalryCastle();
        InfantryCastle c2 = new InfantryCastle();



        Castle fightingCastles[] = new Castle[2];
        fightingCastles[0] = c2;
        fightingCastles[1] = c1;

        btnFight = findViewById(R.id.btnFight);
        btnFight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Player 1 WIN", Toast.LENGTH_SHORT).show();
            }
        });

    }

}