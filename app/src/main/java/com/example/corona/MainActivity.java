package com.example.corona;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private CoronaAdapter myAdapter = null;
    private ListView listView = null;
    private ViewPager viewPager;
    private ArrayList<Integer> imageList;

    private  int currentPage = 0;
    private Timer timer;
    private final long DELAY_MS = 500;
    private final long PERIOD_MS = 3000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.corona);

        //뷰페이저 설정
        this.imageData();
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new ViewPagerAdapter(this, imageList));

        //자동 페이지 넘김 기능
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            @Override
            public void run() {
                if(currentPage == imageList.size()) {
                    currentPage = 0;
                }
                viewPager.setCurrentItem(currentPage++, true);
            }
        };

        //페이지 넘김 시간 조절
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, DELAY_MS, PERIOD_MS);

        //리스트뷰 설정
        this.listData();
        listView = findViewById(R.id.corona_listView);
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new ListViewItemClickListener());
    }

    //뷰 페이저 아이템 추가
    public void imageData() {
        imageList = new ArrayList();
        imageList.add(R.drawable.covid19);
        imageList.add(R.drawable.prevention);
        imageList.add(R.drawable.support);
    }

    //커스텀 리스트뷰 아이템 추가
    public void listData() {
        myAdapter = new CoronaAdapter(this);
        myAdapter.addItem(new CoronaData(R.drawable.graph, "확진자 현황", "지역별 확진자 현황을 확인하세요.")); // 확진자현황
        myAdapter.addItem(new CoronaData(R.drawable.flipchart, "자가진단 테스트", "간단한 테스트로 증상을 확인하세요.")); // 자가진단
        myAdapter.addItem(new CoronaData(R.drawable.location, "진료소 정보 확인", "코로나 진료소 정보를 확인하세요.")); // 진료소정보
        myAdapter.addItem(new CoronaData(R.drawable.search, "정부지원금 확인", "본인에게 해당되는 지원금을 확인하세요.")); // 정부지원금
    }

    private int selectedPos = -1;

    //리스트뷰 아이템 선택시 화면전환
    private class ListViewItemClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            selectedPos = position;
            if(selectedPos == 0) { // 확진자현황
                Intent intent = new Intent(getApplicationContext(), SelectRegion.class);
                startActivity(intent);
            }
            else if(selectedPos == 1) { // 자가진단
                Intent intent = new Intent(getApplicationContext(), TestNotice.class);
                startActivity(intent);
            }
            else if(selectedPos == 2) { // 진료소 정보 확인
                Intent intent = new Intent(getApplicationContext(), Info.class);
                startActivity(intent);
            }
            else if(selectedPos == 3) { // 정부지원금
                Intent intent = new Intent(getApplicationContext(), SupportTest.class);
                startActivity(intent);
            }
        }
    }
}
