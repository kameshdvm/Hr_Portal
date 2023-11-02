package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.domain.Job;
import com.mindgate.main.repository.JobRepository;

@Service
public class JobService implements JobServiceInterface {
	
	@Autowired
	JobRepository jobRepository;
	
	@Override
	public boolean addJobDescription(Job job) {
		// TODO Auto-generated method stub
		return jobRepository.addJobDescription(job);
	}

	@Override
	public Job updateJob(Job job) {
		// TODO Auto-generated method stub
		return jobRepository.updateJob(job);
	}

	@Override
	public boolean deleteJob(String jobId) {
		// TODO Auto-generated method stub
		return jobRepository.deleteJob(jobId);
	}

	@Override
	public Job getOneJob(String jobId) {
		// TODO Auto-generated method stub
		return jobRepository.getOneJob(jobId);
	}

	@Override
	public List<Job> getAllJob() {
		// TODO Auto-generated method stub
		return jobRepository.getAllJob();
	}

}
