package com.web.as.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class CrewVO {

    private int crewId;            // CREW_ID
    private int memberId;          // MEMBER_ID
    private String crewName;       // CREW_NAME
    private String crewPhone;      // CREW_PHONE
    private String crewCallDate;   // CREW_CALL_DATE
    private String crewRole;       // CREW_ROLE
    private String crewScore;      // CREW_SCORE
    private String room;           // ROOM
}
