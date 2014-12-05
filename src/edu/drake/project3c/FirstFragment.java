//This is another comment that Professor Urness made.

package edu.drake.project3c;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FirstFragment extends Fragment {
	ImageView dailyView;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View view = inflater.inflate(R.layout.activity_first_tab, container,false);
		
		dailyView = (ImageView) view.findViewById(R.id.dailyView);
		int images[] = {getResources().getIdentifier("drawable/fact1", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/fact2", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/fact3", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/fact4", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/fact5", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/fact6", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/fact7", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/fact8", null, getActivity().getPackageName())};
		
		Calendar dayOfYear = Calendar.getInstance();
		int currentDayOfYear = dayOfYear.get(Calendar.DAY_OF_YEAR);
		//Toast.makeText(this, "Number of days : "+currentDayOfYear, Toast.LENGTH_SHORT).show();
		
		dailyView.setImageResource(images[currentDayOfYear-335]);	
		
		SimpleDateFormat df = new SimpleDateFormat("MMMM dd, yyyy");
		String date = df.format(dayOfYear.getTime());
		
			
		return view;

	}		
	
}
