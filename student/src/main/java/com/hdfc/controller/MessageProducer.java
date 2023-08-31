package com.hdfc.controller;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class MessageProducer {
	
	
	@Inject
	@Channel("data-output")
	Emitter<String> emitter;
	
	public void produceMessage(String msg) {
		System.out.println(msg + " --> message produced");
		emitter.send(msg);
	}

}
