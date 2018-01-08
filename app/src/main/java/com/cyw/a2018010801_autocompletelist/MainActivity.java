package com.cyw.a2018010801_autocompletelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView act;
    String[] str={"aac","cac","ddc"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        act=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,str);
        //設定幾個字符合才會跳出來, 有順序的, 不是key一個 c 然後ddc就會跑出來, 只會跑出cac
        act.setThreshold(1);
        act.setAdapter(adapter);
    }
}
