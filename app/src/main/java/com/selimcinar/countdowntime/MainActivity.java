package com.selimcinar.countdowntime;

import androidx.appcompat.app.AppCompatActivity;
 
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

        // Sayaç objesi oluştu
        new CountDownTimer(10000,1000){

            @Override
            public void onTick(long millisUntilFinished) {
            //Her bir saniyede ne olsun
                //TextView'in değerini değiştir
                textView.setText("Left : "+ millisUntilFinished /1000+" .");
            }

            @Override
            public void onFinish() {
            //Sayaç bitince ne olsun
                //Toast mesajı göster
                Toast.makeText(getApplicationContext(),"Done ! ",Toast.LENGTH_LONG).show();
                //TextView'in değerini değiştir
                textView.setText("Finished ! ");
            }
        }.start();
    }
}
