package com.icl.epod.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icl.epod.dao.IclEpodDao;
import com.icl.epod.model.UserModel;
import com.icl.epod.service.IclEpodService;
import com.icl.epod.util.CommonUtils;

/**
 * @author Vijendra.y
 *
 */
@Service
public class IclEpodServiceImpl implements IclEpodService{
	@Autowired
	private IclEpodDao epodDao;
	@Autowired
	private CommonUtils commonUtils;
	final static Logger logger = Logger.getLogger(IclEpodServiceImpl.class);
	
	@Override
	public Integer saveIclUser(UserModel model) {
		logger.debug("EpodAPI IclEpodServiceImpl saveIclUser  Enter");			
		return epodDao.saveIclUser(commonUtils.userModeToEntity(model));
	}
}
