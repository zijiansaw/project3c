//This is a comment from Professor Urness
//You should put your names in comments...

//This is Project 3C (Midwest : Hell Yes! by Larry, Paxten and Giuliani.


package edu.drake.project3c;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class MainActivity extends FragmentActivity implements ActionBar.TabListener{
	ActionBar actionbar;
	ViewPager viewpager;
	FragmentPageAdapter ft;
	ImageView dailyView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		viewpager = (ViewPager) findViewById(R.id.pager);
		ft = new FragmentPageAdapter(getSupportFragmentManager());
		
		actionbar = getActionBar();
		viewpager.setAdapter(ft);
		actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		actionbar.addTab(actionbar.newTab().setText("Today").setTabListener(this));
		actionbar.addTab(actionbar.newTab().setText("Week").setTabListener(this));
		actionbar.addTab(actionbar.newTab().setText("Favorites").setTabListener(this));
		viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
			
			@Override
			public void onPageSelected(int arg0) {
				actionbar.setSelectedNavigationItem(arg0);
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		switch(item.getItemId()) 
	      { 
	      case R.id.action_settings:
	         System.out.println("settings");
	            return true;
	      case R.id.aboutRaygun:
	        System.out.println("raygun");
	        goToUrl ( "http://raygunsite.com/pages/our-story");
	            return true;

	      }
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		viewpager.setCurrentItem(tab.getPosition());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
	
	public void goToRayGun (View view) {
        goToUrl ( "http://raygunsite.com/");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }   
	
    public void share(View view){
    	Intent shareIntent = new Intent();
    	shareIntent.setAction(Intent.ACTION_SEND);
    	Uri imageUri = Uri.parse("android.resource://edu.drake.project3c/drawable/animal1");
    	shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
    	shareIntent.setType("image/png");
    	startActivity(Intent.createChooser(shareIntent, "MidWest Hell Yes!"));
    	
    }
	
}
