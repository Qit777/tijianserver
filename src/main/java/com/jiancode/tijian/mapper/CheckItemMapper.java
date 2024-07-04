
package com.jiancode.tijian.mapper;

import com.jiancode.tijian.po.CheckItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CheckItemMapper {

	@Select("select * from checkItem where ciId=#{ciId}")
	public CheckItem getCheckItemById(Integer ciId);

}
