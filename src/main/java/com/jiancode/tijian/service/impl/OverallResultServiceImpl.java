package com.jiancode.tijian.service.impl;

import com.jiancode.tijian.mapper.OverallResultMapper;
import com.jiancode.tijian.po.OverallResult;
import com.jiancode.tijian.service.OverallResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OverallResultServiceImpl implements OverallResultService{
	
	@Autowired
	private OverallResultMapper overallResultMapper;

	@Override
	public List<OverallResult> listOverallResultByOrderId(Integer orderId) {
		return overallResultMapper.listOverallResultByOrderId(orderId);
	}
	
}
