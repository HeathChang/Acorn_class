package com.dto;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;

@Alias("MemberDTO")
@Data // -get&set&toString
@AllArgsConstructor // 매개변수 가진 생성자
public class MemberDTO {

	String id;
	String password;

	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
