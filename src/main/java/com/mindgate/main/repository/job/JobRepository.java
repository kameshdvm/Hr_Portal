package com.mindgate.main.repository.job;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.domain.Job;

@Repository
public class JobRepository implements JobRepositoryInterface {

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	JobRowMapper jobRowMapper;
	
	private final static String INSERT_NEW_JOB_DESCRIPTION 
	="insert into job_description values('JOB' || job_sequence.nextVal,?,?,?,?,?,?,?,?)";
	private final static String DELETE_EXISTING_JOB_DESCRIPTION 
	="delete from job_description where job_Id=?";
	private final static String UPDATE_JOB_DESCRIPTION 
	="update job_description set title=?,qualification=?,skill_1=?,skill_2=?,skill_3=?,project_id=?,required_employees=?,status=? where job_id=?";
	private final static String SELECT_ALL_JOB
	="select * from job_description j,project_details p where j.project_id=p.project_id";
	private final static String SELECT_ONE_JOB
	="select * from job_description j,project_details p where j.project_id=p.project_id and job_id=?";
	
	@Override
	public boolean addJobDescription(Job job) {
		Object[] parameters={ job.getTitle(),job.getQualification(),
		job.getSkill1(),job.getSkill2(),job.getSkill3(),job.getProjectId(),
		job.getRequiredEmployees(),job.getStatus()};
		jdbcTemplate.update(INSERT_NEW_JOB_DESCRIPTION,parameters);
		return true;
	}

	@Override
	public Job updateJob(Job job) {
		Object[] parameters={ job.getTitle(),job.getQualification(),
				job.getSkill1(),job.getSkill2(),job.getSkill3(),job.getProjectId(),
				job.getRequiredEmployees(),job.getStatus(),job.getJobId()};
		
				String jobId = job.getJobId();
				int rowCount = jdbcTemplate.update(UPDATE_JOB_DESCRIPTION, parameters);
				if(rowCount>0)
					return job;
					else
					return null;
	}

	@Override
	public boolean deleteJob(String jobId) {
		int rowCount = jdbcTemplate.update(DELETE_EXISTING_JOB_DESCRIPTION,jobId);
		if(rowCount>0)
		return true;
		else
		return false;
	}

	@Override
	public Job getOneJob(String jobId) {
	Job oneJobDescription = jdbcTemplate.queryForObject(SELECT_ONE_JOB, jobRowMapper, jobId);
	return oneJobDescription;
	}

	@Override
	public List<Job> getAllJob() {
		JobRowMapper jobMapper= new JobRowMapper();
		List<Job> jobDescriptionList = jdbcTemplate.query(SELECT_ALL_JOB,jobMapper);
		return jobDescriptionList;
	}

}
