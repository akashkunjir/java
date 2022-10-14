package A5;

import java.io.*;
import java.util.*;

public class CopyFileContent {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		FileInputStream name = new FileInputStream("C:\\javaprog\\akash\\file\\file1.txt");
		FileOutputStream fout = new FileOutputStream("C:\\javaprog\\akash\\file\\new.txt");
		int ch;
		while ((ch = name.read()) != -1) {
			fout.write(ch);

		}
		name.close();
		fout.close();
	}

}
