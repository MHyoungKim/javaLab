package sec02.exam_interface_declaration;

public interface RemoteControl {
	
	//인터페이스 구성멤버
	// 상수
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 10;
	
	// 추상메소드(기능이 없다)
	abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 디폴트메소드(기능을 가지고 있다.)
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	// 정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}

}
