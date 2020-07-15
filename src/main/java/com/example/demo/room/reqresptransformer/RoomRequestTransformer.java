package com.example.demo.room.reqresptransformer;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.demo.room.bean.RoomBean;
import com.example.demo.room.entity.RoomEntity;

public class RoomRequestTransformer {
//	 static HttpSession session;
//	 static String username = session.getAttribute("username").toString();
	private static final Logger log = LoggerFactory.getLogger(RoomRequestTransformer.class);
	public static RoomEntity getRoomEntity(RoomBean bean, HttpSession session) {
		// TODO Auto-generated method stub
		String username = session.getAttribute("username").toString();
		String status = "yes";
		if (bean.getWifi() == null) {
			bean.setWifi("n/a");
		}
		if (bean.getAc() == null) {
			bean.setAc("n/a");
		}
		if (bean.getFood() == null) {
			bean.setFood("n/a");
		}
		System.out.println("User...:" + username);
		RoomEntity entity = new RoomEntity(username, bean.getAddress(), bean.getCity(), bean.getLocality(),
				bean.getMaxpeople(), bean.getGender(), bean.getRooms(), bean.getAc(), bean.getWifi(), bean.getFood(),
				bean.getCost(), status);
		return entity;
	}

	public static List<RoomBean> getRoomBeamList(List<RoomEntity> entities) {
		// TODO Auto-generated method stub
		log.info("Getting all the room lists...");
		log.debug("Getting all the room lists...");
		List<RoomBean> beans = new ArrayList<RoomBean>();
		log.info("Adding all room lists to bean...");
		log.debug("Adding all room lists to bean...");
		for (RoomEntity entity : entities) {
			beans.add(new RoomBean(entity.getId(), entity.getUsername(), entity.getAddress(), entity.getCity(),
					entity.getLocality(), entity.getMaxpeople(), entity.getGender(), entity.getRooms(), entity.getAc(),
					entity.getWifi(), entity.getFood(), entity.getCost(), entity.getStatus()));

		}
		log.info("Returning all room lists as a bean...");
		log.debug("Returning all room lists as a bean...");
		return beans;
	}

}
