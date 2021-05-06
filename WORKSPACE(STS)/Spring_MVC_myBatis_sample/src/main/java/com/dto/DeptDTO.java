package com.dto;

import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Alias("dept")
@Data
/*
 * @Getter //get함수
 * 
 * @Setter //set함수
 * 
 * @ToString //ToString
 */
@AllArgsConstructor//매개변수 모두를 가진 생성자 자동 완성 
public class DeptDTO {
	int deptno;
	String dname;
	String loc;
	public DeptDTO() {}

	/*
	 * @Override public String toString() { return "DeptDTO [deptno=" + deptno +
	 * ", dname=" + dname + ", loc=" + loc + "]"; }
	 */
	
}
