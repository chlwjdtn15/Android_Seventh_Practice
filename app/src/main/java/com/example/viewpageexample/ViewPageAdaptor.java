package com.example.viewpageexample;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPageAdaptor extends FragmentStateAdapter {
    public ViewPageAdaptor(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public ViewPageAdaptor(@NonNull Fragment fragment) {
        super(fragment);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {



        Fragment fragment = new FragmentA();


        if( position == 0 ){
            fragment = new FragmentA();



        }else {
            if (position == 1) {
                fragment = new FragmentB();
            } else {
                fragment = new FragmentC();
            }
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
