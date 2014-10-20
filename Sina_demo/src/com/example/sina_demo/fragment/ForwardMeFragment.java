package com.example.sina_demo.fragment;

import com.example.sina_demo.LoginActivity;
import com.example.sina_demo.MainActivity;
import com.example.sina_demo.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class ForwardMeFragment extends Fragment {
	private Button mMeLoginBtn;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		
		
		
		// TODO Auto-generated method stub
		View view=inflater.inflate(R.layout.login_forward_me, null);
		mMeLoginBtn=(Button) view.findViewById(R.id.login_forword_me_loginBtn);
		mMeLoginBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent it=new Intent(getActivity(),LoginActivity.class);
				startActivity(it);
			}
		});
		return view;	
		}
}
