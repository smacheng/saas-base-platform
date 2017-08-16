package com.shenofusc.core.entity.base;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BaseEntity {
	/**
	 * 创建时间
	 */
	protected Long createTime;
	/**
	 * 修改时间
	 */
	protected Long updateTime;

	/**
	 * 删除状态
	 */
	protected Integer isDel;

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getIsDel() {
		return isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
