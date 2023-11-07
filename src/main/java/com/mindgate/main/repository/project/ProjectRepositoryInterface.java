package com.mindgate.main.repository.project;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mindgate.main.domain.Project;

@Repository
public interface ProjectRepositoryInterface {
	
	public boolean addNewProject(Project projectDetails);
    public Project UpdateProject(Project projectDetails);
    public boolean deleteProject(String projectId);
    public Project getprojectByprojectId(String projectId);
    public List<Project> getAllproject();

}
