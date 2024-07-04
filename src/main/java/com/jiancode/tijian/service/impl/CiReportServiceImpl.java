package com.jiancode.tijian.service.impl;

import com.jiancode.tijian.mapper.CiDetailedReportMapper;
import com.jiancode.tijian.mapper.CiReportMapper;
import com.jiancode.tijian.po.CiDetailedReport;
import com.jiancode.tijian.po.CiReport;
import com.jiancode.tijian.service.CiReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiReportServiceImpl implements CiReportService{
	
	@Autowired
	private CiReportMapper  ciReportMapper;
	@Autowired
	private CiDetailedReportMapper ciDetailedReportMapper;

	/**
	 * 查询体检报告项以及每一项的明细
	 * @param orderId
	 * @return
	 */
	@Override
	public List<CiReport> listCiReport(Integer orderId) {
		// 先查询CiReport，获取报告检查项
	    List<CiReport> crList = ciReportMapper.listCiReport(orderId);
	    // 遍历所有检查项，依次查询检查项明细
	    for(CiReport cr : crList) {
	        CiDetailedReport param = new CiDetailedReport();
	        param.setOrderId(orderId);
	        param.setCiId(cr.getCiId());
	        List<CiDetailedReport> list = ciDetailedReportMapper.listCiDetailedReportByOrderIdByCiId(param);
	        
	        cr.setCidrList(list);
	    }
	    
	    return crList;
	}

	
}
