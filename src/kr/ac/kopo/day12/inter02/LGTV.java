package kr.ac.kopo.day12.inter02;

public class LGTV implements TV {

	public LGTV() {
		System.out.println("LGTV를 구매하였습니다");
	}
	
	@Override
	public void powerOn() {
		System.out.println("Power On...");
	}

	@Override
	public void powerOff() {
		System.out.println("Power Off...");
	}

	@Override
	public void channelUp() {
		System.out.println("Channel Up...");
	}

	@Override
	public void channelDown() {
		System.out.println("Channel Down...");
	}

	@Override
	public void soundUp() {
		System.out.println("Sound Up...");
	}

	@Override
	public void soundDown() {
		System.out.println("Sound Down...");
	}

	@Override
	public void mute() {
		System.out.println("Mute...");
	}

}
