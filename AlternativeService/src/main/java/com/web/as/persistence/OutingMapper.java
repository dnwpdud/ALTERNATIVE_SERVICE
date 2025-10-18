package com.web.as.persistence;

import java.util.Date;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.web.as.domain.OutingVO;


@Mapper
public interface OutingMapper {
	List<OutingVO> selectOne(String outingDate); // 특정 게시글 조회
	List<OutingVO>selectByDateRange(@Param("startDate") String startDate, @Param("endDate") String endDate); // 기간에 맞게 조회
}
