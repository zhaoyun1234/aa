package com.example.sina_demo.fragment;
import java.util.ArrayList;
import java.util.List;

import com.example.sina_demo.R;
import com.example.sina_demo.SetActivity;
import com.example.sina_demo.adapter.MeAdapter;
import com.example.sina_demo.vo.Me;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
public class MeFragment extends Fragment {
	private Button mSettingBtn;
	private ListView mLv;
	private MeAdapter adapter;
	private List<Me> mList;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view= inflater.inflate(R.layout.my_detail_listview, null);
		mLv=(ListView) view.findViewById(R.id.my_detail_listview);
		mList=select();
		adapter=new MeAdapter(mList, getActivity());
		mLv.setAdapter(adapter);
		mLv.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				
			}
		});
		mSettingBtn=(Button) view.findViewById(R.id.mydetail_settingBtn);
		mSettingBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent it=new Intent(getActivity(),SetActivity.class);
				startActivity(it);
			}
		});
		return view;
	}
	public List<Me> select(){
		List<Me> list=new ArrayList<Me>();
		Me m1=new Me(R.drawable.poi_icon_myplace, "新的朋友（0）");
		Me m2=new Me(R.drawable.more_chat, "我的相册（0）");
		Me m3=new Me(R.drawable.poi_icon_myplace, "新的收藏（0）");
		Me m4=new Me(R.drawable.poi_icon_myplace, "赞（0）");
		Me m5=new Me(R.drawable.more_chat_highlighted, "微博支付");
		Me m6=new Me(R.drawable.poi_icon_myplace, "个性化");
		Me m7=new Me(R.drawable.push_icon_app_small_2, "我的名片");
		Me m8=new Me(R.drawable.market_book, "草稿箱");
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		list.add(m6);
		list.add(m7);
		list.add(m8);
		return list;
	}
}
