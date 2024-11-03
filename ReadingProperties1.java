package propertiesfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingProperties1 {

	public static void main(String[] args) throws IOException {
// create an object of properties file
		Properties propertiesobj = new Properties();
		
		// location of the properties file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\Configure.properties");
		
		// Loading propeties file
		propertiesobj.load(file);
		
		// reading data from properties files
		
	String url =	propertiesobj.getProperty("appurl");
	String email =	propertiesobj.getProperty("email");

	String pwd =	propertiesobj.getProperty("password");

	String orid =	propertiesobj.getProperty("Order_id");

	String cusid =	propertiesobj.getProperty("Customer");

	
//	System.out.println(url +" "+email+ " "+pwd+ " " +orid+ " "+cusid);
	
	// reading all keys from propertied file
	
//Set<String> keys =	propertiesobj.stringPropertyNames() ;   // it will return set collection
	
	//System.out.println(keys);
	
	// 2nd method
//Set<Object> keys1 =	propertiesobj.keySet();
//System.out.println(keys1);
	
	// how to capture only values from properties file
	
	Collection<Object> obj =propertiesobj.values(); // 
	
	System.out.println(obj);
	
	
	
	file.close();
	
	
	
	}

}
