package edu.drake.project3c;

import java.util.Calendar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class SecondFragment extends Fragment {
	
	ImageView day1,day2,day3,day4,day5,day6,day7,
	dailyView1,dailyView2,dailyView3,dailyView4,dailyView5,dailyView6,dailyView7;
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View view = inflater.inflate(R.layout.activity_second_tab, container,false);
		
		int images[] = {getResources().getIdentifier("drawable/fact1", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/fact2", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/fact3", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/fact4", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/fact5", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/fact6", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/fact7", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/fact8", null, getActivity().getPackageName())};
		
		int week[] = {getResources().getIdentifier("drawable/sunday", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/monday", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/tuesday", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/wednesday", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/thursday", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/friday", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/saturday", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/sunday", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/monday", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/tuesday", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/wednesday", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/thursday", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/friday", null, getActivity().getPackageName()),
				getResources().getIdentifier("drawable/saturday", null, getActivity().getPackageName())};
		
		dailyView1 = (ImageView) view.findViewById(R.id.imageView1);
		dailyView2 = (ImageView) view.findViewById(R.id.imageView2);
		dailyView3 = (ImageView) view.findViewById(R.id.imageView3);
		dailyView4 = (ImageView) view.findViewById(R.id.imageView4);
		dailyView5 = (ImageView) view.findViewById(R.id.imageView5);
		dailyView6 = (ImageView) view.findViewById(R.id.imageView6);
		dailyView7 = (ImageView) view.findViewById(R.id.imageView7);
		
		day1 = (ImageView) view.findViewById(R.id.imageView1a);
		day2 = (ImageView) view.findViewById(R.id.imageView2a);
		day3 = (ImageView) view.findViewById(R.id.imageView3a);
		day4 = (ImageView) view.findViewById(R.id.imageView4a);
		day5 = (ImageView) view.findViewById(R.id.imageView5a);
		day6 = (ImageView) view.findViewById(R.id.imageView6a);
		day7 = (ImageView) view.findViewById(R.id.imageView7a);
		
		Calendar date = Calendar.getInstance();
		int dayOfWeek = date.get(Calendar.DAY_OF_WEEK)+7;
		int dayOfYear = date.get(Calendar.DAY_OF_YEAR);
		
		/*
		//This code is to change the images based on the dayOfYear
		dailyView1.setImageResource(images[dayOfYear-330]);
		dailyView2.setImageResource(images[dayOfYear-330]);
		dailyView3.setImageResource(images[dayOfYear-330]);
		dailyView4.setImageResource(images[dayOfYear-330]);
		dailyView5.setImageResource(images[dayOfYear-330]);
		dailyView6.setImageResource(images[dayOfYear-330]);
		dailyView7.setImageResource(images[dayOfYear-330]);	
		*/
		
		day1.setImageResource(week[dayOfWeek-2]);
		day2.setImageResource(week[dayOfWeek-3]);
		day3.setImageResource(week[dayOfWeek-4]);
		day4.setImageResource(week[dayOfWeek-5]);
		day5.setImageResource(week[dayOfWeek-6]);
		day6.setImageResource(week[dayOfWeek-7]);
		day7.setImageResource(week[dayOfWeek-8]);	
		
		
		return view;
		
	}

}
