package sec01.exam02;

public interface RemoteControl {//인터페이스 상수, 추상메소드 선언

	//상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
//RemoteControl 이라는 인터페이스에 이어받아서 구현한 Television 클래스
