package com.example.demo.room.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.example.demo.room.bean.RoomBean;

public interface RoomService {
	
	public RoomBean addRoom(RoomBean bean,HttpSession session);

	public List<RoomBean> getAllRooms();

}
