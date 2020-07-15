package com.example.demo.room.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.room.bean.RoomBean;
import com.example.demo.room.entity.RoomEntity;
import com.example.demo.room.repo.RoomRepository;
import com.example.demo.room.reqresptransformer.RoomRequestTransformer;
import com.example.demo.room.reqresptransformer.RoomResponseTransformer;
import com.example.demo.room.service.RoomService;
@Service
public class RoomServiceImpl implements RoomService {
	
	private static final Logger log = LoggerFactory.getLogger(RoomServiceImpl.class);
	
	@Autowired
	private RoomRepository roomRepository;

	@Override
	public RoomBean addRoom(RoomBean bean,HttpSession session) {
		// TODO Auto-generated method stub
	
		RoomEntity entity = RoomRequestTransformer.getRoomEntity(bean,session);
		roomRepository.save(entity);
		RoomBean roomBean = RoomResponseTransformer.getRoomBean(entity);
		
		return roomBean;
	}

	@Override
	public List<RoomBean> getAllRooms() {
		// TODO Auto-generated method stub
		
		log.info("Inside Getting all Rooms...");
		log.debug("Inside getting all Rooms...");
		List<RoomEntity> entities = roomRepository.findAll();
		List<RoomBean> beans = RoomRequestTransformer.getRoomBeamList(entities);
		log.info("Returning all Rooms to controller...");
		log.debug("Returning all Rooms to controller...");
		return beans;
	}

}
