package jisoo.spring.polymorphism;

public class SamsungTV implements TV{
	
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("SAMSUNG �ְ�");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("SAMSUNG - ������ ������");
		this.speaker = speaker;
	}

	public SamsungTV(Speaker speaker, int price) {
		System.out.println("SAMSUNG - ������ ������ - multi mapping");
		this.speaker = speaker;
		this.price = price;
	}

	public void start() {
		System.out.println("��ü �ʱ�ȭ �۾� ó�� : start");
	}
	public void stop() {
		System.out.println("��ü ���� ���� ó���� �۾� ó�� : stop");
	}
	public void powerOn() {
		System.out.println("SAMSUNG - power on (price : " + price + "��)");
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
