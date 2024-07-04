package com.jiancode.tijian.controller;

import com.jiancode.tijian.po.Users;
import com.jiancode.tijian.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private UsersService usersService;
	
	@RequestMapping("/getUsersByUserIdByPass")
	public Users getUsersByUserIdBypass(@RequestBody Users users) {
		 return usersService.getUsersByUserIdByPass(users);
	}
	
	@RequestMapping("/getUsersById")
	public Users getUsersById(@RequestBody Users users) {
		 return usersService.getUsersById(users.getUserId());
	}
	
	@RequestMapping("/saveUsers")
	public int saveUsers(@RequestBody Users users) {
		 return usersService.saveUsers(users);
	}
	
}
