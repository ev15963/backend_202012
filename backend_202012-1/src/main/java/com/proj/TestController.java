package com.proj;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class TestController {
	
	@PostMapping(value = "/ip")
	public ResponseEntity<String> ip (HttpServletRequest request) {
		//요청을 보낸 클라이언트 IP 주소 반환
		return ResponseEntity.ok(request.getRemoteAddr());
	}
	
	@GetMapping("/api/hello")
	public String hello() {
		return "안녕하세요. 현재 서버시간은 "+new Date() +"입니다. \n";
	}
}
