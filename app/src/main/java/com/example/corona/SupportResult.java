package com.example.corona;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SupportResult extends AppCompatActivity {

    private Button closeBtn;
    private Button openBtn;
    private ArrayList<SupportData> data = null;
    private SupportAdapter sAdapter = null;
    private ListView listView = null;
    private int btnCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.support_result);

        Intent intent = getIntent();
        final int[]  rData = intent.getExtras().getIntArray("rData");

        sAdapter = new SupportAdapter(this);
        openBtn = findViewById(R.id.openBtn);
        closeBtn = findViewById(R.id.support_button_close);

        openBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(btnCount == 0) {
                    addLayout();
                    btnCount++;
                }
            }
            private void addLayout() {

                listView = findViewById(R.id.support_listView);

                if(rData[0] == R.id.support_test_rBt1_1 && rData[1] == R.id.support_test_rBt2_2 && rData[2] == R.id.support_test_rBt3_2) {
                    sAdapter.addItem(new SupportData(
                            "받을 수 있는 지원금이 없어요..",
                            "",""));
                }
                else {
                    if(rData[0] != R.id.support_test_rBt1_1) {
                        sAdapter.addItem(new SupportData("출산 장려 지원금을 받으실 수 있어요!" ,
                                "해당 지원금은 지자체마다 다르니 주의하시기 바랍니다.",
                                "( 아래 링크를 눌러 자세한 정보를 확인해보세요 )",
                                "http://www.childcare.go.kr/web/board/BD_board.list.do?bbsCd=9091"));
                    }
                    if(rData[1] != R.id.support_test_rBt2_2) {
                        sAdapter.addItem(new SupportData("실업 급여 지원금을 받으실 수 있어요!",
                                "( 아래 링크를 눌러 자세한 정보를 확인해보세요 )",
                                "https://www.ei.go.kr/ei/eih/eg/pb/pbPersonBnef/retrievePb190Info.do"));
                    }
                    if(rData[2] != R.id.support_test_rBt3_2) {
                        sAdapter.addItem(new SupportData("청년 구직 활동 지원금을 받으실 수 있어요!",
                                "( 아래 링크를 눌러 자세한 정보를 확인해보세요 )",
                                "https://www.youthcenter.go.kr/seekActvSptfndAppl/aboutThis.do"));
                    }
                }
                listView.setAdapter(sAdapter);
                closeBtn.setVisibility(View.VISIBLE);
            }
        });
        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
