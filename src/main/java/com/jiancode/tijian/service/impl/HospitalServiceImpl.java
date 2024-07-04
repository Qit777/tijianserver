package com.jiancode.tijian.service.impl;

import com.jiancode.tijian.mapper.HospitalMapper;
import com.jiancode.tijian.po.Hospital;
import com.jiancode.tijian.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService{

	@Autowired
	private HospitalMapper hospitalMapper;

	@Override
	public List<Hospital> listHospital(Integer state) {
		return hospitalMapper.listHospital(state);
	}
	
	@Override
	public Hospital getHospitalById(Integer hpId) {
		return hospitalMapper.getHospitalById(hpId);
	}
}
