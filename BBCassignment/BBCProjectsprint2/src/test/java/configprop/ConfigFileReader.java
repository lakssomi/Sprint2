package configprop;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	Properties prop;

	public final String filepath = "C:\\Users\\Lakshmi Praveena\\Desktop\\BBCassignment\\BBCProjectsprint2\\src\\test\\java\\configprop\\config.properties";

	public ConfigFileReader() throws IOException {
		File f = new File(filepath);
		FileInputStream fin = new FileInputStream(f);
		prop = new Properties();
		prop.load(fin);

	}

	public String geturl() {
		return prop.getProperty("url");
	}

}
