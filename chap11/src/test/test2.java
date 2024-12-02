package test;
//"2024년 05월 08일 수요일 10시 30분";
import java.text.*;
import java.util.*;

public class test2 {

	public static void main(String[] args) {
	
		Date now = new Date();
//		String strNow1 = now.toString();    //영문으로 날짜받기
//		System.out.println(strNow1);   
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}

}
