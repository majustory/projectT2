package com.korea.k2.guestbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestBookServiceImpl
                      implements GuestBookService {

	@Autowired
	private GuestBookDao dao;
	
	@Override
	public void insert(GusertBookVO vo) {
		dao.insert(vo);
		
	}

	@Override
	public List<GusertBookVO> list(GusertBookVO vo) {		
		return dao.list(vo);
	}

	@Override
	public int totalCount(GusertBookVO vo) {

		return dao.totalCount(vo);
	}

}
