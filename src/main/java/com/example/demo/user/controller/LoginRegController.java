package com.example.demo.user.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.user.bean.RegistrationBean;
import com.example.demo.user.entity.RegistrationEntity;
import com.example.demo.user.repo.UserRepository;
import com.example.demo.user.service.LoginRegService;
import com.example.demo.user.validations.UserValidator;

@Controller
public class LoginRegController {

	@Autowired
	private UserRepository UserRepository;

	@Autowired
	private LoginRegService loginRegService;

	@Autowired
	private UserValidator userValidator;

	@PostMapping("/registration")
	public String registration(RegistrationBean registrationBean, Model model) {
		System.out.println(registrationBean);

		if (userValidator.isUserNamePresent(registrationBean.getUsername())) {
			System.out.println("Username Already Present, Try another one...");
			model.addAttribute("exist", true);
			return "public/registration";

		} else {
			loginRegService.createUser(registrationBean);
			model.addAttribute("exists", true);
			return "public/login";

		}

	}

	@PostMapping("/login")
	public String loginCheck(RegistrationBean bean, Model model, HttpSession session) {
		System.out.println("For Login Check page");
		//System.out.println(entity);
		if (loginRegService.isUserNamePresent(bean.getUsername())) {
			if (loginRegService.isValidLoginDetails(bean.getUsername(), bean.getPassword())) {
				session.setAttribute("username", bean.getUsername());
				session.setMaxInactiveInterval(100);
				return "redirect:home";
			} else {
				System.out.println("Invalid password");
				model.addAttribute("invalidcredential", true);
				return "public/login";
			}
		} else {
			System.out.println("Invalid User");
			model.addAttribute("invalid", true);
			return "public/login";
		}

	}

	@GetMapping("/logout")
	public String logout(RegistrationEntity registrationEntity, Model model, HttpSession session) {
		System.out.println(session.getAttribute("username") + " Logged out");

		session.invalidate();
		model.addAttribute("logout", true);
		return "public/login";

	}

}
