package edu.drake.project3c;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class ThirdFragment extends Fragment {
	ImageButton imagebtn1;
	ImageButton imagebtn2;
	ImageButton imagebtn3;
	ImageButton imagebtn4;
	ImageButton imagebtn5;
	ImageButton imagebtn1a;
	ImageButton imagebtn2a;
	ImageButton fav;
	ImageButton left;
	ImageButton right;
	ImageButton reset;
	ImageButton buffer;
	ImageView image;
	int dispnum = -1;
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View view = inflater.inflate(R.layout.activity_third_tab, container,false);
		//put your codes here
		//if you want to initialize image/buttons, insert view. in front of findViewById 
		//refer to FirstFragment for some help =)
		//by Larry
		
		imagebtn1a = (ImageButton)view.findViewById(R.id.imageButton1a);
		imagebtn2a = (ImageButton)view.findViewById(R.id.imageButton2a);
		fav = (ImageButton)view.findViewById(R.id.favorite);
		
		image = (ImageView) view.findViewById(R.id.imageView1);
		imagebtn1 = (ImageButton)view.findViewById(R.id.imageButton1);
		imagebtn1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				do1(v, 0);
			}
		});
		imagebtn2 = (ImageButton)view.findViewById(R.id.imageButton2);
		imagebtn2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				do1(v, 1);
			}
		});
		imagebtn3 = (ImageButton)view.findViewById(R.id.imageButton3);
		imagebtn3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				do1(v, 2);
			}
		});
		imagebtn4 = (ImageButton)view.findViewById(R.id.imageButton4);
		imagebtn4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				do1(v, 3);
			}
		});
		imagebtn5 = (ImageButton)view.findViewById(R.id.imageButton5);
		imagebtn5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				do1(v, 4);
			}
		});
		left = (ImageButton)view.findViewById(R.id.lefta);
		left.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				left(v);
			}
		});
		right = (ImageButton)view.findViewById(R.id.righta);
		right.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				right(v);
			}
		});
		left.setEnabled(false);
		right.setEnabled(false);
		reset = (ImageButton)view.findViewById(R.id.reset);
		reset.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				reset(v);
			}
		});
		buffer = (ImageButton)view.findViewById(R.id.buffer);
		buffer.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				System.out.println("buffer");
			}
		});
		reset.setEnabled(false);
		buffer.setEnabled(false);
		buffer.setBackgroundColor(Color.TRANSPARENT);
		left.setBackgroundColor(Color.TRANSPARENT);
		right.setBackgroundColor(Color.TRANSPARENT);
		
		
		return view;
	}
	
	public void do1(View view, int i){
		imagebtn1.setEnabled(false);
		imagebtn2.setEnabled(false);
		imagebtn3.setEnabled(false);
		imagebtn4.setEnabled(false);
		dispnum = i;
		switch (i) {
			case 0 : image.setImageResource(R.drawable.fact2);
				break;
			case 1 : image.setImageResource(R.drawable.fact5);
				break;	
			case 2 : image.setImageResource(R.drawable.fact4);
				break;
			case 3 : image.setImageResource(R.drawable.fact3);
				break;
			case 4 : image.setImageResource(R.drawable.fact1);
				break;
		}
		image.setVisibility(View.VISIBLE);
		left.setVisibility(View.VISIBLE);
		right.setVisibility(View.VISIBLE);
		reset.setVisibility(View.VISIBLE);
		buffer.setVisibility(View.VISIBLE);
		imagebtn1a.setVisibility(View.VISIBLE);
		imagebtn2a.setVisibility(View.VISIBLE);
		fav.setVisibility(View.VISIBLE);
		left.setEnabled(true);
		right.setEnabled(true);
		reset.setEnabled(true);
		buffer.setEnabled(true);
	}
	
		public void update(int i){
			imagebtn1.setEnabled(false);
			imagebtn2.setEnabled(false);
			imagebtn3.setEnabled(false);
			imagebtn4.setEnabled(false);
			dispnum = i;
			switch (i) {
				case 0 : image.setImageResource(R.drawable.fact2);
					break;
				case 1 : image.setImageResource(R.drawable.fact5);
					break;	
				case 2 : image.setImageResource(R.drawable.fact4);
					break;
				case 3 : image.setImageResource(R.drawable.fact3);
					break;
				case 4 : image.setImageResource(R.drawable.fact1);
					break;
			}
		
		image.setVisibility(View.VISIBLE);
	}
	public void left(View view){
		int n;
		if (dispnum ==0) n = 4;
		else n = (dispnum-1)%5;
		update( n);
	}
	public void right(View view){
		int n = (dispnum+1)%5;
		update( n);
	}
	public void reset(View view){
		image.setVisibility(View.INVISIBLE);
		left.setVisibility(View.INVISIBLE);
		right.setVisibility(View.INVISIBLE);
		reset.setVisibility(View.INVISIBLE);
		buffer.setVisibility(View.INVISIBLE);
		imagebtn1a.setVisibility(View.INVISIBLE);
		imagebtn2a.setVisibility(View.INVISIBLE);
		fav.setVisibility(View.INVISIBLE);
		left.setEnabled(false);
		right.setEnabled(false);
		reset.setEnabled(false);
		buffer.setEnabled(false);
		imagebtn1.setEnabled(true);
		imagebtn2.setEnabled(true);
		imagebtn3.setEnabled(true);
		imagebtn4.setEnabled(true);
	}

}
