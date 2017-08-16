package com.shenofusc.module.manager.service;

import com.shenofusc.core.entity.Manager;

public interface ManagerService {
	/**
	 * 根据登录名查找用户
	 * 
	 * @param userName
	 * @return
	 */
	Manager findByUserName(String userName);
}
