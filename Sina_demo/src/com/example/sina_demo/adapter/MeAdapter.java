package com.example.sina_demo.adapter;

import java.util.List;

import com.example.sina_demo.R;
import com.example.sina_demo.vo.Me;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MeAdapter extends BaseAdapter {
	private List<Me> mList;
	private Context mContext;
	
	public MeAdapter(List<Me> mList, Context mContext) {
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
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return mList.get(position);
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
			convertView=LayoutInflater.from(mContext).inflate(R.layout.my_detail_item, null);
			viewHolder.mImg=(ImageView) convertView.findViewById(R.id.my_detail_item_img);
			viewHolder.mName=(TextView) convertView.findViewById(R.id.my_detail_item_name);
			convertView.setTag(viewHolder);
		}else{
			viewHolder=(ViewHolder) convertView.getTag();
			
		}
		viewHolder.mImg.setImageResource(mList.get(position).getImg());
		viewHolder.mName.setText(mList.get(position).getName());
		return convertView;
	}
	class ViewHolder{
		ImageView mImg;
		TextView mName;
		
	}
}
