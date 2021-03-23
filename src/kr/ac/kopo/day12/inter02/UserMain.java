package kr.ac.kopo.day12.inter02;

public class UserMain {

	public static void main(String[] args) {
		
		TV tv = new SamsungTV();
//		TV tv = new LGTV();			// 삼성이든 LG이든 사용가능. 다용성
		
		tv.powerOn();
		tv.channelDown();
		tv.soundUp();
		tv.channelUp();
		tv.soundDown();
		tv.mute();
		tv.mute();
		tv.mute();
		tv.soundUp();
		tv.mute();
		tv.powerOff();
		tv.copyright();
	}
	
}
