package com.mindgate.main.repository.schedule;

import java.util.List;

import com.mindgate.main.domain.Schedule;

public interface ScheduleRepositoryInterface {

	boolean addNewSchedule(Schedule schedule);
	
	Schedule updateSchedule(Schedule schedule);
	
	boolean deleteSchedule(String scheduleId);
	
	Schedule getScheduleByScheduleId(String scheduleId);
	
	List<Schedule> getAllSchedules();
}
