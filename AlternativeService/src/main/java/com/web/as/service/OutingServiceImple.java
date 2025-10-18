package com.web.as.service;

import java.util.Date;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.as.domain.Outing;
import com.web.as.persistence.OutingMapper;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class OutingServiceImple implements OutingService {
	
	@Autowired
	private OutingMapper outingMapper;
	
	@Override
	public List<Outing> getOutings(Date outingDate) {
		log.info("getAllBoards()");
		List<Outing> OutingList = outingMapper.selectOne(outingDate);
		log.info("목록 : " + OutingList);
		return OutingList;
	} // end getAllBoards()
	
}
