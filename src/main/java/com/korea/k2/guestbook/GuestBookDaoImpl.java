package com.korea.k2.guestbook;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GuestBookDaoImpl
                       implements  GuestBookDao {
	@Autowired
	private SqlSessionTemplate  mybatis;
	
	@Override
	public void insert(GusertBookVO vo) {
		mybatis.insert("GuestBook.INSERT", vo);		
	}

	@Override
	public List<GusertBookVO> list(GusertBookVO vo) {		
		return mybatis.selectList("GuestBook.SELECT", vo);
	}

	@Override
	public int totalCount(GusertBookVO vo) {
		// TODO Auto-generated method stub
		return mybatis.selectOne("GuestBook.COUNT", vo);
	}

}
