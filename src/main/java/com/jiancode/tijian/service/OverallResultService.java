package com.jiancode.tijian.service;

import com.jiancode.tijian.po.OverallResult;

import java.util.List;

public interface OverallResultService {

	public List<OverallResult> listOverallResultByOrderId(Integer orderId);
}
