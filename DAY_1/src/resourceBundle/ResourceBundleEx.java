package resourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleEx {
	public static void main(String[] args) {
		Locale locale=new Locale("ru"); 
		ResourceBundle message=ResourceBundle.getBundle("i18n.message",locale);
		System.out.println(message.getString("wiadomosc"));
	}
}
