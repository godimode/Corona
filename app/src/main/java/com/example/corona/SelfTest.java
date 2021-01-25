package com.example.corona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SelfTest extends AppCompatActivity {

    private RadioGroup rgFever;
    private RadioGroup rgTravel;
    private Button btn_return;
    private Button btn_link;
    private RadioButton rdLow;
    private RadioButton rdMid;
    private RadioButton rdHigh;
    private RadioButton rdYes;
    private RadioButton rdNo;
    private CheckBox ch1;
    private CheckBox ch2;
    private CheckBox ch3;
    private CheckBox ch4;
    private CheckBox ch5;
    private CheckBox ch6;
    private CheckBox ch7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.self_test);
        rgFever = findViewById(R.id.radioGroupFever);
        rgTravel = findViewById(R.id.radioGroupTravel);
        btn_return = findViewById(R.id.self_test_result);
        btn_link = findViewById(R.id.button_link);
        rdLow = findViewById(R.id.radioButtonLow);
        rdMid = findViewById(R.id.radioButtonMid);
        rdHigh = findViewById(R.id.radioButtonHigh);
        rdYes = findViewById(R.id.radioButtonYes);
        rdNo = findViewById(R.id.radioButtonNo);
        ch1 = findViewById(R.id.checkBox1);
        ch2 = findViewById(R.id.checkBox2);
        ch3 = findViewById(R.id.checkBox3);
        ch4 = findViewById(R.id.checkBox4);
        ch5 = findViewById(R.id.checkBox5);
        ch6 = findViewById(R.id.checkBox6);
        ch7 = findViewById(R.id.checkBox7);

        btn_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://korean.cdc.gov/coronavirus/2019-ncov/symptoms-testing/symptoms.html"));
                startActivity(intent);
            }
        });

        //선택시 이벤트
        btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Checking()) {
                    int count = 0;

                    if(rdMid.isChecked()) count += 2;
                    else if(rdHigh.isChecked()) count += 4;

                    if(ch1.isChecked()) count++;
                    if(ch2.isChecked()) count++;
                    if(ch3.isChecked()) count++;
                    if(ch4.isChecked()) count++;
                    if(ch5.isChecked()) count++;
                    if(ch6.isChecked()) count += 2;
                    if(ch7.isChecked()) count += 2;

                    if(count < 2) {
                        if(rdYes.isChecked() && count >= 1) { //의심
                            Intent intent = new Intent(getApplicationContext(), TestResultSuspicion.class);
                            startActivity(intent);
                        }
                        else { //정상
                            Intent intent = new Intent(getApplicationContext(), TestResultNormal.class);
                            startActivity(intent);
                        }
                    }
                    else if(count >= 2 && count < 4) {
                        if(rdYes.isChecked() && count >= 3) { //위험
                            Intent intent = new Intent(getApplicationContext(), TestResultDanger.class);
                            startActivity(intent);
                        }
                        else { //의심
                            Intent intent = new Intent(getApplicationContext(), TestResultSuspicion.class);
                            startActivity(intent);
                        }
                    }
                    else if(count >= 4) { //위험
                        Intent intent = new Intent(getApplicationContext(), TestResultDanger.class);
                        startActivity(intent);
                    }

                    finish();
                }
                else { //항목 체크 필요 Dialog
                    Toast.makeText(getApplicationContext(), "모두 체크해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public boolean Checking() {
        int rgCheck1 = rgFever.getCheckedRadioButtonId();
        int rgCheck2 = rgTravel.getCheckedRadioButtonId();

        if(rgCheck1 == -1 || rgCheck2 == -1) return false;
        return true;
    }
}
