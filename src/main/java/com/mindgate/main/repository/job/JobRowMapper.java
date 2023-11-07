package com.mindgate.main.repository.job;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mindgate.main.domain.Job;
import com.mindgate.main.domain.Project;
import com.mindgate.main.repository.project.ProjectRowMapper;

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
		int requiredEmployees = rs.getInt("required_employees");
		String status = rs.getString("status");

		ProjectRowMapper projectRowMapper = new ProjectRowMapper();
		Project project = projectRowMapper.mapRow(rs, rowNum);
		Job job = new Job(jobId, title, qualification, skill1, skill2, skill3, projectId, requiredEmployees, status,
				project);
		return job;
	}
}
