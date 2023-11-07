package com.mindgate.main.repository.assessment;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.domain.Assessment;
import com.mindgate.main.domain.Candidate;
import com.mindgate.main.domain.Job;
import com.mindgate.main.domain.Project;
import com.mindgate.main.repository.candidate.CandidateRowMapper;
import com.mindgate.main.repository.job.JobRowMapper;
import com.mindgate.main.repository.project.ProjectRowMapper;

public class AssessmentRowMapper implements RowMapper<Assessment> {

	@Override
	public Assessment mapRow(ResultSet rs, int rowNum) throws SQLException {
		String assessmentId = rs.getString("assessment_Id");
		String round1 = rs.getString("round_1");
		String round2 = rs.getString("round_2");
		String round3 = rs.getString("round_3");
		String status = rs.getString("status");
		String candidateId = rs.getString("candidate_Id");

		ProjectRowMapper projectRowMapper = new ProjectRowMapper();
		Project project = projectRowMapper.mapRow(rs, rowNum);

		JobRowMapper jobRowMapper = new JobRowMapper();
		Job job = jobRowMapper.mapRow(rs, rowNum);

		CandidateRowMapper candidateRowMapper=new CandidateRowMapper();
		Candidate candidate = candidateRowMapper.mapRow(rs, rowNum);
		
		Assessment assessment=new Assessment(assessmentId, round1, round2, round3, status, candidateId, candidate);
		return assessment;
	}

}
