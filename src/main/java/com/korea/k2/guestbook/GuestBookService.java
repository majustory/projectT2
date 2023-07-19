package com.korea.k2.guestbook;

import java.util.List;

public interface GuestBookService {
	 void  insert(GusertBookVO vo);
	 List<GusertBookVO>	list(GusertBookVO vo);
	 int  totalCount(GusertBookVO vo);
}
