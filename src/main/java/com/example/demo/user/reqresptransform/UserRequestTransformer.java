package com.example.demo.user.reqresptransform;

import com.example.demo.user.bean.RegistrationBean;
import com.example.demo.user.entity.RegistrationEntity;

public class UserRequestTransformer {

	public static RegistrationEntity getUserEntity(RegistrationBean bean) {
		// TODO Auto-generated method stub
		RegistrationEntity entity = new RegistrationEntity(bean.getUsername(), bean.getPassword(), bean.getReg_name(),
				bean.getReg_email(), bean.getReg_gender(), bean.getReg_contact(), bean.getRole(),
				bean.getProfile_pic());
		return entity;
	}

}
