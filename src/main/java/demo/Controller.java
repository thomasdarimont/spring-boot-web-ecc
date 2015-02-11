package demo;

import java.util.Collections;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/")
	public Object root() {
		return Collections.singletonMap("message", "Hello World! " + System.currentTimeMillis());
	}
}
