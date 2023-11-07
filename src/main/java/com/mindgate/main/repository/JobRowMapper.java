package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mindgate.main.domain.Job;
import com.mindgate.main.domain.Project;

@Repository
public class JobRowMapper implements RowMapper<Job> {

	@Autowired
	ProjectRowMapper projectRowMapper;

	@Override
	public Job mapRow(ResultSet rs, int rowNum) throws SQLException {

		String jobId = rs.getString("job_id");
		String title = rs.getString("title");
		String qualification = rs.getString("qualification");
		String skill1 = rs.getString("skill_1");
		String skill2 = rs.getString("skill_2");
		String skill3 = rs.getString("skill_3");
		String projectId = rs.getString("project_id");
		String projectName = rs.getString("project_name");
		String startDate = rs.getString("start_date");
		String endDate = rs.getString("end_date");
		int budget = rs.getInt("budget");
		int requiredEmployees = rs.getInt("required_employees");
		String status = rs.getString("status");

		Project project = new Project(projectId, projectName, startDate, endDate, budget);
		Job job = new Job(jobId, title, qualification, skill1, skill2, skill3, project, requiredEmployees, status);
		return job;
	}
}
