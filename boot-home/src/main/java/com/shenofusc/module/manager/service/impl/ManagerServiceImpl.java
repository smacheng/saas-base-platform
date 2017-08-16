package com.shenofusc.module.manager.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shenofusc.core.entity.Manager;
import com.shenofusc.module.manager.dao.ManagerDao;
import com.shenofusc.module.manager.service.ManagerService;

@Service
public class ManagerServiceImpl implements ManagerService {
	@Resource
	private ManagerDao managerDao;

	public Manager findByUserName(String userName) {
		return managerDao.findByUserName(userName);
	}

}
