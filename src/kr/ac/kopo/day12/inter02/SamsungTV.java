package kr.ac.kopo.day12.inter02;

public class SamsungTV implements TV{

	private String modelName;
	private boolean power;
	private int volumeSize;
	private int channelNo;
	private boolean muteToggle;
	private int currentVolumeSize;
	
	public SamsungTV() {
		System.out.println("삼성TV 구매완료");
		modelName = "삼성TV";
		power = false;
		volumeSize = 10;
		channelNo = 3;
		muteToggle = false;
	}
	
	@Override
	public void powerOn() {
		power = true;
		System.out.println("Power On...");
		info();
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("Power Off...");		
	}

	@Override
	public void channelUp() {
		System.out.println("Channel Up...");		
		channelNo = ++channelNo % 101;
		info();		
	}

	@Override
	public void channelDown() {
		System.out.println("Channel Down...");
		channelNo--;
		if(channelNo == 0)
			channelNo = 100;
		info();
	}

	@Override
	public void soundUp() {
		System.out.println("Sound Up...");
		if(muteToggle) {	//음소거중이면
			volumeSize = currentVolumeSize;
			muteToggle = false;
		}
		if(volumeSize < TV.MAX_VOLUME_SIZE)
			volumeSize++;
		info();
	}

	@Override
	public void soundDown() {
		System.out.println("Sound Down...");		
		if(volumeSize > TV.MIN_VOLUME_SIZE)
			volumeSize--;
		info();
	}

	@Override
	public void mute() {
		
		if(muteToggle) {
			System.out.println("음소거 해제");
			volumeSize = currentVolumeSize;
			//muteToggle = false;
		}else {
			System.out.println("음소거 중...");
			currentVolumeSize = volumeSize;
			volumeSize = TV.MIN_VOLUME_SIZE;
			//muteToggle = true;
		}
		muteToggle = !muteToggle;
		
//		System.out.println("Mute...");		
		//		volumeSize = TV.MIN_VOLUME_SIZE;
		
		info();
	}
	
	private void info() {	// 삼성 TV 내부에서만 보이게 할 경우 private
		System.out.println("채널번호 : " + channelNo + ", 음량크기 : " + volumeSize);
	}
}
