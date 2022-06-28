package LearnJava;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.Reader;
import java.util.Properties;


import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.file.FileReader;


public class PropertyFile {
	
Properties property= new Properties();
FileInputStream f;

	@Test
	public void testProperty() throws IOException {

f=new FileInputStream(System.getProperty("user.dir"+"\\config.properties"));
property=new Properties();
property.load(f);
		property.getProperty("name");	
		
		System.out.println(property.getProperty("name"));
		
	}
	
}
