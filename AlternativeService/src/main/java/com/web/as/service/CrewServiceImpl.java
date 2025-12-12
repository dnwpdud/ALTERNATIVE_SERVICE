package com.web.as.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.as.domain.CrewVO;
import com.web.as.persistence.CrewMapper;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class CrewServiceImpl implements CrewService {

    @Autowired
    private CrewMapper crewMapper;

    // ---------------------------
    // 1. Crew 등록
    // ---------------------------
    @Override
    public void insertCrew(CrewVO crew) {
        log.info("insertCrew() 호출");
        log.info("Crew 데이터: " + crew);

        crewMapper.insertCrew(crew);
        log.info("Crew 등록 완료");
    }

    // ---------------------------
    // 2. ID로 Crew 조회
    // ---------------------------
    @Override
    public CrewVO getCrewById(int crewId) {
        log.info("getCrewById() 호출");
        log.info("조회할 crewId: " + crewId);

        CrewVO crew = crewMapper.getCrewById(crewId);

        log.info("조회 결과 : " + crew);
        return crew;
    }

    // ---------------------------
    // 3. 전체 Crew 목록 조회
    // ---------------------------
    @Override
    public List<CrewVO> getAllCrews() {
        log.info("getAllCrews() 호출");

        List<CrewVO> crewList = crewMapper.getAllCrews();

        log.info("전체 목록 크기: " + crewList.size());
        return crewList;
    }

    // ---------------------------
    // 4. Crew 정보 수정
    // ---------------------------
    @Override
    public void updateCrew(CrewVO crew) {
        log.info("updateCrew() 호출");
        log.info("수정할 Crew 데이터: " + crew);

        crewMapper.updateCrew(crew);
        log.info("Crew 수정 완료");
    }

    // ---------------------------
    // 5. Crew 삭제
    // ---------------------------
    @Override
    public void deleteCrew(int crewId) {
        log.info("deleteCrew() 호출");
        log.info("삭제할 crewId: " + crewId);

        crewMapper.deleteCrew(crewId);
        log.info("Crew 삭제 완료");
    }
}
