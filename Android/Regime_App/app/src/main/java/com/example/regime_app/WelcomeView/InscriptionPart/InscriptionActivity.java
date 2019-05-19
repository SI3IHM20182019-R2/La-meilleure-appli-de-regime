package com.example.regime_app.WelcomeView.InscriptionPart;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.regime_app.R;

public class InscriptionActivity extends AppCompatActivity implements View.OnClickListener {

    private static final int NUM_PAGES = 2;
    private static final String TAG = "InscriptionActivity";

    private Fragment[] fragments;
    private ViewPager mPager;
    private PagerAdapter pagerAdapter;

    private Button nextBtn, prevBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        mPager = this.findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager(), fragments);
        mPager.setAdapter(pagerAdapter);

        nextBtn = this.findViewById(R.id.next_button);
        nextBtn.setOnClickListener(this);
        prevBtn = this.findViewById(R.id.prev_button);
        prevBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.next_button:
                loadNextSlide();
                break;
            case R.id.prev_button:
                break;
        }
    }

    private void loadNextSlide() {
        int nextSlide = mPager.getCurrentItem()+1;
        if (nextSlide < fragments.length) {
            mPager.setCurrentItem(nextSlide);
        }
    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        private Fragment[] fragments;

        public ScreenSlidePagerAdapter(FragmentManager fm, Fragment[] fragments) {
            super(fm);
            this.fragments = fragments;
        }

        @Override
        public Fragment getItem(int position) {
            return fragments[position];
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }

    }
}
