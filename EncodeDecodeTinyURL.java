package leetcode;

import java.util.HashMap;
import java.util.Random;

public class EncodeDecodeTinyURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a = Math.random();
		
		
	
	Codec codec = new Codec();
	
	String getshort = codec.encode("https://leetcode.com/problems/design-tinyurl");
	System.out.println(getshort);
	String getoriginal = codec.decode("http://tinyurl.com/4e9iAk");
	System.out.println(getoriginal);
	}
}

 class Codec {
	 
	 HashMap<String, String> urls = new HashMap<>();
    
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
    	int l = longUrl.length();
    	int slash_detector = longUrl.indexOf("/") + 2;
    	
    	if(l > 15)
    	{
    		String cutter = longUrl.substring(l-7);
    		String random_short = "4e9iAk";
    		String ender = ".com/";
    		String collector = longUrl.substring(0, slash_detector) + cutter + ender 
    				+ random_short;
    		urls.put(random_short, longUrl);
    	//	System.out.println("original key:"+random_short.length());
    	//	System.out.println("value for key: "+ urls.get(random_short));
    		return collector;
    	}
		return longUrl;
        
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
    	String key = shortUrl.substring(shortUrl.length() - 6);
    	String longUrl = urls.get(key);
		return longUrl;
        
    }
}
 
 
