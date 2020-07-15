package com.example.demo.room.reqresptransformer;

import com.example.demo.room.bean.RoomBean;
import com.example.demo.room.entity.RoomEntity;

public class RoomResponseTransformer {

	public static RoomBean getRoomBean(RoomEntity entity) {
		// TODO Auto-generated method stub

		RoomBean bean = new RoomBean(entity.getId(), entity.getUsername(), entity.getAddress(), entity.getCity(),
				entity.getLocality(), entity.getMaxpeople(), entity.getGender(), entity.getRooms(), entity.getAc(),
				entity.getWifi(), entity.getFood(), entity.getCost(), entity.getStatus());
		return bean;
	}

}
