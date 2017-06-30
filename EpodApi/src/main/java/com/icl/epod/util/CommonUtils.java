package com.icl.epod.util;

import org.springframework.stereotype.Component;

import com.icl.epod.entity.UserEntity;
import com.icl.epod.model.UserModel;

/**
 * @author Vijendra.y
 *
 */
@Component
public class CommonUtils {
	public UserEntity userModeToEntity(UserModel model) {
		UserEntity userEntity = new UserEntity();

		if (model.getUserName() != null) {
			userEntity.setUserName(model.getUserName());
		}
		if (model.getPassword() != null) {
			userEntity.setPassword(model.getPassword());
		}
		if (model.getFaxNumber() != null) {
			userEntity.setFaxNumber(model.getFaxNumber());
		}
		if (model.getCreateDate() != null) {
			userEntity.setCreateDate(model.getCreateDate());
		}
		if (model.getFirstName() != null) {
			userEntity.setFirstName(model.getFirstName());
		}
		if (model.getLastName() != null) {
			userEntity.setLastName(model.getLastName());
		}
		if (model.getPhoneNumber() != null) {
			userEntity.setPhoneNumber(model.getPhoneNumber());
		}
		if (model.getUpdateDate() != null) {
			userEntity.setUpdateDate(model.getUpdateDate());
		}
		if (model.getCarrierId() != null) {
			userEntity.setCarrierId(model.getCarrierId());
		}
		if (model.getImageId() != null) {
			userEntity.setImageId(model.getImageId());
		}
		if (model.getUserTypeId() != null) {
			userEntity.setUserTypeId(model.getUserTypeId());
		}

		return userEntity;
	}

}
