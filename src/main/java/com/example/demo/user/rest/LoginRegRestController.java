package com.example.demo.user.rest;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Status;
import com.example.demo.room.bean.RoomBean;
import com.example.demo.user.bean.RegistrationBean;
import com.example.demo.user.entity.RegistrationEntity;
import com.example.demo.user.service.LoginRegService;

@RestController
@RequestMapping("/user")
public class LoginRegRestController {
	@Autowired
	private LoginRegService loginRegService;
	
	
	
	@PostMapping("/registration")
	public ResponseEntity<RegistrationEntity> ctrateuser(@RequestParam RegistrationBean beannn){
		
		System.out.println("Values are: "+beannn);
		//return new ResponseEntity(new Status("Unable to create. Some fields are missing "), HttpStatus.CONFLICT);
		return null;
	}
	
	@PostMapping("/loginl")
	public ResponseEntity<RoomBean> loginCheck(@RequestBody RegistrationBean bean, HttpSession session) {
		System.out.println("Session is: "+session.getId());
		if (loginRegService.isUserNamePresent(bean.getUsername())) {
			if (loginRegService.isValidLoginDetails(bean.getUsername(), bean.getPassword())) {
				return new ResponseEntity(new Status("Success...Session iD:" +session.getId()), HttpStatus.ACCEPTED);
			} else {
				return new ResponseEntity(new Status("Invalid Credential... "), HttpStatus.UNAUTHORIZED);
			}
			
		} else {
			return new ResponseEntity(new Status("Invalid User... "), HttpStatus.CONFLICT);
		} 

	}


}
