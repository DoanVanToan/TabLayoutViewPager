package toandoan.framgia.com.tablayoutviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initToolbar();
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("MainActivity");
    }

    private void initViews() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(new MainPagerAdapter(getSupportFragmentManager()));
    }

    public class MainPagerAdapter extends FragmentPagerAdapter {
        private final int TAB_NUMBER = 6;

        public MainPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return new SampleFragment();
        }

        @Override
        public int getCount() {
            return TAB_NUMBER;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return "page " + position;
        }
    }
}
