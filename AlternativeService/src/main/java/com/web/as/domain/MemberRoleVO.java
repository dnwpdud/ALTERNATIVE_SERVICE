package com.web.as.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * MEMBER_ROLE 테이블과 매핑되는 VO 클래스
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class MemberRoleVO {

    /** 역할 고유 ID (PK) */
    private Long roleId;

    /** 회원 ID */
    private String memberId;

    /** 역할 이름 (예: ROLE_USER, ROLE_ADMIN) */
    private String roleName;
}
