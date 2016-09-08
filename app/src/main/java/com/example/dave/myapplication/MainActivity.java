package com.example.dave.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TabHost tabhost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View niTab = (View) LayoutInflater.from(this).inflate(R.layout.tabmini, null);
        TextView text0 = (TextView) niTab.findViewById(R.id.tab_label);
        text0.setText("红色");

        View woTab = (View) LayoutInflater.from(this).inflate(R.layout.tabmini, null);
        TextView text1 = (TextView) woTab.findViewById(R.id.tab_label);
        text1.setText("黄色");
        //得到TabHost对象实例
        tabhost =(TabHost) findViewById(R.id.tabhost);
        //调用 TabHost.setup()
        tabhost.setup();
        //创建Tab标签
        tabhost.addTab(tabhost.newTabSpec("one").setIndicator(niTab).setContent(R.id.widget_layout_red));
        tabhost.addTab(tabhost.newTabSpec("two").setIndicator(woTab).setContent(R.id.widget_layout_yellow));
    }
}
