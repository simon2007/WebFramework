package org.blue.webframework.web.sys.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sys/logistical/")
public class LogisticalController {


	@RequestMapping("/pollback")
	public void pollBack(@RequestParam("param") String param, HttpServletResponse response) throws IOException {
	

	}
}
