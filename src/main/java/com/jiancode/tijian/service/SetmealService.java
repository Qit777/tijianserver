
package com.jiancode.tijian.service;

import com.jiancode.tijian.po.Setmeal;

import java.util.List;

public interface SetmealService {

	public List<Setmeal> listSetmealByType(Integer type);
	public Setmeal getSetmealById(Integer smId);
}
