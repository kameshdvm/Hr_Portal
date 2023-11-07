package com.mindgate.main.repository.schedule;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.domain.Schedule;

public class ScheduleRowMapper implements RowMapper<Schedule> {

	@Override
	public Schedule mapRow(ResultSet rs, int rowNum) throws SQLException {
		String scheduleId = rs.getString("schedule_id");
		String candidateId = rs.getString("candidate_id");
		String interviewerId = rs.getString("interviewer_id");
		Date interviewDate = rs.getDate("interview_date");
		String interviewStatus = rs.getString("interview_status");
		String assessmentId = rs.getString("assessment_id");

		Schedule schedule = new Schedule(scheduleId, candidateId, interviewerId, interviewDate, interviewStatus,
				assessmentId);
		return schedule;
	}

}
