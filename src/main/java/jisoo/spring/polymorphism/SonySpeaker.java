package jisoo.spring.polymorphism;

import org.springframework.stereotype.Component;

public class SonySpeaker implements Speaker{

	public SonySpeaker() {
		System.out.println("---> SonySpeaker °´Ã¼ »ý¼º");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker ---> volumeup!");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker ---> volumeDown~");
	}
	
	
}
