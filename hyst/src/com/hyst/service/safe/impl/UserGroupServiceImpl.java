package com.hyst.service.safe.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.hyst.dao.safe.UserGroupDao;
import com.hyst.service.safe.SafeService;
import com.hyst.vo.UserGroup;

/**
 * @author DongYi
 * @version 创建时间：2016年4月22日 上午10:35:49
 * 类说明
 */
public class UserGroupServiceImpl implements SafeService{
	@Autowired
	private UserGroupDao userGroupDao;
	
	
	public void setUserGroupDao(UserGroupDao userGroupDao) {
		this.userGroupDao = userGroupDao;
	}
	
	/*************************以下为业务方法***********************************/
	public List<UserGroup> getUserGroups(int pageNo, int pageSize) {
		Map<String, Object>map=new HashMap<String, Object>();
		map.put("pageNo", 0);
		map.put("pageSize", pageSize);
		return userGroupDao.list(map);
	}

}
