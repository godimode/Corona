package com.example.corona;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SupportTest extends AppCompatActivity {

    public static final int REQUEST_CODE = 113;
    private Button myBtn;
    private RadioGroup radioGroup1, radioGroup2, radioGroup3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.support_test);

        myBtn = findViewById(R.id.support_test_btn);
        radioGroup1 = findViewById(R.id.support_test_raG1);
        radioGroup2 = findViewById(R.id.support_test_raG2);
        radioGroup3 = findViewById(R.id.support_test_raG3);

        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int r1 = radioGroup1.getCheckedRadioButtonId(); // check가 안되있을 경우 -1을 가짐
                int r2 = radioGroup2.getCheckedRadioButtonId();
                int r3 = radioGroup3.getCheckedRadioButtonId();

                if(r1 == -1 || r2 == -1 || r3 == -1) {
                    Toast.makeText(getApplicationContext(), "모두 체크해주세요.", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(getApplicationContext(), SupportResult.class);
                    int[] rData = {r1,r2,r3};
                    // 데이터 전송과정
                    intent.putExtra("rData",rData);
                    startActivityForResult(intent,REQUEST_CODE);
                    finish();
                }
            }
        });
    }
}
