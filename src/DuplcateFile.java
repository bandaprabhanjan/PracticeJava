import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class DuplcateFile {
	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("output.txt");
		BufferedReader br=new BufferedReader(new FileReader("input.txt"));

		String line = br.readLine();
		while(line!=null)
		{
			boolean available=false;
			BufferedReader br1 = new BufferedReader(new FileReader("output.txt"));
			String target = br1.readLine();
			if(line.equals(target))
			{
				available = true;
				break;
			}
			target=br1.readLine();	
			if (available == false)
			{
				pw.println(target);
				pw.flush();
			}
	
		}
		
		line=br.readLine();
	}

}
