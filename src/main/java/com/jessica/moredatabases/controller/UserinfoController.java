package com.jessica.moredatabases.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jessica.moredatabases.mapper.db1dao.UserInfoDao;
import com.jessica.moredatabases.mapper.db2dao.UserInfoDao2;

@RestController
public class UserinfoController {
	@Autowired
	UserInfoDao userinfodao;
	@Autowired
	UserInfoDao2 userinfodao2;
	
	@RequestMapping("/getUserinfoByid")
	public String getUserinfoByid(@RequestParam("id") long id) {
		System.out.println("id:"+id);
		HashMap<String,Object> userinfoByID = userinfodao.getUserinfoByID(id);
		String username = (String) userinfoByID.get("username");
		System.out.println();
		userinfoByID = userinfodao2.getUserinfoByID(id);
		String username1 = (String) userinfoByID.get("username");
		return "收到："+username +" "+username1;
	}
}
