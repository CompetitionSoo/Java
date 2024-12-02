package sec02.exam04;
//기본타입 입출력
import java.io.*;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception{
		//아웃스트림은 존재하지 않은 파일명을 쓰면 생성해버림
				FileOutputStream fos = new FileOutputStream("primitive.db");
				DataOutputStream dos = new DataOutputStream(fos);
				
				dos.writeUTF("홍길동");
				dos.writeDouble(95.5);
				dos.writeInt(1);
				
				dos.writeUTF("감자바");
				dos.writeDouble(90.3);
				dos.writeInt(2);
				
				dos.flush(); dos.close(); fos.close();
				
				FileInputStream fis = new FileInputStream("primitive.db");
				DataInputStream dis = new DataInputStream(fis);
				
				for(int i=0; i<2; i++) {
					String name = dis.readUTF();
					double score = dis.readDouble();
					int order = dis.readInt();
					System.out.println(name + " : " + score + " : " + order);
				}
				
				dis.close(); fis.close();
			}
		}
