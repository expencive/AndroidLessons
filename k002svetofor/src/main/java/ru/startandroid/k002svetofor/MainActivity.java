package ru.startandroid.k002svetofor;

import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout mConstraintLayout;
    private TextView mInfoTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mConstraintLayout = (ConstraintLayout) findViewById(R.id.mConstraintLayout);
        mInfoTextView = (TextView) findViewById(R.id.mInfoTextView);
    }
    public void onRedButtonClick(View view) {
        mInfoTextView.setText(R.string.red);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.redColor));
        Toast.makeText(this, "Красный", Toast.LENGTH_SHORT).show();
    }
    public void onGreenButtonClick(View view) {
        mInfoTextView.setText(R.string.green);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.greenColor));
        Toast.makeText(this, "Зеленый", Toast.LENGTH_SHORT).show();
    }
    public void onYellowButtonClick(View view) {
        mInfoTextView.setText(R.string.yellow);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowColor));
        Toast.makeText(this, "Желтый", Toast.LENGTH_SHORT).show();
    }
}
