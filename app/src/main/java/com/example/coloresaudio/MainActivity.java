package com.example.coloresaudio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    ViewPager pager;
    Button Color1,Color2,Color3,Color4,Color5,
            Color6, Color7, Color8, Color9, Color10;
    MediaPlayer Sonido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = findViewById(R.id.ViewPager);
        Color1 = findViewById(R.id.amarillo);
        Color2 = findViewById(R.id.azul);
        Color3 = findViewById(R.id.blanco);
        Color4 = findViewById(R.id.cafe);
        Color5 = findViewById(R.id.morado);
        Color6 = findViewById(R.id.naranja);
        Color7 = findViewById(R.id.negro);
        Color8 = findViewById(R.id.rojo);
        Color9 = findViewById(R.id.rosado);
        Color10 = findViewById(R.id.verde);
        Color1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Sonido != null){
                    if (Sonido.isPlaying()){
                        Sonido.release();
                        Sonido = null;
                    }
                }
                Sonido = MediaPlayer.create(MainActivity.this, R.raw.amarillo);
                Sonido.start();
                Color1.setBackgroundColor(Color.parseColor("#ffff00"));
            }
        });
        Color2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Sonido != null){
                    if (Sonido.isPlaying()){
                        Sonido.release();
                        Sonido = null;
                    }
                }
                Sonido = MediaPlayer.create(MainActivity.this, R.raw.azul);
                Sonido.start();
                Color2.setBackgroundColor(Color.parseColor("#0000FF"));
            }
        });
        Color3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Sonido != null){
                    if (Sonido.isPlaying()){
                        Sonido.release();
                        Sonido = null;
                    }
                }
                Sonido = MediaPlayer.create(MainActivity.this, R.raw.blanco);
                Sonido.start();
                Color3.setBackgroundColor(Color.parseColor("#FFFFFF"));
            }
        });
        Color4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Sonido != null){
                    if (Sonido.isPlaying()){
                        Sonido.release();
                        Sonido = null;
                    }
                }
                Sonido = MediaPlayer.create(MainActivity.this, R.raw.cafe);
                Sonido.start();
                Color4.setBackgroundColor(Color.parseColor("#6F4E37"));
            }
        });
        Color5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Sonido != null){
                    if (Sonido.isPlaying()){
                        Sonido.release();
                        Sonido = null;
                    }
                }
                Sonido = MediaPlayer.create(MainActivity.this, R.raw.morado);
                Sonido.start();
                Color5.setBackgroundColor(Color.parseColor("#800080"));
            }
        });
        Color6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Sonido != null){
                    if (Sonido.isPlaying()){
                        Sonido.release();
                        Sonido = null;
                    }
                }
                Sonido = MediaPlayer.create(MainActivity.this, R.raw.naranja);
                Sonido.start();
                Color6.setBackgroundColor(Color.parseColor("#FF8000"));
            }
        });
        Color7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Sonido != null){
                    if (Sonido.isPlaying()){
                        Sonido.release();
                        Sonido = null;
                    }
                }
                Sonido = MediaPlayer.create(MainActivity.this, R.raw.negro);
                Sonido.start();
                Color7.setBackgroundColor(Color.parseColor("#000000"));
            }
        });
        Color8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Sonido != null){
                    if (Sonido.isPlaying()){
                        Sonido.release();
                        Sonido = null;
                    }
                }
                Sonido = MediaPlayer.create(MainActivity.this, R.raw.rojo);
                Sonido.start();
                Color8.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        Color9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Sonido != null){
                    if (Sonido.isPlaying()){
                        Sonido.release();
                        Sonido = null;
                    }
                }
                Sonido = MediaPlayer.create(MainActivity.this, R.raw.rosado);
                Sonido.start();
                Color9.setBackgroundColor(Color.parseColor("#ff0080"));
            }
        });
        Color10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Sonido != null){
                    if (Sonido.isPlaying()){
                        Sonido.release();
                        Sonido = null;
                    }
                }
                Sonido = MediaPlayer.create(MainActivity.this, R.raw.verde);
                Sonido.start();
                Color10.setBackgroundColor(Color.parseColor("#008000"));
            }
        });
    }
}