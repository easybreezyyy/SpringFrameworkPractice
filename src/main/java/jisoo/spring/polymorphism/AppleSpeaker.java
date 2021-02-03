package jisoo.spring.polymorphism;

import org.springframework.stereotype.Component;

public class AppleSpeaker implements Speaker{

	public AppleSpeaker() {
		System.out.println("---> AppleSpeaker °´Ã¼ »ý¼º");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker ---> volumeup!");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker ---> volumeDown~");
	}
	
	
}
