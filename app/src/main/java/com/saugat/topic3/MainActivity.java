package com.saugat.topic3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Name;
    Spinner Spnr;
    AutoCompleteTextView actyBatch;
    Button btnSave;
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.Name);
        Spnr = findViewById(R.id.Spnr);
        actyBatch = findViewById(R.id.actyBatch);
        btnSave = findViewById(R.id.btnSave);
        tvResult = findViewById(R.id.tvResult);

        String Countries [] = {"Nepal", "China", "Japan", "Italy", "Spain", "USA", "England", "Dubai", "Korea", "Iraq"};
        ArrayAdapter adapter = new ArrayAdapter<>(
                this,

          android.R.layout.simple_list_item_1,
           Countries
        );

        Spnr.setAdapter(adapter);
        String Batch[] = {"22A","22B","22C","22D"};
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.select_dialog_item,
                Batch
        );
        actyBatch.setAdapter(stringArrayAdapter);
        actyBatch.setThreshold(1);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name,country, Batch, str;

                name = Name.getText().toString();
                country = Spnr . getSelectedItem().toString();
                Batch = actyBatch.getText().toString();

                str = "your name" + name + "\nYour country: " + "\nYour Batch"+ Batch+"\n";
                tvResult.append(str);

            }
        });

        }

    }

