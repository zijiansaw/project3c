package edu.drake.project3c;

import java.util.Calendar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class SecondFragment extends Fragment {
	
	ImageView dailyView1,dailyView2,dailyView3,dailyView4,dailyView5,dailyView6,dailyView7;
	
	
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
		
		dailyView1 = (ImageView) view.findViewById(R.id.imageView1);
		dailyView2 = (ImageView) view.findViewById(R.id.imageView2);
		dailyView3 = (ImageView) view.findViewById(R.id.imageView3);
		dailyView4 = (ImageView) view.findViewById(R.id.imageView4);
		dailyView5 = (ImageView) view.findViewById(R.id.imageView5);
		dailyView6 = (ImageView) view.findViewById(R.id.imageView6);
		dailyView7 = (ImageView) view.findViewById(R.id.imageView7);
		
		Calendar dayOfYear = Calendar.getInstance();
		int dayOfWeek = dayOfYear.get(Calendar.DAY_OF_WEEK);
		
		
		
		
		
		
		
		
		
		
		
		
		//put your codes here
		//if you want to initialize image/buttons, insert view. in front of findViewById 
		//refer to FirstFragment for some help =)
		//by Larry
		
		return view;
		
	}

}
