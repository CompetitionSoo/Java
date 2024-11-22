package sec03.exam03;

public class Car { //생성자 오버로딩
	//필드
	String company= "현대자동차";    // 생성자 초기값을 넣어놨음
	String model;
	String color;
	int maxSpeed;
	
	
	//생성자
	Car(){						     // 생성자
	}                   
	
	Car(String model){				 // 생성자
		this.model = model;
	}                   
	
	Car(String model, String color){ // 생성자  
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed){    // 생성자
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		}
	}
