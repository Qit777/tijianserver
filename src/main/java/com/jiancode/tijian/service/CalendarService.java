package com.jiancode.tijian.service;

import com.jiancode.tijian.dto.CalendarRequestDto;
import com.jiancode.tijian.dto.CalendarResponseDto;

import java.util.List;

public interface CalendarService {
	
	// 生成预约日历
	public List<CalendarResponseDto> listAppointmentCalendar(CalendarRequestDto calendarRequestDto);

}
