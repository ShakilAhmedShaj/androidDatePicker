package com.t3ch.shaj.androiddatepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private DatePicker datePicker;
    private Button selectButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.TextView_id);
        datePicker = findViewById(R.id.DatePicker_id);
        selectButton = findViewById(R.id.button_id);

        textView.setText(currentDate());

        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(currentDate());

            }
        });


    }

    String currentDate() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Current Date : ");
        stringBuilder.append(datePicker.getDayOfMonth() + "/");
        stringBuilder.append((datePicker.getMonth() + 1) + "/");
        stringBuilder.append(datePicker.getYear());

        return stringBuilder.toString();

    }


}
