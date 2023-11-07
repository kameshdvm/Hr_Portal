package com.mindgate.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.domain.Candidate;
import com.mindgate.main.repository.candidate.CandidateRepositoryInterface;
import com.mindgate.main.service.CandidateServiceInterface;

@RestController
@RequestMapping("candidateApi")
public class CandidateController {

	@Autowired
	private CandidateServiceInterface candidate_Service_Interface;

	@RequestMapping(value = "candidate", method = RequestMethod.POST)
	public boolean addNewCandidate(@RequestBody Candidate candidate) {
		// TODO Auto-generated method stub
		return candidate_Service_Interface.addNewCandidate(candidate);
	}

	@RequestMapping(value = "candidate", method = RequestMethod.PUT)
	public Candidate UpdateCandidate(@RequestBody Candidate candidate) {
		// TODO Auto-generated method stub
		return candidate_Service_Interface.UpdateCandidate(candidate);
	}

//	http://localhost:8081/candidateApi/candidate/CAN4001
	@RequestMapping(value = "candidate/{candidateId}", method = RequestMethod.DELETE)
	public boolean deleteCandidate(@PathVariable String candidateId) {
		// TODO Auto-generated method stub
		return candidate_Service_Interface.deleteCandidate(candidateId);
	}

//	http://localhost:8081/candidateApi/candidate/CAN4001
	@RequestMapping(value = "candidate/{candidateId}", method = RequestMethod.GET)
	public Candidate getCandidateByCandidateId(@PathVariable String candidateId) {
		// TODO Auto-generated method stub
		return candidate_Service_Interface.getCandidateByCandidateId(candidateId);
	}

//	http://localhost:8081/candidateApi/candidate
	@RequestMapping(value = "candidate", method = RequestMethod.GET)
	public List<Candidate> getAllCandidate() {
		// TODO Auto-generated method stub
		return candidate_Service_Interface.getAllCandidate();
	}

}
