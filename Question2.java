import java.io.*;
public class Question2{
	public static void main(String[] args){
		txtCopy("Source.txt", "Dest.txt");
		editFile("Dest.txt");
		imgCopy("Source.jpg", "Dest.jpg");
	}
	public static void txtCopy(String Source, String Dest){
		try{
			FileReader fr = new FileReader(Source);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(Dest);
			BufferedWriter bw = new BufferedWriter(fw);
			String line;
			while((line = br.readLine()) != null){
				bw.write(line);
				bw.newLine();
			}
			br.close();
			bw.close();
		} catch(FileNotFoundException e){
			System.out.println(e);
		} catch(IOException e){
			System.out.println(e);
		}
	}
}