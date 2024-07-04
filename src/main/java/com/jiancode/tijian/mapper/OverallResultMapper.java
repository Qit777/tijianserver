package com.jiancode.tijian.mapper;

import com.jiancode.tijian.po.OverallResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OverallResultMapper {
	
	@Select("select * from overallResult where orderId=#{orderId} order by orderId")
	public List<OverallResult> listOverallResultByOrderId(Integer orderId);

}
