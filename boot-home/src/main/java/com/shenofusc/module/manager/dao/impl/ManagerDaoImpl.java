package com.shenofusc.module.manager.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.shenofusc.core.entity.Manager;
import com.shenofusc.module.manager.dao.ManagerDao;
import com.shenofusc.module.manager.dao.mapper.ManagerMapper;

@Repository
public class ManagerDaoImpl implements ManagerDao {
	@Resource
	private ManagerMapper managerMapper;

	public Manager findByUserName(String userName) {
		return managerMapper.findByUserName(userName);
	}

}
