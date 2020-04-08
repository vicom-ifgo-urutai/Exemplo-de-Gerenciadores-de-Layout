package com.example.ifgoiano.edu.dracarys.exemplolayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ExemploScrollViewInflateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_scroll_view_inflate);
        LinearLayout layout = (LinearLayout) findViewById(R.id.layout1);
        for (int i = 0; i < 100; i++) {
            // Instancia o TextView inflando o arquivo de layout
            LayoutInflater inflater = LayoutInflater.from(this);
            TextView text = (TextView) inflater.inflate(R.layout.inflate_textview, layout, false);
            text.setText("Texto: " + i);
            layout.addView(text);
        }
    }
}
