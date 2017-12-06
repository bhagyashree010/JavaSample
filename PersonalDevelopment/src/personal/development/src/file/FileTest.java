package personal.development.src.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import sun.misc.IOUtils;

public class FileTest{

	public static void main(String[] args) {
		
			byte[] bytesOfFile = null;
			try {
				bytesOfFile = Files.readAllBytes(Paths.get("FrenchText.xml"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				List<String> content = Files.readAllLines(Paths.get("FrenchText.xml"));//new String(bytesOfFile, "UTF-8");
				for (String string : content) {
					System.out.println(string);
					
				}
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
