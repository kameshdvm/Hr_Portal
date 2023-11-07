package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.domain.Assessment;
import com.mindgate.main.repository.assessment.AssessementRepositoryInterface;

@Service
public class AssessmentService implements AssessmentServiceInterface {

	@Autowired
	private AssessementRepositoryInterface assessementRepositoryInterface;

	@Override
	public boolean addNewAssessment(Assessment assessment) {

		return assessementRepositoryInterface.addNewAssessment(assessment);
	}

	@Override
	public Assessment updateAssessment(Assessment assessment) {

		return assessementRepositoryInterface.updateAssessment(assessment);
	}

	@Override
	public boolean deleteAssessment(String assessmentId) {
		
		return assessementRepositoryInterface.deleteAssessment(assessmentId);
	}

	@Override
	public Assessment getOneAssessmentID(String assessmentId) {
		
		return assessementRepositoryInterface.getOneAssessmentID(assessmentId);
	}

	@Override
	public List<Assessment> getAllAssessment() {

		return assessementRepositoryInterface.getAllAssessment();
	}

}
