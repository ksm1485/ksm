package sec01.exam01;

public class Tv implements RemoteControl{
	
	int vol;

	@Override
	public void turnOn() {
		System.out.println("tv를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("tv를 끕니다");
		
	}

	@Override
	public void setVolme(int vol) {
		this.vol = vol;
		
	}

}
