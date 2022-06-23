import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class File3{

	public static void main(String[] args) throws Exception {
		
		filein f = new filein();
		
	}

}
class filein{
	FileReader fr = null;
	public filein() throws IOException, Exception {
		try {
		this.fr = new FileReader("C:\\java5\\File_Stream\\src\\data.dat",Charset.forName("UTF8")); 
		this.word();
		}catch(IOException k1) {
			if(k1.getMessage() != null) {
			System.out.println(k1);
			}
		}
		catch(Exception k2) {
			if(k2.getMessage() != null) {
				System.out.println(k2);
				}
		}
	}
	public void word() throws IOException {
		try {
			int w;
			while (true) {
				w = this.fr.read();
						if(w == -1) {
							break;
						}
					 System.out.print((char)w);
			}
			this.fr.close(); // File Á¾·á
		}catch(Exception kk) {
			if(kk.getMessage() != null) {
				System.exit(0);
			}
		}
	}
}
