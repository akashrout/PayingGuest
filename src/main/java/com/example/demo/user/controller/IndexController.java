package com.example.demo.user.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.user.entity.RegistrationEntity;
import com.example.demo.user.service.LoginRegService;

// TODO: Auto-generated Javadoc
/**
 * The Class IndexController.
 */
@Controller
public class IndexController {

	@Autowired
	private LoginRegService loginRegService;

	/**
	 * Index page.
	 *
	 * @return the string
	 */
	@GetMapping("/")
	public String indexPage() {
		System.out.println("For home page");
		return "public/index";
	}

	/**
	 * Login page.
	 *
	 * @return the string
	 */
	@GetMapping("/login")
	public String loginPage() {
		System.out.println("For Login page");
		return "public/login";
	}

	/**
	 * Registration page.
	 *
	 * @return the string
	 */
	@GetMapping("/registration")
	public String registrationPage() {
		System.out.println("For registration page");
		return "public/registration";
	}

	/**
	 * Home page.
	 *
	 * @return the string
	 */
	@GetMapping("/home")
	public String homePage(HttpSession session, Model model) {
		System.out.println("For home page");

		// String username=session.getAttribute("username").toString();

		if (session.getAttribute("username") == null) {
			model.addAttribute("session_expired", true);
			return "public/login";
		} else {
			RegistrationEntity registrationEntity = loginRegService
					.getUserByName(session.getAttribute("username").toString());

			model.addAttribute("user", registrationEntity.getReg_email());
			model.addAttribute("userimage", registrationEntity.getProfile_pic());
			System.out.println("new..... " + registrationEntity);
			return "public/home";
		}

	}

	/**
	 * Adds the room.
	 *
	 * @return the string
	 */
	@GetMapping("/addroom")
	public String addRoom(HttpSession session, Model model) {
		System.out.println("session is: " + session.getAttribute("username"));
		if (session.getAttribute("username") == null) {
			model.addAttribute("session_expired", true);
			return "public/login";
		} else {
			return "public/provide";
		}

	}

	@GetMapping("/image")
	public void showProductImage(HttpSession session,  HttpServletResponse response) throws IOException {
		response.setContentType("image/jpeg"); // Or whatever format you wanna use
		RegistrationEntity registrationEntity = loginRegService
				.getUserByName(session.getAttribute("username").toString());

	 
		InputStream is = new ByteArrayInputStream( registrationEntity.getProfile_pic());
		IOUtils.copy(is, response.getOutputStream());		 
	}

}
