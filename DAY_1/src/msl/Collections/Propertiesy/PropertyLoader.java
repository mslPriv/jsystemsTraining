package msl.Collections.Propertiesy;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.sun.corba.se.impl.orbutil.GetPropertyAction;



public class PropertyLoader {
	private static final String PROPERTIES_FILE= "config.properties";
	private static final Properties PROPERTIES=loadProperties();
	private static Properties loadProperties() {
		Properties properties=new Properties();
		try(InputStream input= PropertyLoader.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE)){
			properties.load(input);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		return properties;
	}

	static String GetProperty(String key){
		return PROPERTIES.getProperty(key);
		
	}
	public static void main(String[] args) {
		System.out.println(GetProperty("wiadomosc"));
//		Properties props=new Properties();
//		props.put("blog", "jsystems.pl/blog");
//		props.put("main", "jsystems.pl/mainPage");
//		for (Object key:props.keySet()){
//			String propName=(String) key;
//			System.out.printf("Url dla %s:%s\n",propName,props.getProperty(propName));
//		}
//		props.getProperty("another", "localhost");
//		for (Object key:props.keySet()){
//			String propName=(String) key;
//			System.out.printf("Url dla %s:%s",propName,props.getProperty(propName));
//		}
	}
}
