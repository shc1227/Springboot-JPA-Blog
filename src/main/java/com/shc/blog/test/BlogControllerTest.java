package com.shc.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//스프링이 com.shc.blog 패키지 이하를 스캔해서 모든파일을 메모리에new 한 것이 아니구요. 
//특정 어노 테이션이 붙어 있는 파일들을 new해서(IoC)스프링 컨테이너에 관리해줍니다.
@RestController 
public class BlogControllerTest {
	
	@GetMapping("/test/hello2")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
}
