package A4;

import java.io.*;

public class FileWriteDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			String c, data;
			
			//========Accept Path & Name==============
			System.out.println("Enter Your File Name with Path: ");
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			c = buffer.readLine();
			File f1 = new File(c);
			FileWriter fw2=null;

			//=========Check if file exists=========
			if (f1.exists()) {
				
				System.out.println("File is available");
				// write to file if file is available
				fw2 = new FileWriter(f1, true);
				BufferedWriter bw2 = new BufferedWriter(fw2);
				System.out.println("Enter Data to Save to File, enter 'quit' to quit");
				do {
					data = buffer.readLine();
					bw2.write(data);
				} while ((!data.equals("quit")));
				bw2.close();

			} else {
				//create new file
				
				System.out.println("New File Created: " + f1.getName());
				
				//write to file
				fw2 = new FileWriter(f1, true);
				BufferedWriter bw2 = new BufferedWriter(fw2);
				System.out.println("Enter Data to Save to File, enter 'quit' to quit");
				do {
					data = buffer.readLine();
					bw2.write(data);
				} while ((!data.equals("quit")));
				bw2.close();
			}
			//========Read the file====================
			FileReader fr2 = new FileReader(c);
			BufferedReader br2 = new BufferedReader(fr2);
			int content;
			while ((content = br2.read()) != -1) {
				System.out.print((char) content);
			}
			
			buffer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
