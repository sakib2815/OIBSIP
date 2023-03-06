package com.example.unitconverteroib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etMeters;
    private EditText etCentimeters;
    private Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMeters = findViewById(R.id.et_meters);
        etCentimeters = findViewById(R.id.et_centimeters);
        btnConvert = findViewById(R.id.btn_convert);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!etMeters.getText().toString().isEmpty()) {
                    double meters = Double.parseDouble(etMeters.getText().toString());
                    double centimeters = meters * 100;
                    etCentimeters.setText(String.valueOf(centimeters));
                } else if (!etCentimeters.getText().toString().isEmpty()) {
                    double centimeters = Double.parseDouble(etCentimeters.getText().toString());
                    double meters = centimeters / 100;
                    etMeters.setText(String.valueOf(meters));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter a value", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
