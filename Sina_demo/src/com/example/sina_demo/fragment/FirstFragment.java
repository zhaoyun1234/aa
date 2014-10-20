package com.example.sina_demo.fragment;
import java.util.List;
import com.example.sina_demo.R;
import com.example.sina_demo.adapter.NewsAdapter;
import com.example.sina_demo.util.NetUtil;
import com.example.sina_demo.vo.Comment;
import com.example.sina_demo.vo.News;
import com.google.gson.Gson;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Toast;
public class FirstFragment extends Fragment {
	private ListView mLv;
	private List<News> mList;
	private Button mActionBtn;
	private Comment comment;
	private static final String URL="http://m.news.cntv.cn/special/json/index0927/index.json";
	private Handler mHandler=new Handler(){
		public void handleMessage(android.os.Message msg) {
			switch (msg.what) {
			case 1:
				NewsAdapter adapter=new NewsAdapter(mList, getActivity());
//				ArrayAdapter<News> adapter=new ArrayAdapter<News>(getActivity(), android.R.layout.simple_list_item_1, mList);
				Toast.makeText(getActivity(), "suc", 0).show();
				mLv.setAdapter(adapter);
				break;
			case 2:
				Toast.makeText(getActivity(), "fail", 0).show();
				break;
			default:
				break;
			}
		};
	};
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view=inflater.inflate(R.layout.first_listview, null);
		mActionBtn=(Button) view.findViewById(R.id.popBtn);
		mLv=(ListView) view.findViewById(R.id.first_lv);
		new Thread(new Runnable() {
			@Override
			public void run() {

				// TODO Auto-generated method stub
			String result=NetUtil.getStringFromUrl(URL);
			if(result!=null){
				mList=parseJson(result).getData().getBigImg();
				mHandler.sendEmptyMessage(1);
			}else{
				mHandler.sendEmptyMessage(2);

			}
			}
		}).start();
		View view1=View.inflate(getActivity(), R.layout.first_popwindow, null);
		final PopupWindow pw=new PopupWindow(view1, -2, -2);
		mActionBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				pw.showAsDropDown(v);
			}
		});
		
		return view;
		
	}
	
	public Comment parseJson(String jsonStr){
		Log.d("jsonStr", jsonStr);
	Gson gson=new Gson();
	Comment comment=gson.fromJson(jsonStr, Comment.class);
	return comment;
	
	
	
	}
	
}
