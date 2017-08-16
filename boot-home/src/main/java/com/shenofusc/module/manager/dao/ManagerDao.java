package com.shenofusc.module.manager.dao;

import com.shenofusc.core.entity.Manager;

public interface ManagerDao {
	/**
	 * 根据登录名查找用户
	 * 
	 * @param userName
	 * @return
	 */
	Manager findByUserName(String userName);
}
