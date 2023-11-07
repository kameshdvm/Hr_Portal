package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.domain.Candidate;
import com.mindgate.main.domain.Job;
import com.mindgate.main.domain.Project;

public class CandidateRowMapper implements RowMapper<Candidate> {

	@Override
	public Candidate mapRow(ResultSet rs, int rowNum) throws SQLException {
		String candidateId = rs.getString("candidate_id");
		String candidateName = rs.getString("candidate_name");
		String skills = rs.getString("skills");
		String qualification = rs.getString("qualification");
		String passedOutYear = rs.getString("passed_out_year");
		String interviewDate = rs.getString("interview_date");
		String experience = rs.getString("experience");
		String grade = rs.getString("grade");
		Long phone = rs.getLong("phone");
		String email = rs.getString("email");
		String applyDate = rs.getString("apply_date");
		String jobId = rs.getString("job_id");

		ProjectRowMapper projectRowMapper = new ProjectRowMapper();
		Project project = projectRowMapper.mapRow(rs, rowNum);

		JobRowMapper jobRowMapper = new JobRowMapper();
		Job job = jobRowMapper.mapRow(rs, rowNum);

		Candidate candidate = new Candidate(candidateId, candidateName, skills, qualification, 
		passedOutYear,interviewDate, experience, grade, phone, email, applyDate, jobId, job);

		return candidate;

	}

}
