package com.example.sina_demo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ChatActivity extends Activity {
	private EditText mUsernameEdit,mPasswordEdit;
	private Button mLoginBtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		//初始化组建
		mUsernameEdit=(EditText) findViewById(R.id.username);
		mPasswordEdit=(EditText) findViewById(R.id.password);
		mLoginBtn=(Button) findViewById(R.id.login);
		mLoginBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent it=new Intent(ChatActivity.this,MainActivity.class);
				startActivity(it);
			}
		});
	}


}
