package kr.ac.kopo.day12.inter02;

public interface TV {

	/*public static final*/int MAX_VOLUME_SIZE = 50;	
		// 인터페이스는 공간을 만들 수 없기 때문에 상수변수로 인식해야함
	int MIN_VOLUME_SIZE = 0;
	
	/* public abstract */ void powerOn();
	void powerOff();
	void channelUp();
	void channelDown();
	void soundUp();
	void soundDown();
	void mute();
	
	default void copyright() {
		System.out.println("모든 기술은 TV 협회에 귀속됩니다");
	}
	
}
