package com.proj.backend.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj.backend.domain.UserVO;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping(value = "/api")
public class TestController {
	
	@RequestMapping(value = "/ip")
	public ResponseEntity<String> ip (HttpServletRequest request) {
		log.info("/api/ip들어갔니");
		//요청을 보낸 클라이언트 IP 주소 반환
		return ResponseEntity.ok(request.getRemoteAddr());
	}
	
	@RequestMapping("/home")
	public String rootMethod() {
		log.info("looooog");
		
		return "home";
	}
	
	@GetMapping("/hello")
	public String hello(Model model) {
		log.info("helloooo");
		UserVO user = new UserVO();
		user.setUserID("아이디");
		user.setName("이름");
		model.addAttribute("name", user);
		
		return "hello";
	}
}
