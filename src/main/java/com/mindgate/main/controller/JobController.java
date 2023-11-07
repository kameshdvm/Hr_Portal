package com.mindgate.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.domain.Job;
import com.mindgate.main.service.JobService;

@RestController
@RequestMapping("job")
public class JobController {
	
	@Autowired
	JobService jobService;
	
	@RequestMapping(value="add", method=RequestMethod.POST)
	public boolean addNew(@RequestBody Job job)
	{
		boolean added = jobService.addJobDescription(job);
		return added;
	}
	
	@RequestMapping(value="update",method=RequestMethod.PUT)
	public Job updateJob(@RequestBody Job job)
	{
		Job updated= jobService.updateJob(job);
		return updated;
	}
	
	@RequestMapping(value="delete/{jobId}",method=RequestMethod.DELETE)
	public boolean deleteJob(@PathVariable String jobId)
	{
		boolean deleted = jobService.deleteJob(jobId);
		return deleted;
	}
	
	@RequestMapping(value="/{jobId}", method=RequestMethod.GET)
	public Job getOneJob(@PathVariable String jobId)
	{
		Job jobDescription = jobService.getOneJob(jobId);
		return jobDescription;
	}
	
	@RequestMapping(value="getAll",method=RequestMethod.GET)
	public List<Job> getAllJob()
	{
		List<Job> jobDescriptionList = jobService.getAllJob();
		return jobDescriptionList;
	}
}
