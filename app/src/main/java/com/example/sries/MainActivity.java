package com.example.sries;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private ImageView imgNivel;
    private TextView txtNivel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seek);
        imgNivel = (ImageView) findViewById(R.id.imgNivel);
        txtNivel = (TextView) findViewById(R.id.txtNivel);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                switch (progress){
                    case 1:
                        txtNivel.setText("Médio");
                        imgNivel.setImageResource(R.drawable.medio);
                        break;
                    case 2:
                        txtNivel.setText("Muito");
                        imgNivel.setImageResource(R.drawable.muito);
                        break;
                    case 3:
                        txtNivel.setText("Susto");
                        imgNivel.setImageResource(R.drawable.susto);
                        break;
                    default:
                        txtNivel.setText("Pouco");
                        imgNivel.setImageResource(R.drawable.pouco);
                        break;
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
