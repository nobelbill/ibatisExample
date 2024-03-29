package com.multicampus.biz.board.impl;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.multicampus.biz.board.BoardVO;
import com.multicampus.biz.util.SqlMapClientFactoryBean;

public class BoardDAO {
	
	private SqlMapClient ibatis;
	
	public BoardDAO() {
		ibatis =  SqlMapClientFactoryBean.getSqlMapClientInstance();
	}

	public void insertBoard(BoardVO vo) throws SQLException{		
		ibatis.insert("insertBoard",vo);
	}	
	
	public void updateBoard(BoardVO vo) throws SQLException{		
		ibatis.update("insertBoard",vo);
	}	
	
	public void deleteBoard(BoardVO vo) throws SQLException{		
		ibatis.delete("insertBoard",vo);
	}	
	
	public BoardVO getBoard(BoardVO vo) throws SQLException{
		
		return (BoardVO) ibatis.queryForObject("getBoard",vo);
	}	
	
	public List<BoardVO> getBoardList(BoardVO vo) throws SQLException{		
		return ibatis.queryForList("getBoardList",vo);
	}
}
















