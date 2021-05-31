package A_interview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class datadriven {

	public static void main(String[] args) throws Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\kavit\\OneDrive\\Desktop\\data.properties");
		Properties pob=new Properties();
		pob.load(file);
		String url = pob.getProperty("url");
		System.out.println(url);
		

	}

}
