package edu.drake.project3c;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ThirdFragment extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View view = inflater.inflate(R.layout.activity_third_tab, container,false);
		//put your codes here
		//if you want to initialize image/buttons, insert view. in front of findViewById 
		//refer to FirstFragment for some help =)
		//by Larry
		return view;
	}

}
