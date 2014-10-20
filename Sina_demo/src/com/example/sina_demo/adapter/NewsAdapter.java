package com.example.sina_demo.adapter;

import java.util.List;

import com.example.sina_demo.R;
import com.example.sina_demo.vo.News;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsAdapter extends BaseAdapter {
	private List<News> mList;
	private Context mContext;
	
	public NewsAdapter(List<News> mList, Context mContext) {
		super();
		this.mList = mList;
		this.mContext = mContext;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mList.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return mList.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		ViewHolder viewHolder=null;
		if(arg1==null){
			viewHolder=new ViewHolder();
			arg1=LayoutInflater.from(mContext).inflate(R.layout.first_item, null);
			viewHolder.mPhoneImg=(ImageView) arg1.findViewById(R.id.first_per_img);
			viewHolder.title=(TextView) arg1.findViewById(R.id.per_name);
			viewHolder.brief=(TextView) arg1.findViewById(R.id.from);
			viewHolder.itemType=(TextView) arg1.findViewById(R.id.first_content);
			arg1.setTag(viewHolder);

		}else{
			viewHolder=(ViewHolder) arg1.getTag();
		}
		viewHolder.title.setText(mList.get(arg0).getTitle());
		viewHolder.brief.setText(mList.get(arg0).getBrief());
		viewHolder.itemType.setText(mList.get(arg0).getItemType());

		return arg1;
	}
	class ViewHolder{
		ImageView mPhoneImg,padImg;
		TextView title,brief,itemType,itemID,detailUrl;
	}
}
