package com.jiancode.tijian.service.impl;

import com.jiancode.tijian.mapper.UsersMapper;
import com.jiancode.tijian.po.Users;
import com.jiancode.tijian.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersMapper usersMapper;
	
	
	@Override
	public Users getUsersByUserIdByPass(Users users) {
		
		return usersMapper.getUsersByUserIdByPass(users);
	}
	
	@Override
	public Users getUsersById(String userId) {
		// TODO Auto-generated method stub
		return usersMapper.getUsersById(userId);
	}

	@Override
	public int saveUsers(Users users) {
		// TODO Auto-generated method stub
		return usersMapper.saveUsers(users);
	}
	
	
}
