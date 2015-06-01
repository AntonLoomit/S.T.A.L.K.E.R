package com.saston.stalker.app;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
public Button btn1;
public Button btn2;
public Button btn3;
public TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textView);
        Button btn1 = (Button) findViewById(R.id.button);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        btn2.setVisibility(View.INVISIBLE);
        btn1.setVisibility(View.INVISIBLE);
        btn3.setText("Начать игру!");

    }

public void onClick(View view){
    btn1.setVisibility(View.VISIBLE);
    btn2.setVisibility(View.VISIBLE);
    btn2.setText("Выбор 2");
    btn1.setText("Выбор 1");
    btn3.setText("Выбор 3");
//    btn1.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//textView.setText("Выбор 1");
//        }
//    });
//    btn2.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            textView.setText("Выбор 2");
//        }
//    });
//    btn3.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            textView.setText("Выбор 3 ");
//        }
//    });
}
}
