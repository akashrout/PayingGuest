package com.example.demo.room.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.room.bean.RoomBean;
import com.example.demo.room.service.RoomService;
import com.example.demo.room.validations.RoomValidator;

@Controller
public class RoomController {
	@Autowired
	private RoomValidator roomValidator;
	@Autowired
	private RoomService roomService;

	@PostMapping("/addroom")
	public String addRoom(RoomBean bean,HttpSession session, Model model) {
		String username = session.getAttribute("username").toString();
		bean.setUsername(username);
		System.out.println("Room bean Details: " + bean);

		if (roomValidator.validateUserForEmptyData(bean)) {
			roomService.addRoom(bean,session);

		} else {

		}
		return "public/home";

	}
	
	
	 @GetMapping("/upload")
	    public String index() {
	        return "upload";
	    }

	    @PostMapping("/upload") // //new annotation since 4.3
	    public String singleFileUpload(@RequestParam("file") MultipartFile file,
	                                   RedirectAttributes redirectAttributes) {

	        if (file.isEmpty()) {
	            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
	            return "redirect:uploadStatus";
	        }

	        try {

	            // Get the file and save it somewhere
	            byte[] bytes = file.getBytes();
	           
	            redirectAttributes.addAttribute("testimg", bytes);
	            redirectAttributes.addFlashAttribute("message",
	                    "You successfully uploaded '" + file.getOriginalFilename() + "'");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return "redirect:/getuploadimg";
	    }
	    
	    
	    @GetMapping(value="/getuploadimg",produces = MediaType.IMAGE_PNG_VALUE ) // //new annotation since 4.3
	      public String getuploadimg(Model model) {
	    	//byte[] bytes =(byte[])session.getAttribute("testimg");
	    	Path path = Paths.get("C:\\Users\\Akash\\OneDrive\\Pictures\\Screenshots\\Screenshotn.png");
	    	byte[] bytes2 =path.toUri().getPath().getBytes();
	    	model.addAttribute("testimg", bytes2);	 
	    	return  "public/testup";
	    	//return ResponseEntity.ok().contentType(MediaType.IMAGE_PNG).body(bytes2);	 
	        
	    }

}
