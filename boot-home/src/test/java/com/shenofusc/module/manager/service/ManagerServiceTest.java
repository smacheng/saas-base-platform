package com.shenofusc.module.manager.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shenofusc.core.entity.Manager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:conf/applicationContext.xml")
public class ManagerServiceTest {
	@Resource
	private ManagerService managerService;
	
	/*@Resource 
	private ManagerMapper managerMapper;*/

	@Test
	public void testFindByUserName() {
		String userName = "admin";
		Manager manager = managerService.findByUserName(userName);
		// assertNotNull(manager);
	}

}
