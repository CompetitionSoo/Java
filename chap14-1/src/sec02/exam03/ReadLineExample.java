package sec02.exam03;
//라인단위로 문자열 읽기
import java.io.*;

public class ReadLineExample {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("language.txt");
			
		BufferedReader br = new BufferedReader(reader);
			
		while(true) {
			String data = br.readLine();
			if(data == null) break;
			System.out.println(data);
			}
		
			br.close();
	}

}
