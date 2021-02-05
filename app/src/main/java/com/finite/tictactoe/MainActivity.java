package com.finite.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    ImageView box00,box01,box02,box10,box11,box12,box20,box21,box22;
    public boolean isXturn = false;

    public boolean is00Done,is01Done,is02Done,is10Done,is11Done,is12Done
            ,is20Done,is21Done,is22Done;

    public int set00 =2,set01 =2,set02 =2,set10 =2,set11 =2,set12 =2,set20 =2,set21 =2,set22 =2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init() {
        box00 = findViewById(R.id.box00);
        box01 = findViewById(R.id.box01);
        box02 = findViewById(R.id.box02);
        box10 = findViewById(R.id.box10);
        box11 = findViewById(R.id.box11);
        box12 = findViewById(R.id.box12);
        box20 = findViewById(R.id.box20);
        box21 = findViewById(R.id.box21);
        box22 = findViewById(R.id.box22);
    }

    public void resetGame() {
        box00.setImageResource(R.drawable.invsq);
        box01.setImageResource(R.drawable.invsq);
        box02.setImageResource(R.drawable.invsq);
        box10.setImageResource(R.drawable.invsq);
        box11.setImageResource(R.drawable.invsq);
        box12.setImageResource(R.drawable.invsq);
        box20.setImageResource(R.drawable.invsq);
        box21.setImageResource(R.drawable.invsq);
        box22.setImageResource(R.drawable.invsq);
        set00 =2;set01 =2;set02 =2;set10 =2;set11 =2;set12 =2;set20 =2;set21 =2;set22 =2;
        isXturn = false;
        is00Done = false;is01Done = false;is02Done = false;is10Done = false;is11Done = false;
        is12Done = false;is20Done = false;is21Done = false;is22Done = false;
    }

    public void click00(View view) {
        if(is00Done) {
            makeToast("Already used, Try another box!");
            return;
        }
        if(isXturn) {
            box00.setImageResource(R.drawable.x_img);
            box00.animate().alpha(1f).setDuration(1000);
            isXturn = false;
            is00Done = true;
            set00 = 1;
            if( (set01==1 && set02==1) || (set10==1 && set20==1) || (set11==1 && set22==1) )
            {
                makeToastLong("X wins the Game!!!!");
                resetGame();
            }
        }
        else if(!isXturn) {
            box00.setImageResource(R.drawable.o_img);
            box00.animate().alpha(1f).setDuration(1000);
            isXturn = true;
            is00Done = true;
            set00 = 0;
            if( (set01==0 && set02==0) || (set10==0 && set20==0) || (set11==0 && set22==0) )
            {
                makeToastLong("0 wins the Game!!!!");
                resetGame();
            }
        }
    }

    public void click01(View view) {
        if(is01Done) {
            makeToast("Already used, Try another box!");
            return;
        }
        if(isXturn) {
            box01.setImageResource(R.drawable.x_img);
            box01.animate().alpha(1f).setDuration(1000);
            isXturn = false;
            is01Done = true;
            set01 = 1;
            if( (set00==1 && set02==1) ||  (set11==1 && set21==1) )
            {
                makeToastLong("X wins the Game!!!!");
                resetGame();
            }
        }
        else if(!isXturn) {
            box01.setImageResource(R.drawable.o_img);
            box01.animate().alpha(1f).setDuration(1000);
            isXturn = true;
            is01Done = true;
            set01 = 0;
            if( (set00==0 && set02==0) ||  (set11==0 && set21==0) )
            {
                makeToastLong("0 wins the Game!!!!");
                resetGame();
            }
        }
    }

    public void click02(View view) {
        if(is02Done) {
            makeToast("Already used, Try another box!");
            return;
        }
        if(isXturn) {
            box02.setImageResource(R.drawable.x_img);
            box02.animate().alpha(1f).setDuration(1000);
            isXturn = false;
            is02Done = true;
            set02 = 1;
            if( (set01==1 && set00==1) || (set12==1 && set22==1) || (set11==1 && set20==1) )
            {
                makeToastLong("X wins the Game!!!!");
                resetGame();
            }
        }
        else if(!isXturn) {
            box02.setImageResource(R.drawable.o_img);
            box02.animate().alpha(1f).setDuration(1000);
            isXturn = true;
            is02Done = true;
            set02 = 0;
            if( (set01==0 && set00==0) || (set12==0 && set22==0) || (set11==0 && set20==0) )
            {
                makeToastLong("O wins the Game!!!!");
                resetGame();
            }
        }
    }

    public void click10(View view) {
        if(is10Done) {
            makeToast("Already used, Try another box!");
            return;
        }
        if(isXturn) {
            box10.setImageResource(R.drawable.x_img);
            box10.animate().alpha(1f).setDuration(1000);
            isXturn = false;
            is10Done = true;
            set10 = 1;
            if( (set00==1 && set20==1) ||  (set11==1 && set12==1) )
            {
                makeToastLong("X wins the Game!!!!");
                resetGame();
            }
        }
        else if(!isXturn) {
            box10.setImageResource(R.drawable.o_img);
            box10.animate().alpha(1f).setDuration(1000);
            isXturn = true;
            is10Done = true;
            set10 = 0;
            if( (set00==0 && set20==0) ||  (set11==0 && set12==0) )
            {
                makeToastLong("O wins the Game!!!!");
                resetGame();
            }
        }
    }

    public void click11(View view) {
        if(is11Done) {
            makeToast("Already used, Try another box!");
            return;
        }
        if(isXturn) {
            box11.setImageResource(R.drawable.x_img);
            box11.animate().alpha(1f).setDuration(1000);
            isXturn = false;
            is11Done = true;
            set11 = 1;
            if( (set00==1 && set22==1) || (set02==1 && set20==1) || (set01==1 && set21==1) || (set10==1 && set12==1) )
            {
                makeToastLong("X wins the Game!!!!");
                resetGame();
            }
        }
        else if(!isXturn) {
            box11.setImageResource(R.drawable.o_img);
            box11.animate().alpha(1f).setDuration(1000);
            isXturn = true;
            is11Done = true;
            set11 = 0;
            if( (set00==0 && set22==0) || (set02==0 && set20==0) || (set01==0 && set21==0) || (set10==0 && set12==0) )
            {
                makeToastLong("O wins the Game!!!!");
                resetGame();
            }
        }
    }

    public void click12(View view) {
        if(is12Done) {
            makeToast("Already used, Try another box!");
            return;
        }
        if(isXturn) {
            box12.setImageResource(R.drawable.x_img);
            box12.animate().alpha(1f).setDuration(1000);
            isXturn = false;
            is12Done = true;
            set12 = 1;
            if( (set02==1 && set22==1) ||  (set11==1 && set10==1) )
            {
                makeToastLong("X wins the Game!!!!");
                resetGame();
            }
        }
        else if(!isXturn) {
            box12.setImageResource(R.drawable.o_img);
            box12.animate().alpha(1f).setDuration(1000);
            isXturn = true;
            is12Done = true;
            set12 = 0;
            if( (set02==0 && set22==0) ||  (set11==0 && set10==0) )
            {
                makeToastLong("O wins the Game!!!!");
                resetGame();
            }
        }
    }

    public void click20(View view) {
        if(is20Done) {
            makeToast("Already used, Try another box!");
            return;
        }
        if(isXturn) {
            box20.setImageResource(R.drawable.x_img);
            box20.animate().alpha(1f).setDuration(1000);
            isXturn = false;
            is20Done = true;
            set20 = 1;
            if( (set10==1 && set00==1) || (set21==1 && set22==1) || (set11==1 && set02==1) )
            {
                makeToastLong("X wins the Game!!!!");
                resetGame();
            }
        }
        else if(!isXturn) {
            box20.setImageResource(R.drawable.o_img);
            box20.animate().alpha(1f).setDuration(1000);
            isXturn = true;
            is20Done = true;
            set20 = 0;
            if( (set10==0 && set00==0) || (set21==0 && set22==0) || (set11==0 && set02==0) )
            {
                makeToastLong("O wins the Game!!!!");
                resetGame();
            }
        }
    }

    public void click21(View view) {
        if(is21Done) {
            makeToast("Already used, Try another box!");
            return;
        }
        if(isXturn) {
            box21.setImageResource(R.drawable.x_img);
            box21.animate().alpha(1f).setDuration(1000);
            isXturn = false;
            is21Done = true;
            set21 = 1;
            if( (set20==1 && set22==1) ||  (set11==1 && set01==1) )
            {
                makeToastLong("X wins the Game!!!!");
                resetGame();
            }
        }
        else if(!isXturn) {
            box21.setImageResource(R.drawable.o_img);
            box21.animate().alpha(1f).setDuration(1000);
            isXturn = true;
            is21Done = true;
            set21 = 0;
            if( (set20==0 && set22==0) ||  (set11==0 && set01==0) )
            {
                makeToastLong("O wins the Game!!!!");
                resetGame();
            }
        }
    }

    public void click22(View view) {
        if(is22Done) {
            makeToast("Already used, Try another box!");
            return;
        }
        if(isXturn) {
            box22.setImageResource(R.drawable.x_img);
            box22.animate().alpha(1f).setDuration(1000);
            isXturn = false;
            is22Done = true;
            set22 = 1;
            if( (set20==1 && set21==1) || (set02==1 && set12==1) || (set11==1 && set00==1) )
            {
                makeToastLong("X wins the Game!!!!");
                resetGame();
            }
        }
        else if(!isXturn) {
            box22.setImageResource(R.drawable.o_img);
            box22.animate().alpha(1f).setDuration(1000);
            isXturn = true;
            is22Done = true;
            set22 = 0;
            if( (set20==0 && set21==0) || (set02==0 && set12==0) || (set11==0 && set00==0) )
            {
                makeToastLong("O wins the Game!!!!");
                resetGame();
            }
        }
    }

    public void makeToast(String s) {
        Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
    }
    public void makeToastLong(String s) {
        Toast.makeText(MainActivity.this, s, Toast.LENGTH_LONG).show();
    }

}