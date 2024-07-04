
package com.jiancode.tijian.service.impl;

import com.jiancode.tijian.mapper.SetmealMapper;
import com.jiancode.tijian.po.Setmeal;
import com.jiancode.tijian.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetmealServiceImpl implements SetmealService {

	@Autowired
	private SetmealMapper setmealMapper;

	@Override
	public List<Setmeal> listSetmealByType(Integer type) {
		return setmealMapper.listSetmealByType(type);
	}
	
	@Override
	public Setmeal getSetmealById(Integer smId) {
		return setmealMapper.getSetmealById(smId);
	}
}
