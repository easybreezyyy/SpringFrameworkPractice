package jisoo.spring.polymorphism;

public class SamsungTV implements TV{
	
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("SAMSUNG 최고");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("SAMSUNG - 생성자 인젝션");
		this.speaker = speaker;
	}

	public SamsungTV(Speaker speaker, int price) {
		System.out.println("SAMSUNG - 생성자 인젝션 - multi mapping");
		this.speaker = speaker;
		this.price = price;
	}

	public void start() {
		System.out.println("객체 초기화 작업 처리 : start");
	}
	public void stop() {
		System.out.println("객체 삭제 전에 처리할 작업 처리 : stop");
	}
	public void powerOn() {
		System.out.println("SAMSUNG - power on (price : " + price + "원)");
	}
	public void powerOff() {
		System.out.println("SAMSUNG - power off");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {			
		speaker.volumeDown();
	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker()");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("setPrice()");
		this.price = price;
	}
	
}
