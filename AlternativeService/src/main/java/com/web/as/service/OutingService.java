package com.web.as.service;

import java.util.Date;


import java.util.List;

import com.web.as.domain.OutingVO;

public interface OutingService {
	List<OutingVO> getOutings(String outingDate); // 전체 게시글 조회
	List<OutingVO> selectByDateRange(String startDate, String endDate); // 전체 게시글 조회
}
