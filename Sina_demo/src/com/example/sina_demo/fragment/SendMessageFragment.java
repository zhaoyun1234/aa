package com.example.sina_demo.fragment;
import com.example.sina_demo.R;
import com.example.sina_demo.WenziActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
public class SendMessageFragment extends Fragment {
	private Button mReturnBtn;
	private ImageButton mWenziBtn;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view=inflater.inflate(R.layout.send_message, null);
		mReturnBtn=(Button) view.findViewById(R.id.sendMessagereturn);
		mWenziBtn=(ImageButton) view.findViewById(R.id.wenzi);
		mReturnBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent it=new Intent(getActivity(),FirstFragment.class);
				startActivity(it);
			}
		});
		mWenziBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent it=new Intent(getActivity(),WenziActivity.class);
				startActivity(it);
			}
		});
		return view;
	}
}
