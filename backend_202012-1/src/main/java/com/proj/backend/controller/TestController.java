package com.proj.backend.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj.backend.domain.UserVO;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping("/api")
public class TestController {
	
	@PostMapping("/ip")
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
	
	@GetMapping("/json")
	public Map<String, Object> hellow() {
		log.info("helloooowwwww");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ID", "아이디");
		map.put("name", "이름");
		
		return map;
	}
	
	@PostMapping("/bye")
	public String bye(){
		log.info("현재 서버시간 확인");
	return "현재 서버시간 : " + new Date() + "입니다. \n";
	}
}
