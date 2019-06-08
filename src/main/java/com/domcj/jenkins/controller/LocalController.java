package com.domcj.jenkins.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: This is a class!
 * @author: chenjian
 * @date: 2019/06/09 00:07
 */
@RestController
public class LocalController {

	@Value("${domcj.profile:dev}")
	private String profile;

	@GetMapping("/local")
	public String local() {
		return profile;
	}

}
