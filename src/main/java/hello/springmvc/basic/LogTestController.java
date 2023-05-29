package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class LogTestController {
	//private final Logger log = LoggerFactory.getLogger(getClass());
	@RequestMapping("/log-test")
	public String logTest(){
		String name = "Spring";
		//과거 방식 System.out.println("name = " + name);
		log.trace("trace log={}", name);
		log.debug(" debug log={}", name);
		log.info(" info log={}", name);
		log.warn(" warn log={}", name);
		log.error("error log={}", name);

		//log를 찍을때 현재 로그가 어떤 상태의 level이다를 찍을 수 있다.
		//debug상태에서 보는 로그야
		//error, warn등 경고는 주시해야하는 로그야

		return "ok";
		//Spring에서 RestController라고 하고 문자를 return하면
		//원래는 View이름을 반환하지만, RestAPI의 그 RestController에다가
		//String을 반환하면, 그냥 확 HTTP Body에 String을 확 넣어버린다.
		//RestAPI 만들때 굉장히 핵심적인 Controller다
	}
}
