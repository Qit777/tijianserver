
package com.jiancode.tijian.controller;

import com.jiancode.tijian.po.Setmeal;
import com.jiancode.tijian.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("/setmeal")
public class SetmealController {

	@Autowired
	private SetmealService setmealService;

	@RequestMapping("/listSetmealByType")
	public List<Setmeal> listSetmealByType(@RequestBody Setmeal setmeal) {
		return setmealService.listSetmealByType(setmeal.getType());
	}
	
	@RequestMapping("/getSetmealById")
	public Setmeal getSetmealById(@RequestBody Setmeal setmeal) {
		return setmealService.getSetmealById(setmeal.getSmId());
	}
}
