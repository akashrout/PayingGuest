package com.example.demo.room.rest;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Status;
import com.example.demo.room.bean.RoomBean;
import com.example.demo.room.service.RoomService;

@RestController
@RequestMapping("/room")
public class RoomRestController {
	@Autowired
	private RoomService roomService;

	@GetMapping("/getall")
	public ResponseEntity<List<RoomBean>> getAllRoom() {
		List<RoomBean> roomBeans = roomService.getAllRooms();
		return new ResponseEntity<List<RoomBean>>(roomBeans, HttpStatus.OK);
	}


	@PostMapping("/create")
	public ResponseEntity<RoomBean> addRoom(@RequestBody RoomBean roomBean, HttpSession session) {

		if (session.getAttribute("username") == null) {
			return new ResponseEntity(new Status("Session expired, Please login again "), HttpStatus.CONFLICT);
		} else {

		}
		return null;

	}

}
