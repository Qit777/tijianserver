package com.jiancode.tijian.mapper;

import com.jiancode.tijian.po.CiReport;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CiReportMapper {
	@Select("select * from ciReport where orderId=#{orderId} order by cirId")
	public List<CiReport> listCiReport(Integer orderId);

}
