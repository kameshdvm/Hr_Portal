package com.mindgate.main.domain;

public class Candidate {

	private String candidateId;
	private String candidateName;
	private String skills;
	private String qualification;
	private String passedOutYear;
	private String interviewDate;
	private String experience;
	private String grade;
	private Long phone;
	private String email;
	private String applyDate;
	private String jobId;
	private Job job;

	public Candidate() {
		// TODO Auto-generated constructor stub
	}

	public Candidate(String candidateId, String candidateName, String skills, String qualification,
			String passedOutYear, String interviewDate, String experience, String grade, Long phone, String email,
			String applyDate, String jobId, Job job) {
		super();
		this.candidateId = candidateId;
		this.candidateName = candidateName;
		this.skills = skills;
		this.qualification = qualification;
		this.passedOutYear = passedOutYear;
		this.interviewDate = interviewDate;
		this.experience = experience;
		this.grade = grade;
		this.phone = phone;
		this.email = email;
		this.applyDate = applyDate;
		this.jobId = jobId;
		this.job = job;
	}

	public String getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPassedOutYear() {
		return passedOutYear;
	}

	public void setPassedOutYear(String passedOutYear) {
		this.passedOutYear = passedOutYear;
	}

	public String getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(String interviewDate) {
		this.interviewDate = interviewDate;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Candidate [candidateId=" + candidateId + ", candidateName=" + candidateName + ", skills=" + skills
				+ ", qualification=" + qualification + ", passedOutYear=" + passedOutYear + ", interviewDate="
				+ interviewDate + ", experience=" + experience + ", grade=" + grade + ", phone=" + phone + ", email="
				+ email + ", applyDate=" + applyDate + ", jobId=" + jobId + ", job=" + job + "]";
	}

}