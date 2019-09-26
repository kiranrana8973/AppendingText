package com.meroapp.appendingtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    EditText etText;
    Button btnAppend;
    TextView tvText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etText = findViewById(R.id.etText);
        btnAppend = findViewById(R.id.btnAppend);
        tvText = findViewById(R.id.tvText);

        btnAppend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendText();
            }
        });
    }

    private void appendText() {
        // "\n" is used for new line
        tvText.append(etText.getText().toString() + "\n");
    }
}
