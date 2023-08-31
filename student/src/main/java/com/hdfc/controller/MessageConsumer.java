package com.hdfc.controller;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@ApplicationScoped
public class MessageConsumer {
	
	@Incoming("data-input")
	public void processMessages(String msg) {
		System.out.println("Message --> " + msg);
		log.info(msg);
	}

}
