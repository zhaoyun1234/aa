package com.example.sina_demo.fragment;

import com.example.sina_demo.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class ForwardSendMessageFragment extends Fragment implements OnClickListener{
	private ImageButton mWenziBtn,picBtn,phoneBtn,qiandaoBtn,dianpingBtn,moreBtn;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view=inflater.inflate(R.layout.send_message, null);
		mWenziBtn=(ImageButton) view.findViewById(R.id.wenzi);
		picBtn=(ImageButton) view.findViewById(R.id.picBtn);
		phoneBtn=(ImageButton) view.findViewById(R.id.phoneBtn);
		qiandaoBtn=(ImageButton) view.findViewById(R.id.qiandaoBtn);
		dianpingBtn=(ImageButton) view.findViewById(R.id.dianpingBtn);
		moreBtn=(ImageButton) view.findViewById(R.id.moreBtn);

		mWenziBtn.setOnClickListener(this);
		picBtn.setOnClickListener(this);
		phoneBtn.setOnClickListener(this);
		qiandaoBtn.setOnClickListener(this);
		dianpingBtn.setOnClickListener(this);
		moreBtn.setOnClickListener(this);




		return view;	
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.wenzi:

			break;
		case R.id.picBtn:

			break;
		case R.id.phoneBtn:

			break;
		case R.id.qiandaoBtn:

			break;
		case R.id.dianpingBtn:

			break;		
		case R.id.moreBtn:

			break;


		default:
			break;
		}
	}
}
