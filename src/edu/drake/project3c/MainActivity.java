package edu.drake.project3c;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
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
		
		/*
		dailyView = (ImageView) findViewById(R.id.dailyView);
		int images[] = {getResources().getIdentifier("drawable/animal1", null, getPackageName()),
				getResources().getIdentifier("drawable/animal2", null, getPackageName()),
				getResources().getIdentifier("drawable/animal3", null, getPackageName()),
				getResources().getIdentifier("drawable/animal4", null, getPackageName()),
				getResources().getIdentifier("drawable/animal5", null, getPackageName()),
				getResources().getIdentifier("drawable/animal6", null, getPackageName()),
				getResources().getIdentifier("drawable/animal7", null, getPackageName()),
				getResources().getIdentifier("drawable/animal8", null, getPackageName()),
				getResources().getIdentifier("drawable/animal9", null, getPackageName()),
				getResources().getIdentifier("drawable/animal10", null, getPackageName()),
				getResources().getIdentifier("drawable/animal11", null, getPackageName()),
				getResources().getIdentifier("drawable/animal12", null, getPackageName()),
				getResources().getIdentifier("drawable/animal13", null, getPackageName()),
				getResources().getIdentifier("drawable/animal14", null, getPackageName())};
		
		Calendar dayOfYear = Calendar.getInstance();
		int currentDayOfYear = dayOfYear.get(Calendar.DAY_OF_YEAR);
		Toast.makeText(this, "Number of days : "+currentDayOfYear, Toast.LENGTH_SHORT).show();
		
		dailyView.setImageResource(images[currentDayOfYear-330]);	
		
		SimpleDateFormat df = new SimpleDateFormat("MMMM dd, yyyy");
		String date = df.format(dayOfYear.getTime());
		setTitle(date);
		 */

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
