package dataProviders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	private Properties properties;
		
	// propertyFilePath - This is just a String variable which holds the 
	//information of the config file path.
	private final String propertyFilePath = "configs//Configuration.properties";
	
	//Constructor
	public ConfigFileReader() {
		
		BufferedReader reader;
		
		try {
			// new FileReader(propertyFilePath) - Creates a new FileReader, 
			//given the name of the file to read from.
			
			//new BufferedReader(new FileReader(propertyFilePath)) - Reads text from a 
			//character-input stream, buffering characters so as to provide 
			//for the efficient reading of characters, arrays, and lines.
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			//new Properties() - The Properties class represents a persistent
			//set of properties. The Properties can be saved to a stream 
			//or loaded from a stream. Each key and its corresponding value 
			//in the property list is a string.			
			
			try {
				//properties.load(reader) - Reads a property list (key and element pairs) 
				//from the input character stream in a simple line-oriented format.
				properties.load(reader);
				reader.close();
				
			}catch (IOException e){
				
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at "
					+ propertyFilePath);
			
		}
		
		
	}
	
	//Driver
	public String getDriverPath() {
		//properties.getProperty("driverPath") - Properties object gives us
		//a .getProperty method which takes the Key of the property as a parameter
		//and return the Value of the matched key from the .properties file.		
		String driverPathEdge = properties.getProperty("driverPathEdge");
		String driverPathFirefox = properties.getProperty("driverPathFirefox");
		String driverPathChrome = properties.getProperty("driverPathChrome");
		
		//If the properties file does not have the specified key, it returns
		//the null. This is why we have put the null check and in case of null
		//we like to throw an exception to stop the test with the stack trace information		
		if(driverPathEdge != null) return driverPathEdge;
		//if(driverPathFirefox != null)return driverPathFirefox;
		//if(driverPathChrome != null) return driverPathChrome;
		
		
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
	}
	
	
	//URL
	public String getApplicationUrl() {
		
		String url = properties.getProperty("url");
		
		if(url != null) return url;
		
		else throw new RuntimeException("url not specified in the Configuration.properties file.");
		
	}
	

	//CustomerSearch
	

}
