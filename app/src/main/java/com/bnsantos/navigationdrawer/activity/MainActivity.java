package com.bnsantos.navigationdrawer.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Gravity;
import android.view.View;

import com.bnsantos.navigationdrawer.R;
import com.bnsantos.navigationdrawer.fragment.CenterFragment;

import java.lang.ref.WeakReference;


public class MainActivity extends ActionBarActivity {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;

    private WeakReference<Fragment> mCenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.hideOverflowMenu();
        toolbar.findViewById(R.id.toolbarNotification).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mDrawerLayout!=null&&!mDrawerLayout.isDrawerOpen(Gravity.END)){
                    mDrawerLayout.closeDrawer(Gravity.START);
                    mDrawerLayout.openDrawer(Gravity.END);
                }
            }
        });
        toolbar.findViewById(R.id.toolbarLogo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mDrawerLayout!=null&&!mDrawerLayout.isDrawerOpen(Gravity.START)){
                    mDrawerLayout.closeDrawer(Gravity.END);
                    mDrawerLayout.openDrawer(Gravity.START);
                }
            }
        });

        setSupportActionBar(toolbar);


        // ActionBarDrawerToggle ties together the the proper interactions
        // between the sliding drawer and the action bar app icon
        mDrawerToggle = new ActionBarDrawerToggle(
                this,                  /* host Activity */
                mDrawerLayout,         /* DrawerLayout object */
                toolbar,               /* tool bar */
                R.string.open,  /* "open drawer" description for accessibility */
                R.string.close  /* "close drawer" description for accessibility */
        ) {
            public void onDrawerClosed(View view) {
                getActionBar().setTitle("TEste title");
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }

            public void onDrawerOpened(View drawerView) {
                getActionBar().setTitle("Teste title");
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
        };

        if (savedInstanceState == null) {
            initFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.content_frame, mCenter.get())
                    .commit();
        }
    }

    private void initFragment(){
        mCenter = new WeakReference<Fragment>(CenterFragment.newInstance());
    }

    public void togle(){
        if(mDrawerLayout!=null){
            mDrawerLayout.closeDrawer(Gravity.START);
            mDrawerLayout.closeDrawer(Gravity.END);
        }
    }
}
