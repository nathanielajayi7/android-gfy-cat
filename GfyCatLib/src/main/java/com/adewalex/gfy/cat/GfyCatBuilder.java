package com.adewalex.gfy.cat;

import android.content.Context;

public class GfyCatBuilder
{
	public static GfyCat create(Context c, String keyword, int limit){
		GfyCat n = new GfyCat(c);
		n.setKeyword(keyword);
		n.setLimit(limit);
		return n;
	}
}
