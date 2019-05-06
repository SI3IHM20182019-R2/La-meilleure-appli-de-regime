package com.example.regime_app.WelcomeView;

import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.regime_app.R;

public class WelcomeActivity extends AppCompatActivity {

    private ViewPager my_pager;
    private int[] layouts = {R.layout.option_inscription_view_1, R.layout.option_inscription_view_2, R.layout.option_inscription_view_3};
    private WelcomeAdaptater welcomeAdaptater;

    private LinearLayout dotLayout;
    private ImageView[] dots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        my_pager = (ViewPager)findViewById(R.id.viewPager);
        welcomeAdaptater = new WelcomeAdaptater(layouts, this);
        my_pager.setAdapter(welcomeAdaptater);

        dotLayout = (LinearLayout)findViewById(R.id.dotsLayout);
        createDots(0);

        my_pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int position) {
                createDots(position);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

    private void createDots(int current_position) {
        if (dotLayout != null) dotLayout.removeAllViews();
        dots = new ImageView[layouts.length];
        for (int i = 0 ; i < layouts.length ; ++i) {
            dots[i] = new ImageView(this);
            if (i == current_position) {
                dots[i].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.active_dots));
            } else {
                dots[i].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.default_dots));
            }
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT);
            params.setMargins(4,0,4,0);
            dotLayout.addView(dots[i], params);
        }
    }
}
