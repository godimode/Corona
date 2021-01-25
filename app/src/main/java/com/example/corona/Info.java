package com.example.corona;

import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Info extends AppCompatActivity {

    private ArrayAdapter<CharSequence> adspin1;
    private ArrayAdapter<CharSequence> adspin2;
    private String choice_first = "시도명";
    private String choice_second = "시군구명";

    private TextView textView;
    private Button addBtn;
    private Button closeBtn;

    private String serviceKey = "bd6iJrkZbHEp7xOO4heDMtRKILNToYeNv%2BZ70zNkz2Il5lAyU9s3%2Fat75FzRcvKMKyrUOuu5PybG6nicIPRUfQ%3D%3D";
    private String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

        final Spinner spin1 = findViewById(R.id.info_address);
        final Spinner spin2 = findViewById(R.id.info_address2);

        adspin1 = ArrayAdapter.createFromResource(this, R.array.spinner_main, android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(adspin1);
        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(adspin1.getItem(position).equals("서울")) {
                    choice_first = "서울";
                    adspin2 = ArrayAdapter.createFromResource(Info.this, R.array.spinner_seoul, android.R.layout.simple_spinner_dropdown_item);
                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            choice_second = adspin2.getItem(position).toString();
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
                else if(adspin1.getItem(position).equals("부산")) {
                    choice_first = "부산";
                    adspin2 = ArrayAdapter.createFromResource(Info.this, R.array.spinner_busan, android.R.layout.simple_spinner_dropdown_item);
                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            choice_second = adspin2.getItem(position).toString();
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
                else if(adspin1.getItem(position).equals("대구")) {
                    choice_first = "대구";
                    adspin2 = ArrayAdapter.createFromResource(Info.this, R.array.spinner_daegu, android.R.layout.simple_spinner_dropdown_item);
                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            choice_second = adspin2.getItem(position).toString();
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
                else if(adspin1.getItem(position).equals("인천")) {
                    choice_first = "인천";
                    adspin2 = ArrayAdapter.createFromResource(Info.this, R.array.spinner_incheon, android.R.layout.simple_spinner_dropdown_item);
                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            choice_second = adspin2.getItem(position).toString();
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
                else if(adspin1.getItem(position).equals("광주")) {
                    choice_first = "광주";
                    adspin2 = ArrayAdapter.createFromResource(Info.this, R.array.spinner_gwangju, android.R.layout.simple_spinner_dropdown_item);
                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            choice_second = adspin2.getItem(position).toString();
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
                else if(adspin1.getItem(position).equals("대전")) {
                    choice_first = "대전";
                    adspin2 = ArrayAdapter.createFromResource(Info.this, R.array.spinner_daejeon, android.R.layout.simple_spinner_dropdown_item);
                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            choice_second = adspin2.getItem(position).toString();
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
                else if(adspin1.getItem(position).equals("울산")) {
                    choice_first = "울산";
                    adspin2 = ArrayAdapter.createFromResource(Info.this, R.array.spinner_ulsan, android.R.layout.simple_spinner_dropdown_item);
                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            choice_second = adspin2.getItem(position).toString();
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
                else if(adspin1.getItem(position).equals("세종")) {
                    choice_first = "세종";
                    adspin2 = ArrayAdapter.createFromResource(Info.this, R.array.spinner_sejong, android.R.layout.simple_spinner_dropdown_item);
                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            choice_second = adspin2.getItem(position).toString();
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
                else if(adspin1.getItem(position).equals("경기")) {
                    choice_first = "경기";
                    adspin2 = ArrayAdapter.createFromResource(Info.this, R.array.spinner_gyeonggi, android.R.layout.simple_spinner_dropdown_item);
                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            choice_second = adspin2.getItem(position).toString();
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
                else if(adspin1.getItem(position).equals("강원")) {
                    choice_first = "강원";
                    adspin2 = ArrayAdapter.createFromResource(Info.this, R.array.spinner_gangwon, android.R.layout.simple_spinner_dropdown_item);
                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            choice_second = adspin2.getItem(position).toString();
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
                else if(adspin1.getItem(position).equals("충북")) {
                    choice_first = "충북";
                    adspin2 = ArrayAdapter.createFromResource(Info.this, R.array.spinner_chungbuk, android.R.layout.simple_spinner_dropdown_item);
                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            choice_second = adspin2.getItem(position).toString();
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
                else if(adspin1.getItem(position).equals("충남")) {
                    choice_first = "충남";
                    adspin2 = ArrayAdapter.createFromResource(Info.this, R.array.spinner_chungnam, android.R.layout.simple_spinner_dropdown_item);
                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            choice_second = adspin2.getItem(position).toString();
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
                else if(adspin1.getItem(position).equals("전북")) {
                    choice_first = "전북";
                    adspin2 = ArrayAdapter.createFromResource(Info.this, R.array.spinner_jeollabuk, android.R.layout.simple_spinner_dropdown_item);
                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            choice_second = adspin2.getItem(position).toString();
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
                else if(adspin1.getItem(position).equals("전남")) {
                    choice_first = "전남";
                    adspin2 = ArrayAdapter.createFromResource(Info.this, R.array.spinner_jeollanam, android.R.layout.simple_spinner_dropdown_item);
                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            choice_second = adspin2.getItem(position).toString();
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
                else if(adspin1.getItem(position).equals("경북")) {
                    choice_first = "경북";
                    adspin2 = ArrayAdapter.createFromResource(Info.this, R.array.spinner_gyeongbuk, android.R.layout.simple_spinner_dropdown_item);
                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            choice_second = adspin2.getItem(position).toString();
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
                else if(adspin1.getItem(position).equals("경남")) {
                    choice_first = "경남";
                    adspin2 = ArrayAdapter.createFromResource(Info.this, R.array.spinner_gyeongnam, android.R.layout.simple_spinner_dropdown_item);
                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            choice_second = adspin2.getItem(position).toString();
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
                else if(adspin1.getItem(position).equals("제주")) {
                    choice_first = "제주";
                    adspin2 = ArrayAdapter.createFromResource(Info.this, R.array.spinner_jeju, android.R.layout.simple_spinner_dropdown_item);
                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            choice_second = adspin2.getItem(position).toString();
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        textView = findViewById(R.id.info_result);
        addBtn = findViewById(R.id.info_addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = getXmlData();
                textView.setText(data);
            }
        });

        closeBtn = findViewById(R.id.info_button_close);
        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    String getXmlData() {
        StringBuffer buffer = new StringBuffer();
        StringBuffer tBuffer = new StringBuffer();
        String inputStr = choice_first;
        String inputStr2 = choice_second;

        String queryUrl = "http://apis.data.go.kr/B551182/pubReliefHospService/getpubReliefHospList?"
                + "serviceKey=" + serviceKey + "&pageNo=1&numOfRows=2000&spclAdmTyCd=&";

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        try {
            URL t_url = new URL(queryUrl);
            URLConnection t_connection = t_url.openConnection();
            t_connection.setReadTimeout(3000);
            InputStream is = t_connection.getInputStream();

            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser xpp = factory.newPullParser();
            xpp.setInput(new InputStreamReader(is, "UTF-8"));

            String tag;

            xpp.next();

            int temp1 = 0;
            int temp2 = 0;

            int eventType = xpp.getEventType();

            while (eventType != XmlPullParser.END_DOCUMENT) {
                String tStr = "";
                switch(eventType) {
                    case XmlPullParser.START_TAG:
                        tag = xpp.getName();

                        if (tag.equals("sidoNm")) {
                            xpp.next();
                            if (inputStr.equals(xpp.getText()) && temp2 == 1) {
                                tBuffer.append("시도명 : ");
                                tBuffer.append(xpp.getText());
                                tBuffer.append("\n");
                                temp1++;
                            }
                            else
                                tBuffer.delete(0, tBuffer.length());
                        }
                        else if (tag.equals("sgguNm")) {
                            xpp.next();
                            if (inputStr2.equals(xpp.getText())) {
                                tBuffer.append("시군구명 : ");
                                tBuffer.append(xpp.getText());
                                tBuffer.append("\n");
                                temp2++;
                            }
                        }
                        else if (tag.equals("yadmNm")) {
                            xpp.next();
                            if (temp1 == 1 && temp2 == 1) {
                                tBuffer.append("기관명 : ");
                                tBuffer.append(xpp.getText());
                                tBuffer.append("\n");
                            }
                        }
                        else if (tag.equals("telno")) {
                            xpp.next();
                            if (temp1 == 1 && temp2 == 1) {
                                tBuffer.append("전화번호 : ");
                                tBuffer.append(xpp.getText());
                                tBuffer.append("\n");
                            }
                        }
                        break;

                    case XmlPullParser.TEXT:
                        break;

                    case XmlPullParser.END_TAG:
                        tag = xpp.getName();
                        if (tag.equals("item") && temp1 == 1 && temp2 == 1) {
                            buffer.append(tBuffer.toString());
                            buffer.append("\n");
                            tBuffer.delete(0, tBuffer.length());
                            temp1 = 0;
                            temp2 = 0;
                        }
                        break;
                }
                eventType = xpp.next();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        return buffer.toString();
    }
}
