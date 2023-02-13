package com.home.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

	@Select("select sysdate from dual") //mapper.xml이 없을때
	public String getTime();
	
	public String getTime2(); //mapper.xml에서 처리할때
}
