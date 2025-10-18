package com.web.as.persistence;

import java.util.Date;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.web.as.domain.Outing;


@Mapper
public interface OutingMapper {
	List<Outing> selectOne(Date outingDate); // 특정 게시글 조회
}
