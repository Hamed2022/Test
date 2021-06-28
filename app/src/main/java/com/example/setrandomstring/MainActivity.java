package com.example.setrandomstring;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView SampleText;
    Button ChangeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SampleText = findViewById(R.id.sample_text_tv);
        ChangeButton = findViewById(R.id.change_text_button);

        ArrayList<String> Names = new ArrayList<String>();
        Names.add("Ali");
        Names.add("Reza");
        Names.add("Javad");
        Names.add("Hasan");
        Names.add("Mohsen");

        ChangeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomIndex = new Random().nextInt(Names.size());
                String randomString = Names.get(randomIndex);
                SampleText.setText(randomString);
            }
        });


    }
}