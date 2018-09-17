package ru.startandroid.mp001sendsmstodushistikv_10;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv;
    Button btnBalance;
    Button btnSystem;
    Button btnCoord;
    Button btnPanic;
    Button btnSearch;
    Button btnGuardOn;
    Button btnGuardOff;
    Button btnBlockEngine;
    Button btnServiceOn;
    Button btnServiceOff;

    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBalance = (Button) findViewById(R.id.btnBalance);
        btnBalance.setOnClickListener(this);
        btnSystem = (Button) findViewById(R.id.btnSystem);
        btnSystem.setOnClickListener(this);
        btnCoord = (Button) findViewById(R.id.btnCoord);
        btnCoord.setOnClickListener(this);
        btnPanic = (Button) findViewById(R.id.btnPanic);
        btnPanic.setOnClickListener(this);
        btnSearch = (Button) findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(this);
        btnGuardOn = (Button) findViewById(R.id.btnGuardOn);
        btnGuardOn.setOnClickListener(this);
        btnGuardOff = (Button) findViewById(R.id.btnGuardOff);
        btnGuardOff.setOnClickListener(this);
        btnBlockEngine = (Button) findViewById(R.id.btnBlockEngine);
        btnBlockEngine.setOnClickListener(this);
        btnServiceOn = (Button) findViewById(R.id.btnServiceOn);
        btnServiceOn.setOnClickListener(this);
        btnServiceOff = (Button) findViewById(R.id.btnServiceOff);
        btnServiceOff.setOnClickListener(this);

        sp = PreferenceManager.getDefaultSharedPreferences(this);
        Toast.makeText(this, "Введите номер телефона и код управления в Настройках", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        String telefon = sp.getString("telefon", "");
        String servicekey = sp.getString("serviceKey", "");
        String toSms="smsto:"+telefon;
        String messageText= "Введите номер телефона и код управления в Настройках";
        Intent sms=new Intent(Intent.ACTION_SENDTO, Uri.parse(toSms));
        switch (v.getId()) {
            case R.id.btnBalance:
                messageText= "01# " + servicekey;
                break;
            case R.id.btnSystem:
                messageText= "02# " + servicekey;
                break;
            case R.id.btnCoord:
                messageText= "03# " + servicekey;
                break;
            case R.id.btnPanic:
                messageText= "04# " + servicekey;
                break;
            case R.id.btnSearch:
                messageText= "05# " + servicekey;
                break;
            case R.id.btnGuardOn:
                messageText= "06# " + servicekey;
                break;
            case R.id.btnGuardOff:
                messageText= "07# " + servicekey;
                break;
            case R.id.btnBlockEngine:
                messageText= "08# " + servicekey;
                break;
            case R.id.btnServiceOn:
                messageText= "09# " + servicekey;
                break;
            case R.id.btnServiceOff:
                messageText= "10# " + servicekey;
                break;
        }
        sms.putExtra("sms_body", messageText);
        startActivity(sms);
        Toast.makeText(this, "Нажмите кнопку отправки СМС", Toast.LENGTH_SHORT).show();


    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem mi = menu.add(0,1, 0, "Настройки");
        mi.setIntent(new Intent(this, PrefActivity.class));
        return super.onCreateOptionsMenu(menu);
    }


}

