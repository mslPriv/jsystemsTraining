package msl.Collections.Propertiesy;

import java.util.Properties;

public class Props {
	public static void main(String[] args) {
		Properties props=new Properties();
		props.put("blog", "jsystems.pl/blog");
		props.put("main", "jsystems.pl/mainPage");
		for (Object key:props.keySet()){
			String propName=(String) key;
			System.out.printf("Url dla %s:%s\n",propName,props.getProperty(propName));
		}
		props.getProperty("another", "localhost");
		for (Object key:props.keySet()){
			String propName=(String) key;
			System.out.printf("Url dla %s:%s",propName,props.getProperty(propName));
		}
	}
}
