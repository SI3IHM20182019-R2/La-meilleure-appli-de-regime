package com.example.regime_app.WelcomeView.WelcomePart;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.regime_app.MenuManagmentActivity;
import com.example.regime_app.R;

public class WelcomeActivity extends AppCompatActivity {

    private ViewPager my_pager;
    private Fragment[] fragments = {new WelcomeSlide1(), new WelcomeSlide2(), new WelcomeSlide3()};
    private WelcomeAdaptater welcomeAdaptater;

    private LinearLayout dotLayout;
    private ImageView[] dots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        my_pager = (ViewPager)findViewById(R.id.viewPager);
        welcomeAdaptater = new WelcomeAdaptater(getSupportFragmentManager(), fragments);
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
        dots = new ImageView[fragments.length];
        for (int i = 0; i < fragments.length ; ++i) {
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

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MenuManagmentActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK |Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
