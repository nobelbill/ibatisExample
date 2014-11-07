package com.multicampus.biz.user.impl;

import java.sql.SQLException;

import com.multicampus.biz.user.UserVO;

public class UserDAOClient {
	
	public static void main(String[] args) throws SQLException {
		UserDAO userDAO = new UserDAO();
		
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test");
		
		UserVO user = userDAO.getUser(vo);
		System.out.println(user.getName() + "님 로그인 환영합니다.");
		
	}
}
