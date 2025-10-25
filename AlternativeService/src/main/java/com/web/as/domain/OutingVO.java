package com.web.as.domain;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter 
@Setter
@ToString 
public class OutingVO {
	private int outingId;
	private int crewId;
	private String crewNo;
	private String memberName;
	private String outingType;
	private String reason;
	private Date outingDate;
	private String dayOfWeek;
	private String remarks;
}
