package sec02.exam01;
//문자 변환 보조스트림
import java.io.*;

public class CharacterConverStreamExample {
	
	public static void main(String[] args) throws Exception {
		write("월요일이다 얼릉 주말이 와라!.");
		String data = read();
		System.out.println(data);
	}
	
	
	public static void write(String str) throws Exception{
		FileOutputStream fos = new FileOutputStream("test1.txt");
		Writer writer = new OutputStreamWriter(fos);
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	public static String read() throws Exception{
		FileInputStream fis = new FileInputStream("test1.txt");
		Reader reader = new InputStreamReader(fis);
		
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		reader.close();
		String data = new String(buffer, 0, readCharNum);
		return data;
	}
}
		
		
