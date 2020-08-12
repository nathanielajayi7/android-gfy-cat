GfyCatLib is a simple library for using the GfyCat Library in Android

It can be initialized in two different ways

The preview of a gif result can be found at the key "gif100px" at any position

String gifPreview = arrayList.get(0).get("gif100px");

//Using the GfyCatBuilder
 GfyCat no = GfyCatBuilder.create(this, "Haha", 15);
 
 //Or using a direct initialization
 
 GfyCat c = new GfyCat(this);
		c.setKeyword("Haha");
		c.setLimit(15);
		ArrayList<HashMap<String,String>> n = c.getResult();
		
		This is the first release, hopefully more releases to come!