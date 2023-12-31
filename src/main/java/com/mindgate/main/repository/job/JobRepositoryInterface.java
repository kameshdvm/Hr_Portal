package com.mindgate.main.repository.job;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mindgate.main.domain.Job;

@Repository
public interface JobRepositoryInterface {

	public boolean addJobDescription(Job job);

	public Job updateJob(Job job);

	public boolean deleteJob(String jobId);

	public Job getOneJob(String jobId);

	public List<Job> getAllJob();
}
