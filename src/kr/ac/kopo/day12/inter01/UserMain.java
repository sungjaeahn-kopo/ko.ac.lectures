package kr.ac.kopo.day12.inter01;

public class UserMain {

	public static void main(String[] args) {
		
		SamsungTV sam = new SamsungTV();
		sam.powerOn();
		sam.volumeDown();
		sam.volumeUp();
		sam.channelUp();
		sam.channelDown();
		sam.powerOff();

		LGTV lg = new LGTV();
		lg.turnOn();
		lg.soundDown();
		lg.soundUp();
		lg.channelUp();
		lg.channelDown();
		lg.turnOff();
		
		
	
	}
	
}
