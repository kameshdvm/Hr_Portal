package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mindgate.main.domain.Project;

@Repository
public class ProjectRowMapper implements RowMapper<Project>{

	@Override
	public Project mapRow(ResultSet rs, int rowNum) throws SQLException {
		String projectId=rs.getString("project_id");
		String projectName=rs.getString("project_name");
		String startDate=rs.getString("start_date");
		String endDate=rs.getString("end_date");
		double budget=rs.getDouble("budget");
		
		Project projectDetails=new Project(projectId, projectName, startDate, endDate, budget);
		
		return projectDetails ;
			
	}

}
