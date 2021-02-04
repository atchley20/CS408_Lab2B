package com.example.lab2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView story_frag;
    String[] story_array;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        story_frag = (TextView) findViewById(R.id.story_frag);
        story_array = getResources().getStringArray(R.array.story_frags);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Random r = new Random();
                int random_frag = r.nextInt(story_array.length) + 1;
                story_frag.setText(story_array[random_frag]);
            }
        });
    }
}