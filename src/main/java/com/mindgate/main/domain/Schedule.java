package com.mindgate.main.domain;

import java.util.Date;

public class Schedule {

	private String scheduleId;
	private String candidateId;
	private String interviewerId;
	private Date interviewDate;
	private String interviewStatus;
	private String assessmentId;
	
	public Schedule() {
		// TODO Auto-generated constructor stub
	}

	public Schedule(String scheduleId, String candidateId, String interviewerId, Date interviewDate,
			String interviewStatus, String assessmentId) {
		super();
		this.scheduleId = scheduleId;
		this.candidateId = candidateId;
		this.interviewerId = interviewerId;
		this.interviewDate = interviewDate;
		this.interviewStatus = interviewStatus;
		this.assessmentId = assessmentId;
	}

	public String getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}

	public String getInterviewerId() {
		return interviewerId;
	}

	public void setInterviewerId(String interviewerId) {
		this.interviewerId = interviewerId;
	}

	public Date getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}

	public String getInterviewStatus() {
		return interviewStatus;
	}

	public void setInterviewStatus(String interviewStatus) {
		this.interviewStatus = interviewStatus;
	}

	public String getAssessmentId() {
		return assessmentId;
	}

	public void setAssessmentId(String assessmentId) {
		this.assessmentId = assessmentId;
	}

	@Override
	public String toString() {
		return "Schedule [scheduleId=" + scheduleId + ", candidateId=" + candidateId + ", interviewerId="
				+ interviewerId + ", interviewDate=" + interviewDate + ", interviewStatus=" + interviewStatus
				+ ", assessmentId=" + assessmentId + "]";
	}
	
}
