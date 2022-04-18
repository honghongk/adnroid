package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.JsonReader;
import android.widget.Toast;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    // https://namu.wiki/w/%EB%B6%84%EB%A5%98:%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C(%EC%9A%B4%EC%98%81%EC%B2%B4%EC%A0%9C)/%EB%B2%84%EC%A0%84
    // 운영체제 종류, 버전
    // 롤리팝      :   갤 S4 노트3 등                  2014년 공개  대부분 어플 최소기준
    // 마시멜로    :   갤 S6 ~ S7 엣지 , 노트 5 ~ 7 등 2015년 공개   실제 폰에 적용은 1년 후씩
    // 누가        :   갤 S6 ~ S7 엣지 , 노트 5 ~ 7 등  2016년 공개

    // 안드로이드 어플 생명주기
    // https://kairo96.gitbooks.io/android/content/ch2.4.1.html

    // 어플 실행시 onCreate -> onStart -> onResume
    // 어플 종료시 onPause -> onStop -> onDestroy
    // 어플내 다른화면 보여줄때 onPause -> onResume
    // 어플 안끄고 화면 안보일때 onPause -> onStop
    // 안끈 어플 다시 띄울때 onStop -> onRestart -> onStart
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"onCreate",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart(){
        Toast.makeText(getApplicationContext(),"onStart",Toast.LENGTH_LONG).show();
        super.onStart();
    }

    @Override
    protected void onResume(){
        Toast.makeText(getApplicationContext(),"onResume",Toast.LENGTH_LONG).show();
        super.onResume();
    }

    @Override
    protected void onRestart(){
        Toast.makeText(getApplicationContext(),"onStart",Toast.LENGTH_LONG).show();
        super.onRestart();
    }

    @Override
    protected void onStop(){
        Toast.makeText(getApplicationContext(),"onStop",Toast.LENGTH_LONG).show();
        super.onStop();
    }

    @Override
    protected void onDestroy(){
        Toast.makeText(getApplicationContext(),"onDestroy",Toast.LENGTH_LONG).show();
        super.onDestroy();
    }

    @Override
    protected void onPause(){
        Toast.makeText(getApplicationContext(),"onPause",Toast.LENGTH_LONG).show();
        super.onPause();
    }





}