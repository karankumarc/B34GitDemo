package com.techpalle.karan.b34gitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "onCreate of MainActivity", Toast.LENGTH_SHORT).show();
    }

    public void onClickAdd(View view) {
        Toast.makeText(this, "Add button clicked", Toast.LENGTH_SHORT).show();
    }
}
