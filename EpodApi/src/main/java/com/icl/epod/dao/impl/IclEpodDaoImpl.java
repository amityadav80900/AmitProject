package com.icl.epod.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.apache.log4j.Logger;
import com.icl.epod.dao.IclEpodDao;
import com.icl.epod.entity.UserEntity;
import com.icl.epod.util.HibernateUtil;

/**
 * @author Vijendra.y
 *
 */
@Repository
public class IclEpodDaoImpl implements IclEpodDao{
	
	@Autowired
    private HibernateUtil hibernateUtil;
	final static Logger logger = Logger.getLogger(IclEpodDaoImpl.class);
	
	@Override
	public Integer saveIclUser(UserEntity userEntity) {
		logger.debug("EpodAPI IclEpodDaoImpl saveIclUser  Enter");				
		return (Integer) hibernateUtil.create(userEntity);
	}
}
