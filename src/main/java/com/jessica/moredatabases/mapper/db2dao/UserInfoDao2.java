package com.jessica.moredatabases.mapper.db2dao;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserInfoDao2 {
	@Select("select * from homepage_user where id=#{id}")
	public HashMap<String, Object> getUserinfoByID(@Param("id")long id);
}
