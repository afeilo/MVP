package com.xiefei.lottery;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.xiefei.lottery.fragment.LotteryFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by xiefei on 2016/3/16.
 */
public class LotteryViewPagerAty extends AppCompatActivity {
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.tab_layout)
    TabLayout tabLayout;
    @Bind(R.id.view_pager)
    ViewPager viewPager;
    private int[] viewPagerTitles = {R.string.snatch_record_tab,R.string.winning_tab_record};
    private Fragment[] viewPagerFragments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lottery_content);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.lottery_name);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        viewPagerFragments = new Fragment[]{new LotteryFragment(),new LotteryFragment()};
        viewPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
    }
    class MyFragmentPagerAdapter extends FragmentStatePagerAdapter{

        public MyFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return viewPagerFragments[position];
        }

        @Override
        public int getCount() {
            return viewPagerFragments.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return getResources().getString(viewPagerTitles[position]);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        ButterKnife.unbind(this);
    }

}
