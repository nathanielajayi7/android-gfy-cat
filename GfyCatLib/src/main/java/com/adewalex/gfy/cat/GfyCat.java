package com.adewalex.gfy.cat;

import android.os.AsyncTask;
import android.content.Context;

import java.util.ArrayList;
import java.util.HashMap;

import android.widget.GridView;

import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class GfyCat
{
	private static Context context;
	private static String keyword;
	private static String limit = "10";
	private static String baseUrl = "https://api.gfycat.com/v1/gfycats/search?search_text=";
	
	public GfyCat(Context context){
		this.context = context;
	}
	
	public GfyCat(Context context, String keyword){
		this.context = context;
		this.keyword = keyword;
	}
	
	public static void setKeyword(String _keyword){
		keyword = _keyword;
	}
	
	public static void setLimit(int _limit){
		limit = String.valueOf(_limit);
	}
	
	
	@Deprecated
	private static void setUpWithGridView(GridView grid){
		//Upcoming function
	}
	public static ArrayList<HashMap<String,String>> getResult(){
		
		ArrayList<HashMap<String,String>> result = new ArrayList<>();
		String response = "";
		response = ServiceHandler.findJSONFromUrl(createUrl());
		try{
			final org.json.JSONObject _js = new org.json.JSONObject(response);
		
			final org.json.JSONArray _arr = new org.json.JSONArray(_js.getString("gfycats"));
			result = new Gson().fromJson(_arr.toString(), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			
		}catch(Exception e){
			
		}
		
		
		return result;
	}
	private static String createUrl(){
		return baseUrl.concat(keyword).concat("&count=" + limit);
	}
	
	
}
	

