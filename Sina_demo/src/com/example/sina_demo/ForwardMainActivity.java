package com.example.sina_demo;

import java.util.ArrayList;
import java.util.List;

import com.example.sina_demo.fragment.FindFragment;
import com.example.sina_demo.fragment.FirstFragment;
import com.example.sina_demo.fragment.ForwardFindFragment;
import com.example.sina_demo.fragment.ForwardFirstFragment;
import com.example.sina_demo.fragment.ForwardMeFragment;
import com.example.sina_demo.fragment.ForwardMessageFragment;
import com.example.sina_demo.fragment.ForwardSendMessageFragment;
import com.example.sina_demo.fragment.MeFragment;
import com.example.sina_demo.fragment.MessageFragment;
import com.example.sina_demo.fragment.SendMessageFragment;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ForwardMainActivity extends FragmentActivity implements OnClickListener {
	private ForwardFirstFragment mForwardFirstFragment;
	private ForwardMessageFragment mForwardMessageFragment;
	private ForwardSendMessageFragment mForwardSendMessageFragment;
	private ForwardFindFragment mForwardFindFragment;
	private ForwardMeFragment mForwardMeFragment;
	private List<Button> mBtnList;
	private Button mFirstBtn,mMessageBtn,mSendMessageBtn,mFindBtn,mMeBtn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mForwardFirstFragment=new  ForwardFirstFragment();
		mForwardMessageFragment=new ForwardMessageFragment();
		mForwardSendMessageFragment=new ForwardSendMessageFragment();
		mForwardFindFragment=new ForwardFindFragment();
		mForwardMeFragment=new ForwardMeFragment();
		
		mFirstBtn=(Button) findViewById(R.id.firstBtn);
		mMessageBtn=(Button) findViewById(R.id.messageBtn);
		mSendMessageBtn=(Button) findViewById(R.id.sendBtn);
		mFindBtn=(Button) findViewById(R.id.findBtn);
		mMeBtn=(Button) findViewById(R.id.meBtn);
		
		mFirstBtn.setOnClickListener(this);
		mMessageBtn.setOnClickListener(this);
		mSendMessageBtn.setOnClickListener(this);
		mFindBtn.setOnClickListener(this);
		mMeBtn.setOnClickListener(this);

		
		
		getSupportFragmentManager().beginTransaction().add(R.id.container, mForwardFirstFragment).commit();;
		
		
		
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
		
		switch (arg0.getId()) {
		case R.id.firstBtn:
			beginTransaction.replace(R.id.container, mForwardFirstFragment);
			break;
		case R.id.messageBtn:
			beginTransaction.replace(R.id.container, mForwardMessageFragment);

			break;
		case R.id.sendBtn:
			beginTransaction.replace(R.id.container, mForwardSendMessageFragment);

			break;
		case R.id.findBtn:
			beginTransaction.replace(R.id.container, mForwardFindFragment);

			break;
		case R.id.meBtn:
			beginTransaction.replace(R.id.container, mForwardMeFragment);

			break;

		}
		beginTransaction.commit();
	}

}
