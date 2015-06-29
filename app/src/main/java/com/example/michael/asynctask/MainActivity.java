package com.example.michael.asynctask;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btnIniciar);
        textView = (TextView) findViewById(R.id.textCounter);
    }

    public void iniciar(View view){
        CounterTask task = new CounterTask(button, textView);
        task.execute(10);
    }

}
