package com.example.ifgoiano.edu.dracarys.exemplolayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ExemploScrollViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_scroll_view);
        LinearLayout layout = (LinearLayout) findViewById(R.id.layout1);
        for (int i = 0; i < 100; i++) {
            // Instancia o TextView pela API
			TextView text = new TextView(this);
			text.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                          LinearLayout.LayoutParams.WRAP_CONTENT));
            text.setText("Texto: " + i);
            layout.addView(text);
        }
    }
}
