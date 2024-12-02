package test;
// 라인번호를 출력
// FileReader와 BufferReader 를 이용해서 라인번호 출력하기

import java.io.*;

public class AddLineNumberExample {

	public static void main(String[] args) throws Exception{
	String filePath = "src/test/AddLineNumberExample.java";
	
	FileReader fr = new FileReader(filePath);
	BufferedReader br = new BufferedReader(fr);  
	
	//System.out.println(br.readLine()); 한줄 읽고 다음줄로 넘어가서 읽힌다.
	
	int row = 1;
	
	while(true) {
		String str = br.readLine();
		if(str == null) {
			break;
		}
		if(str.trim().equals("")) {
			System.out.println(row + ": " + "내용없어");
		}else {
			System.out.println(row + ":" + str);
		}
		row++;
	}
	br.close();
	fr.close();
	}
}