package coffee;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream {

	public static void main(String[] args) throws IOException {
		int c;
		try {
			LowerCaseInputStream in = new LowerCaseInputStream(
					new BufferedInputStream(
							new FileInputStream("D:\\graduate\\headFirst\\src\\coffee\\test")) );
			while((c=in.read())>=0){
				System.out.print((char)c);
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
