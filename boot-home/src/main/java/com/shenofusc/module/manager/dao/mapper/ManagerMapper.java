package com.shenofusc.module.manager.dao.mapper;

import com.shenofusc.core.entity.Manager;
import com.shenofusc.core.orm.mybatis.SQLMapper;

@SQLMapper
public interface ManagerMapper {
	/**
	 * 根据登录名查找用户
	 * 
	 * @param userName
	 * @return
	 */
	Manager findByUserName(String userName);
	
    int deleteByPrimaryKey(Integer id);

    int insert(Manager record);

    int insertSelective(Manager record);

    Manager selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
}