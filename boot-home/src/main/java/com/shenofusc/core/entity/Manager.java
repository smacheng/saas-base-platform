package com.shenofusc.core.entity;

import com.shenofusc.core.entity.base.BaseEntity;

/**
 * 管理员
 * 
 * @author shenofusc
 *
 */
public class Manager extends BaseEntity {
	/**
	 * 管理员ID
	 */
    private Integer id;

    /**
     * 登录名
     */
    private String userName;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 登录时间
     */
    private Long loginTime;

    /**
     * 登录次数
     */
    private Integer loginNum;

    /**
     * 是否超级管理员
     */
    private Integer isSuper;

    /**
     * 权限组ID
     */
    private Integer groupId;

    /**
     * 角色ID
     */
    private Integer roleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Long getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Long loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getLoginNum() {
        return loginNum;
    }

    public void setLoginNum(Integer loginNum) {
        this.loginNum = loginNum;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

	public Integer getIsSuper() {
		return isSuper;
	}

	public void setIsSuper(Integer isSuper) {
		this.isSuper = isSuper;
	}

}