package com.example.sina_demo.fragment;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import com.example.sina_demo.ChatActivity;
import com.example.sina_demo.R;
import com.example.sina_demo.adapter.MessageAdapter;
import com.example.sina_demo.vo.First;
import com.example.sina_demo.vo.Message;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

public class MessageFragment extends Fragment {
	private ListView mLv;
	private List<Message> mList;
	private Button mChatBtn;
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view=inflater.inflate(R.layout.message_listview, null);
		mLv=(ListView) view.findViewById(R.id.message_lv);
		mChatBtn=(Button) view.findViewById(R.id.chat);
		mList=select();
		MessageAdapter adapter=new MessageAdapter(mList, getActivity());
		mLv.setAdapter(adapter);
		mChatBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent it=new Intent(getActivity(),ChatActivity.class);
				startActivity(it);
			}
		});
		return view;
	}
	
	public List<Message> select(){
		List<Message> list=new ArrayList<Message>();
		Message m1=new Message(R.drawable.messagescenter_at,"@我的");
		Message m2=new Message(R.drawable.messagescenter_comments,"评论");
		Message m3=new Message(R.drawable.messagescenter_good,"赞");
		Message m4=new Message(R.drawable.messagescenter_at,"微博开放平台");
		Message m5=new Message(R.drawable.messagescenter_messagebox,"未关注人私信");
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);

		return list;
	
	}
}
