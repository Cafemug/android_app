package com.example.intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btn_move;
    private EditText et_test;
    private String str;
    private ImageView test;
    private ListView list;
    private String shared = "file";
    private WebView webView;
    private String url = "https://www.naver.com";

    private View drawerView;
    private DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        drawerView = (View)findViewById(R.id.drawer);
        Button btn_open = (Button)findViewById(R.id.btn_open);
        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(drawerView);
            }
        });
        drawerLayout.setDrawerListener(listener);
        drawerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });
        Button btn_close = (Button)findViewById(R.id.btn_close);
        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.closeDrawers();
            }
        });
//        webView = (WebView)findViewById(R.id.wevView);
//        webView.getSettings().setJavaScriptEnabled(true);
//        webView.loadUrl(url);
//        webView.setWebChromeClient(new WebChromeClient());
//        webView.setWebViewClient(new WebViewClientClass());
//
//        et_test = findViewById(R.id.et_test);
//        SharedPreferences sharedPreferences = getSharedPreferences(shared, 0);
//        String value = sharedPreferences.getString("values","");
//        et_test.setText(value);
//
//        btn_move = findViewById(R.id.btn_move);
//        btn_move.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                str = et_test.getText().toString();
//                Intent intent = new Intent(MainActivity.this, SubActivity.class);
//                intent.putExtra("str", str);
//                startActivity(intent);
//            }
//        });
//
//        test = (ImageView)findViewById(R.id.test);
//        test.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Toast", Toast.LENGTH_LONG).show();
//            }
//        });
//
//        list = (ListView)findViewById(R.id.list);
//
//        List<String> data = new ArrayList<String>();
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
//        list.setAdapter(adapter);
//
//        data.add("data1");
//        adapter.notifyDataSetChanged();
    }
//
//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()){
//            webView.goBack();
//            return true;
//        }
//        return super.onKeyDown(keyCode, event);
//    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        SharedPreferences sharedPreferences = getSharedPreferences(shared, 0);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        String value = et_test.getText().toString();
//        editor.putString("values", value);
//        editor.commit();
    }

//    private class WebViewClientClass extends WebViewClient {
//        @Override
//        public boolean shouldOverrideUrlLoading(WebView view, String url) {
//            view.loadUrl(url);
//            return true;
//        }
//    }
    DrawerLayout.DrawerListener listener = new DrawerLayout.DrawerListener() {
        @Override
        public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

        }

        @Override
        public void onDrawerOpened(@NonNull View drawerView) {

        }

        @Override
        public void onDrawerClosed(@NonNull View drawerView) {

        }

        @Override
        public void onDrawerStateChanged(int newState) {

        }
    };
};
