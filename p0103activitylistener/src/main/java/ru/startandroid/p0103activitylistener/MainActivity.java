package ru.startandroid.p0103activitylistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvOut;
    Button btnStart;
    Button btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.tvOut);
        btnStart = (Button) findViewById(R.id.btnStart);
        btnStop = (Button) findViewById(R.id.btnStop);
    }
    public void onClickStart(View v) {
        tvOut.setText("Нажата кнопка Start");
        Toast.makeText(this, "Нажата кнопка Start", Toast.LENGTH_SHORT).show();
    }

    public void onClickStop (View v) {
        tvOut.setText("Нажата кнопка Stop");
        Toast.makeText(this, "Нажата кнопка Stop", Toast.LENGTH_SHORT).show();
    }
}
