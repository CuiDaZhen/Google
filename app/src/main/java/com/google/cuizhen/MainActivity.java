package com.google.cuizhen;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initActionBar();
        initView();
        initActionBarDrawerToggle();
    }

    private void initActionBarDrawerToggle() {
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout, R.string.oepn,R.string.close);
        mToggle.syncState();
        mDrawerLayout.setDrawerListener(mToggle);
    }

    private void initView() {
        mDrawerLayout = (DrawerLayout) findViewById(R.id.main_drawaerLayout);
    }

    private void initActionBar() {
        //得到actionbar实例
        ActionBar supportActionBar = getSupportActionBar();//V 4包中
        //设置标题
        supportActionBar.setTitle("主标题");
        supportActionBar.setSubtitle("副标题");
        //设置图标
        //supportActionBar.setIcon();图片资源设置在drawable中
        //supportActionBar.setLogo();图片资源设置在mipmap中

        //显示logo或者icon(图标)
        supportActionBar.setDisplayShowHomeEnabled(true);
        //修改logo和icon显示的优先级
        supportActionBar.setDisplayUseLogoEnabled(true);//用logo不用icon,false是用icon
        //显示回退部分
        supportActionBar.setDisplayHomeAsUpEnabled(true);//默认是false,隐藏了回退部分

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //点击toggle可以控制drawerLayout开关
                mToggle.onOptionsItemSelected(item);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}