package com.example.sina_demo;
import java.util.ArrayList;
import java.util.List;

import com.example.sina_demo.fragment.FindFragment;
import com.example.sina_demo.fragment.FirstFragment;
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
public class MainActivity extends FragmentActivity implements OnClickListener {
	private FirstFragment mFirstFragment;
	private FindFragment mFindFragment;
	private SendMessageFragment mSendMessageFragment;
	private MessageFragment mMessageFragment;
	private MeFragment mMeFragment;
	private Button mFirstBtn,mMessageBtn,mDetailBtn,mFindBtn,mMeBtn;
	private List<Button> mBtnList;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//初始化fragment
		mFirstFragment=new FirstFragment();
		mMessageFragment=new MessageFragment();
		mSendMessageFragment=new SendMessageFragment();
		mFindFragment=new FindFragment();
		mMeFragment=new MeFragment();

		//初始化按钮
		mBtnList=new ArrayList<Button>();
		mFirstBtn=(Button) findViewById(R.id.firstBtn);
		mMessageBtn=(Button) findViewById(R.id.messageBtn);
		mDetailBtn=(Button) findViewById(R.id.sendBtn);
		mFindBtn=(Button) findViewById(R.id.findBtn);
		mMeBtn=(Button) findViewById(R.id.meBtn);
		mBtnList.add(mFirstBtn);
		mBtnList.add(mMessageBtn);
		mBtnList.add(mDetailBtn);
		mBtnList.add(mFindBtn);
		mBtnList.add(mMeBtn);

		mFirstBtn.setOnClickListener(this);
		mMessageBtn.setOnClickListener(this);
		mDetailBtn.setOnClickListener(this);
		mFindBtn.setOnClickListener(this);
		mMeBtn.setOnClickListener(this);

		getSupportFragmentManager().beginTransaction().add(R.id.container, mFirstFragment).commit();


	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
		switch (v.getId()) {
		case R.id.firstBtn:
			beginTransaction.replace(R.id.container, mFirstFragment);
			select(0);
			break;
		case R.id.messageBtn:
			beginTransaction.replace(R.id.container, mMessageFragment);
			select(1);
			select1(0);

			break;
		case R.id.sendBtn:
			beginTransaction.replace(R.id.container, mSendMessageFragment);

			break;
		case R.id.findBtn:
			beginTransaction.replace(R.id.container, mFindFragment);
			select(3);
			select1(1);
			break;
		case R.id.meBtn:
			beginTransaction.replace(R.id.container, mMeFragment);
			select(4);
			select1(3);

			break;
		default:
			break;
		}
		beginTransaction.commit();
	}

	@SuppressLint("NewApi")
	public void select(int p){
		for(int i=0;i<mBtnList.size();i++){
			if(i==p){
				if(i==0){
					mBtnList.get(i).setBackgroundResource(R.drawable.firstbtn2);
				}else if(i==1){
					mBtnList.get(i).setBackgroundResource(R.drawable.messagebtn2);

				}else if(i==3){
					mBtnList.get(i).setBackgroundResource(R.drawable.findbtn2);

				}else if(i==4){
					mBtnList.get(i).setBackgroundResource(R.drawable.mebtn2);

				}
			}
		}
	}

	public void select1(int p){
		for(int i=0;i<mBtnList.size();i++){
			if(i==p){
				if(i==0){
					mBtnList.get(i).setBackgroundResource(R.drawable.firstbtn1);
				}else if(i==1){
					mBtnList.get(i).setBackgroundResource(R.drawable.messagebtn1);

				}else if(i==3){
					mBtnList.get(i).setBackgroundResource(R.drawable.findbtn1);

				}else if(i==4){
					mBtnList.get(i).setBackgroundResource(R.drawable.mebtn1);

				}
			}
		}
	}
}
