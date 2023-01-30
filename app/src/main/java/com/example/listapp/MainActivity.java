package com.example.listapp;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.main_view);

        Button[] buttons = new Button[15];

        for( int i = 0; i < 15; i++ ){
            buttons[i] = new Button(MainActivity.this);
            buttons[i].setText(R.string.mysteryButton);
        }


        ArrayAdapter<Button> adapter = new ArrayAdapter<>(MainActivity.this, R.layout.activity_list_view, R.id.ListView_button, buttons);
        listView.setAdapter(adapter);

        // toast appears when click on adapter view child
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d(TAG, "onItemClick: registered");
            }
        });

    }
}