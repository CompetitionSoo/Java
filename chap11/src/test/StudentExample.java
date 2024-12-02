package test;

import java.util.HashMap;

//P.531 3번문제

class Student{
	
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;     
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	//
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(studentNum.equals(student.getStudentNum())) {
			return true;
			}
		}
		
		return false; // Student 객체가 아닌 경우 false 로 반환
	}

	@Override
	public int hashCode() {

		return studentNum.hashCode();
	}
	
	
}
	

public class StudentExample {

	public static void main(String[] args) {
		//Student 키로 총점을 저장하는 HashMap 객체 생성
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		
		//new Student("1")의 점수 95 를 저장
		hashMap.put(new Student("1"),"95");
		
		//new Student("1")로 점수를 읽어옴
		String score = hashMap.get(new Student("1"));
		System.out.println("1번 학생의 총점 " + score);
				
		

	}

}
