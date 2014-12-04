package c.n.z.k.invoicing.app;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginApp {

	Logger logger = LoggerFactory.getLogger(LoginApp.class);

	@RequestMapping("/login")
	String index(HttpSession session) {
		logger.info("index / will return to the main jsp file");
		return "/logins.html";
	}

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "to index page !";
	}
}