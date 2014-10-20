package com.example.sina_demo.adapter;

import java.util.List;

import com.example.sina_demo.R;
import com.example.sina_demo.vo.Message;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MessageAdapter extends BaseAdapter {
	private List<Message> mList;
	private Context mContext;
	
	public MessageAdapter(List<Message> mList, Context mContext) {
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
			arg1=LayoutInflater.from(mContext).inflate(R.layout.message_item, null);
			viewHolder.mImg=(ImageView) arg1.findViewById(R.id.messageImg);
			viewHolder.mContent=(TextView) arg1.findViewById(R.id.messageContent);
			arg1.setTag(viewHolder);
		}else{
			viewHolder=(ViewHolder) arg1.getTag();
		}
		viewHolder.mImg.setImageResource(mList.get(arg0).getImg());
		viewHolder.mContent.setText(mList.get(arg0).getContent());
		return arg1;
	}
	class ViewHolder{
		ImageView mImg;
		TextView mContent;
		
	}

}
