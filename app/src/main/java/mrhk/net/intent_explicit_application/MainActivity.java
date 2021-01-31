package mrhk.net.intent_explicit_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotonext(View view) {
        Intent i = new Intent(getApplicationContext(),SecondActivity.class);
        startActivity(i);
    }
}