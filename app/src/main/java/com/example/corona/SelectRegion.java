package com.example.corona;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SelectRegion extends AppCompatActivity {

    private Button map;
    private Button close;
    private ImageButton seoul;
    private ImageButton busan;
    private ImageButton daegu;
    private ImageButton incheon;
    private ImageButton gwangju;
    private ImageButton daejeon;
    private ImageButton ulsan;
    private ImageButton sejong;
    private ImageButton gyeonggi;
    private ImageButton gangwon;
    private ImageButton chungbuk;
    private ImageButton chungnam;
    private ImageButton jeollabuk;
    private ImageButton jeollanam;
    private ImageButton gyeongbuk;
    private ImageButton gyeongnam;
    private ImageButton jeju;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_region);

        map = findViewById(R.id.find_map);
        close = findViewById(R.id.select_region_button_close);
        seoul = findViewById(R.id.seoul);
        busan = findViewById(R.id.busan);
        daegu = findViewById(R.id.daegu);
        incheon = findViewById(R.id.incheon);
        gwangju = findViewById(R.id.gwanju);
        daejeon = findViewById(R.id.daejeon);
        ulsan = findViewById(R.id.ulsan);
        sejong = findViewById(R.id.sejong);
        gyeonggi = findViewById(R.id.gyeonggi);
        gangwon = findViewById(R.id.gangwon);
        chungbuk = findViewById(R.id.chungbuk);
        chungnam = findViewById(R.id.chungnam);
        jeollabuk = findViewById(R.id.jeollabuk);
        jeollanam = findViewById(R.id.jeollanam);
        gyeongbuk = findViewById(R.id.gyeongbuk);
        gyeongnam = findViewById(R.id.gyeongnam);
        jeju = findViewById(R.id.jeju);

        //전체지도
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://coronamap.site/"));
                startActivity(intent);
            }
        });

        //처음 화면으로
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //서울
        seoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.seoul.go.kr/coronaV/coronaStatus.do"));
                startActivity(intent);
            }
        });

        //부산
        busan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.busan.go.kr/corona19/index"));
                startActivity(intent);
            }
        });

        //대구
        daegu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.daegu.go.kr/dgcontent/index.do"));
                startActivity(intent);
            }
        });

        //인천
        incheon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.incheon.go.kr/corona19/IC010001"));
                startActivity(intent);
            }
        });

        //광주
        gwangju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gwangju.go.kr/c19/"));
                startActivity(intent);
            }
        });

        //대전
        daejeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.daejeon.go.kr/corona19/index.do"));
                startActivity(intent);
            }
        });

        //울산
        ulsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ulsan.go.kr/corona.jsp"));
                startActivity(intent);
            }
        });

        //세종
        sejong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sejong.go.kr/bbs/R3273/list.do;jsessionid=OPNHz5QgdbAfx9a7tZlksD3GNPyvV2EazJfYGi45VHjQYcor4vShl75k5KESyO1s.Portal_WAS2_servlet_engine5?cmsNoStr=17465"));
                startActivity(intent);
            }
        });

        //경기
        gyeonggi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gg.go.kr/contents/contents.do?ciIdx=1150&menuId=2909"));
                startActivity(intent);
            }
        });

        //강원
        gangwon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.provin.gangwon.kr/covid-19.html"));
                startActivity(intent);
            }
        });

        //충북
        chungbuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www1.chungbuk.go.kr/covid-19/index.do"));
                startActivity(intent);
            }
        });

        //충남
        chungnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.chungnam.go.kr/coronaStatus.do"));
                startActivity(intent);
            }
        });

        //전북
        jeollabuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.jeonbuk.go.kr/board/list.jeonbuk?boardId=BBS_0000105&menuCd=DOM_000000110001000000&contentsSid=1219&cpath="));
                startActivity(intent);
            }
        });

        //전남
        jeollanam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jeonnam.go.kr/coronaMainPage.do"));
                startActivity(intent);
            }
        });

        //경북
        gyeongbuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gb.go.kr/Main/index.html"));
                startActivity(intent);
            }
        });

        //경남
        gyeongnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://xn--19-q81ii1knc140d892b.kr/main/main.do#close"));
                startActivity(intent);
            }
        });

        //제주
        jeju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jeju.go.kr/corona19.jsp"));
                startActivity(intent);
            }
        });
    }
}
