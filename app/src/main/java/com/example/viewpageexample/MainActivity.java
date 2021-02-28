package com.example.viewpageexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity implements MyListener{



    TextView tv;

    String [] titles = {"Page 1", "Page 2", "Page 3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ViewPager2 viewPager2 = findViewById(R.id.viewPage);

        ViewPageAdaptor adaptor = new ViewPageAdaptor(MainActivity.this);

        viewPager2.setAdapter(adaptor);


        TabLayout tabLayout = findViewById(R.id.tabLayout);


        new TabLayoutMediator(tabLayout, viewPager2 , (tab, position) -> {

            tab.setText(titles[position]);



        }).attach();

    }

    @Override
    public void sendMessage(String message) {


        tv = findViewById(R.id.textView2);

        tv.setText(message);
    }
}