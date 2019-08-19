package com.othershe.behavior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.othershe.behaviortest.R;
import com.othershe.behavior.extend.TestActivity5;
import com.othershe.behavior.test1.TestActivity1;
import com.othershe.behavior.test2.TestActivity2;
import com.othershe.behavior.mainpage.TestActivity3;
import com.othershe.behavior.xiami.TestActivity4;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void test_one(View v) {
        startActivity(new Intent(this, TestActivity1.class));
    }

    public void test_two(View v) {
        startActivity(new Intent(this, TestActivity2.class));
    }

    public void test_three(View v) {
        startActivity(new Intent(this, TestActivity3.class));
    }

    public void test_four(View v) {
        startActivity(new Intent(this, TestActivity4.class));
    }

    public void test_five(View v) {
        startActivity(new Intent(this, TestActivity5.class));
    }
}
