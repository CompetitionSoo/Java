package sec02.exam02;
//파일 복사 성능 테스트

import java.io.*;

public class NonBuffervsBufferExample {

	public static void main(String[] args) throws Exception{
		String originalFilepath1 = 
				("originalFile1.jpg");
		String targetFilePath1 = "targetFile1.jpg";
		
		FileInputStream fis = new FileInputStream(originalFilepath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);   // 기존 스트림생성
		
		
		String originalFilepath2 =
				("originalFile2.jpg");
		String targetFilePath2 = "targetFile1.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilepath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);    // 버퍼 보조 스트림 연결
		
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않을 때 : \t" + nonBufferTime + "ns");
		
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼를 사용했을 때 : \t\t" + bufferTime + "ns");
		
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
		}
		static int data = -1;
		public static long copy(InputStream is, OutputStream os) throws Exception{
			long start = System.nanoTime();
			while(true) {
				data = is.read();
				if(data == -1) break;
				os.write(data);
			}
			os.flush();
			long end = System.nanoTime(); // 끝시간 저장
			return (end-start); // 복사에 걸린 시간 리턴
		}
}