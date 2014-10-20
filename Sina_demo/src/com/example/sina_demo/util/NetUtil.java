package com.example.sina_demo.util;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
public class NetUtil {
	public static Bitmap getImageFromUrl(String imageUrl){
		Bitmap result=null;
		InputStream is=null;
		try {
			URL url=new URL(imageUrl);
			HttpURLConnection connparams=(HttpURLConnection) url.openConnection();
			connparams.setConnectTimeout(5*1000);
			connparams.setReadTimeout(5*1000);
			if(connparams.getResponseCode()==200){
				is=connparams.getInputStream();
				result=BitmapFactory.decodeStream(is);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				//关流不完整
				if(is!=null){
					is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
	public static String getStringFromUrl(String jsonStr){
		String result="";
		StringBuilder sb=new StringBuilder(jsonStr);
		BufferedReader br=null;
		try {
			URL url=new URL(sb.toString());
			HttpURLConnection conn=(HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(5*1000);
			conn.setReadTimeout(5*1000);
			br=new BufferedReader(new InputStreamReader(conn.getInputStream(),"gbk"));
			String str=null;
			StringBuilder respSb=new StringBuilder();
			while((str=br.readLine())!=null){
				respSb.append(str);
			}
			result=respSb.toString();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
