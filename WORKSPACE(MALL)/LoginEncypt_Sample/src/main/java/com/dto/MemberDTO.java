package com.dto;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;

@Alias("MemberDTO")
@Data  //lombok  - get/set/tostring 
@AllArgsConstructor  //lombok -매개변수 가진 생성자 
public class MemberDTO {
	String id;
	String password;
	public MemberDTO() {}   //기본생성자 작성 
}
