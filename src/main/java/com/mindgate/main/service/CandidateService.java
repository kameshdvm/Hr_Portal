package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.domain.Candidate;
import com.mindgate.main.repository.candidate.CandidateRepositoryInterface;
@Service
public class CandidateService implements CandidateServiceInterface {

	@Autowired
	private CandidateRepositoryInterface candidate_repo_Interface;
	@Override
	public boolean addNewCandidate(Candidate candidate) {
		// TODO Auto-generated method stub
		return candidate_repo_Interface.addNewCandidate(candidate);
	}

	@Override
	public Candidate UpdateCandidate(Candidate candidate) {
		// TODO Auto-generated method stub
		return candidate_repo_Interface.UpdateCandidate(candidate);
	}

	@Override
	public boolean deleteCandidate(String candidateId) {
		// TODO Auto-generated method stub
		return candidate_repo_Interface.deleteCandidate(candidateId);
	}

	@Override
	public Candidate getCandidateByCandidateId(String candidateId) {
		// TODO Auto-generated method stub
		return candidate_repo_Interface.getCandidateByCandidateId(candidateId);
	}

	@Override
	public List<Candidate> getAllCandidate() {
		// TODO Auto-generated method stub
		return candidate_repo_Interface.getAllCandidate();
	}

}
