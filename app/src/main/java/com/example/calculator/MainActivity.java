package com.example.calculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText ed1;
    private EditText ed2;
    private Button sum;
    private Button raz;
    private Button umz;
    private Button dln;
    private TextView result;
    private Button virus;
    private String edText1;
    private String edText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        sum.setOnClickListener(this);
        raz.setOnClickListener(this);
        umz.setOnClickListener(this);
        dln.setOnClickListener(this);
        virus.setOnClickListener(this);


    }
    private void init(){
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        sum = findViewById(R.id.sum);
        raz = findViewById(R.id.raz);
        umz = findViewById(R.id.umz);
        dln = findViewById(R.id.dln);
        virus = findViewById(R.id.Virus);
        result = findViewById(R.id.result);
        edText1 = ed1.getText().toString();
        edText2 = ed2.getText().toString();
    }

    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(ed1.getText().toString())||TextUtils.isEmpty(ed2.getText().toString())){
         return;
        }
        switch (v.getId()){
            case R.id.sum:

                float num1 = Float.parseFloat(ed1.getText().toString());
                float num2 = Float.parseFloat(ed2.getText().toString());
                float resultik = num1 + num2;
                result.setText(String.valueOf(resultik));
                break;
            case R.id.raz:
                float num3 = Float.parseFloat(ed1.getText().toString());
                float num4 = Float.parseFloat(ed2.getText().toString());
                float resultik2 = num3 - num4;
                result.setText(String.valueOf(resultik2));
                break;
            case R.id.umz:
                float num5 = Float.parseFloat(ed1.getText().toString());
                float num6 = Float.parseFloat(ed2.getText().toString());
                float resultik3 = num5 * num6;
                result.setText(String.valueOf(resultik3));
                break;
            case R.id.dln:
                float num7 = Float.parseFloat(ed1.getText().toString());
                float num8 = Float.parseFloat(ed2.getText().toString());
                float resultik4 = num7 / num8;
                result.setText(String.valueOf(resultik4));
                break;
            case R.id.Virus:
                AlertDialog.Builder ad = new AlertDialog.Builder(MainActivity.this);
                ad.
                        setTitle("ВИРУС!").
                        setMessage("Загрузка вируса,нажмите ок!").
                        setCancelable(false).
                        setPositiveButton("ОК", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                                Toast.makeText(MainActivity.this,"Загрузка вируса успешно завершена!",Toast.LENGTH_LONG).show();
                            }
                        });
                AlertDialog AD = ad.create();
                AD.show();
                break;
        }

    }
}
