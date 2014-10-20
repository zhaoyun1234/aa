package com.example.sina_demo;

import com.example.sina_demo.fragment.FirstFragment;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class WenziActivity extends Activity {
	private Button mSendBtn;
	private EditText mContentEdit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wenzi);
		mSendBtn=(Button) findViewById(R.id.send_wenzi);
		mContentEdit=(EditText)findViewById(R.id.contentEdit);
		mSendBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String content=mContentEdit.getText().toString().trim();
				Intent it=new Intent(WenziActivity.this,FirstFragment.class);
				
				startActivity(it);
			}
		});
	}


}
