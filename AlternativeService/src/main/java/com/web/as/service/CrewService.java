package com.web.as.service;

import java.util.List;
import com.web.as.domain.CrewVO;

public interface CrewService {

    // Create
    void insertCrew(CrewVO crew);

    // Read by ID
    CrewVO getCrewById(int crewId);

    // Read All
    List<CrewVO> getAllCrews();

    // Update
    void updateCrew(CrewVO crew);

    // Delete
    void deleteCrew(int crewId);
}
