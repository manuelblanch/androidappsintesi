package com.iesebre.DAM2.sintesi;

import com.sunil.actionabrtabnavigation.R;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class MainActivity extends FragmentActivity {
	
	ActionBar actionabar;
	ViewPager viewpager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
        actionabar = getActionBar();
        actionabar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        
        viewpager = (ViewPager) findViewById(R.id.pager);
        FragmentManager fm = getSupportFragmentManager();
        
        /** Defining a listener for pageChange */
        ViewPager.SimpleOnPageChangeListener pageChangeListener = new ViewPager.SimpleOnPageChangeListener(){
        	@Override
        	public void onPageSelected(int position) {        		
        		super.onPageSelected(position);
        		actionabar.setSelectedNavigationItem(position);        		
        	}        	
        };
        
        /** Setting the pageChange listener to the viewPager */
        viewpager.setOnPageChangeListener(pageChangeListener);
        
        /** Creating an instance of FragmentPagerAdapter */
        MyFragmentPagerAdapter fragmentPagerAdapter = new MyFragmentPagerAdapter(fm);
        
        viewpager.setAdapter(fragmentPagerAdapter);
        actionabar.setDisplayShowTitleEnabled(true);
        
        /** Defining tab listener */
        ActionBar.TabListener tabListener = new ActionBar.TabListener() {
			
			@Override
			public void onTabReselected(Tab arg0, android.app.FragmentTransaction arg1) {
				
			}

			@Override
			public void onTabSelected(Tab tab, android.app.FragmentTransaction ft) {
				viewpager.setCurrentItem(tab.getPosition());
				
			}

			@Override
			public void onTabUnselected(Tab tab, android.app.FragmentTransaction ft) {
			
			}
		};

		/** Creating Android Tab */
       // Tab tab = actionabar.newTab().setText("My Friends").setIcon(R.drawable.myfriends).setTabListener(tabListener);
		Tab tab = actionabar.newTab().setIcon(android.R.drawable.ic_dialog_info).setText("Noticies").setTabListener(tabListener);
        actionabar.addTab(tab);
        tab = actionabar.newTab().setIcon(android.R.drawable.btn_star_big_off).setText("Novetats").setTabListener(tabListener);                               
        actionabar.addTab(tab);       
        tab = actionabar.newTab().setIcon(android.R.drawable.ic_dialog_dialer).setText("Guies").setTabListener(tabListener);                               
        actionabar.addTab(tab);
        tab = actionabar.newTab().setIcon(android.R.drawable.ic_menu_agenda).setText("Analisi").setTabListener(tabListener);
        actionabar.addTab(tab);
        tab = actionabar.newTab().setIcon(android.R.drawable.btn_star_big_on).setText("Consoles").setTabListener(tabListener);
        actionabar.addTab(tab);


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
