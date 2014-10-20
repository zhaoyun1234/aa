package com.example.sina_demo.adapter;
import java.util.List;

import com.example.sina_demo.R;
import com.example.sina_demo.vo.First;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class FirstAdapter extends BaseAdapter {
	//http://m.news.cntv.cn/special/json/index0927/index.json
	private List<First> mList;
	private Context mContext;
	public FirstAdapter(List<First> mList, Context mContext) {
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
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder viewHolder=null;
		if(convertView==null){
			viewHolder=new ViewHolder();
			convertView=LayoutInflater.from(mContext).inflate(R.layout.first_item, null);
			viewHolder.mImg=(ImageView) convertView.findViewById(R.id.first_per_img);
			viewHolder.mName=(TextView) convertView.findViewById(R.id.per_name);
			viewHolder.mFrom=(TextView) convertView.findViewById(R.id.from);
			convertView.setTag(viewHolder);
		}else{
			viewHolder=(ViewHolder) convertView.getTag();
		}
		viewHolder.mName.setText(mList.get(position).getName());
		viewHolder.mFrom.setText(mList.get(position).getFrom());

		return convertView;
	}
	class ViewHolder{
		ImageView mImg;
		TextView mName,mFrom;
		
	}
}
