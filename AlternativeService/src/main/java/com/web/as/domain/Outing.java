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
public class Outing {
	private int outingId;
	private String serviceNo;
	private String memberName;
	private String outingType;
	private String reason;
	private Date outingDate;
	private String dayOfWeek;
	private String remarks;
}
