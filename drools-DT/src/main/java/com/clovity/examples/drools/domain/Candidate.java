package com.clovity.examples.drools.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Candidate {
	private String Candidate_Name;
	private float Total_Marks;
	private Integer Q1_Mark;
	private Integer Q2_Mark;
	private Integer Q3_Mark;
	private Integer Q4_Mark;
	private Integer Q5_Mark;
	private Integer Q6_Mark;
	private Integer Q7_Mark;
	private Integer Q8_Mark;
	private Integer Q9_Mark;
	private Integer Q10_Mark;
	private Integer Q1_Mark_got;
	private Integer Q2_Mark_got;
	private Integer Q3_Mark_got;
	private Integer Q4_Mark_got;
	private Integer Q5_Mark_got;
	private Integer Q6_Mark_got;
	private Integer Q7_Mark_got;
	private Integer Q8_Mark_got;
	private Integer Q9_Mark_got;
	private Integer Q10_Mark_got;
	private float MarksObtained;
	private float Percentage;
	private String Result;
	private char Grade;
	String Remark;
	public String getRemark() {
		return Remark;
	}


	public void setRemark(String remark) {
		Remark = remark;
	}


	public Candidate(String candidateName, Integer q1_Mark2, Integer q2_Mark2, Integer q3_Mark2, Integer q4_Mark2,
			Integer q5_Mark2, Integer q6_Mark2, Integer q7_Mark2, Integer q8_Mark2, Integer q9_Mark2, Integer q10_Mark2,
			Integer q1_Mark_got2, Integer q2_Mark_got2, Integer q3_Mark_got2, Integer q4_Mark_got2,
			Integer q5_Mark_got2, Integer q6_Mark_got2, Integer q7_Mark_got2, Integer q8_Mark_got2, 
			Integer q9_Mark_got2, Integer q10_Mark_got2) {
		this.Candidate_Name = candidateName;
		this.Q1_Mark = q1_Mark2;
		this.Q2_Mark = q2_Mark2;
		this.Q3_Mark = q3_Mark2;
		this.Q4_Mark = q4_Mark2;
		this.Q5_Mark = q5_Mark2;
		this.Q6_Mark = q6_Mark2;
		this.Q7_Mark = q7_Mark2;
		this.Q8_Mark = q8_Mark2;
		this.Q9_Mark = q9_Mark2;
		this.Q10_Mark = q10_Mark2;
		this.Q1_Mark_got=q1_Mark_got2;
		this.Q2_Mark_got=q2_Mark_got2;
		this.Q3_Mark_got=q3_Mark_got2;
		this.Q4_Mark_got=q4_Mark_got2;
		this.Q5_Mark_got=q5_Mark_got2;
		this.Q6_Mark_got=q6_Mark_got2;
		this.Q7_Mark_got=q7_Mark_got2;
		this.Q8_Mark_got=q8_Mark_got2;
		this.Q9_Mark_got=q9_Mark_got2;
		this.Q10_Mark_got=q10_Mark_got2;
	}


	public char getGrade() {
		return Grade;
	}

	public void setGrade(char grade) {
		this.Grade = grade;
	}

	public void setTotal_Marks(float total_Marks) {
		Total_Marks = total_Marks;
	}

	public void setMarksObtained(float marksObtained) {
		MarksObtained = marksObtained;
	}

	public String getCandidate_Name() {
		return Candidate_Name;
	}

	public void setCandidate_Name(String candidate_Name) {
		Candidate_Name = candidate_Name;
	}

	public float getTotal_Marks() {
		return Total_Marks;
	}

	public void setTotal_Marks(Integer total_Marks) {
		Total_Marks = total_Marks;
	}

	public Integer getQ1_Mark() {
		return Q1_Mark;
	}

	public void setQ1_Mark(Integer q1_Mark) {
		Q1_Mark = q1_Mark;
	}

	public Integer getQ2_Mark() {
		return Q2_Mark;
	}

	public void setQ2_Mark(Integer q2_Mark) {
		Q2_Mark = q2_Mark;
	}

	public Integer getQ3_Mark() {
		return Q3_Mark;
	}

	public void setQ3_Mark(Integer q3_Mark) {
		Q3_Mark = q3_Mark;
	}

	public Integer getQ4_Mark() {
		return Q4_Mark;
	}

	public void setQ4_Mark(Integer q4_Mark) {
		Q4_Mark = q4_Mark;
	}

	public Integer getQ5_Mark() {
		return Q5_Mark;
	}

	public void setQ5_Mark(Integer q5_Mark) {
		Q5_Mark = q5_Mark;
	}

	public Integer getQ6_Mark() {
		return Q6_Mark;
	}

	public void setQ6_Mark(Integer q6_Mark) {
		Q6_Mark = q6_Mark;
	}

	public Integer getQ7_Mark() {
		return Q7_Mark;
	}

	public void setQ7_Mark(Integer q7_Mark) {
		Q7_Mark = q7_Mark;
	}

	public Integer getQ8_Mark() {
		return Q8_Mark;
	}

	public void setQ8_Mark(Integer q8_Mark) {
		Q8_Mark = q8_Mark;
	}

	public Integer getQ9_Mark() {
		return Q9_Mark;
	}

	public void setQ9_Mark(Integer q9_Mark) {
		Q9_Mark = q9_Mark;
	}

	public Integer getQ10_Mark() {
		return Q10_Mark;
	}

	public void setQ10_Mark(Integer q10_Mark) {
		Q10_Mark = q10_Mark;
	}

	public Integer getQ1_Mark_got() {
		return Q1_Mark_got;
	}

	public void setQ1_Mark_got(Integer q1_Mark_got) {
		Q1_Mark_got = q1_Mark_got;
	}

	public Integer getQ2_Mark_got() {
		return Q2_Mark_got;
	}

	public void setQ2_Mark_got(Integer q2_Mark_got) {
		Q2_Mark_got = q2_Mark_got;
	}

	public Integer getQ3_Mark_got() {
		return Q3_Mark_got;
	}

	public void setQ3_Mark_got(Integer q3_Mark_got) {
		Q3_Mark_got = q3_Mark_got;
	}

	public Integer getQ4_Mark_got() {
		return Q4_Mark_got;
	}

	public void setQ4_Mark_got(Integer q4_Mark_got) {
		Q4_Mark_got = q4_Mark_got;
	}

	public Integer getQ5_Mark_got() {
		return Q5_Mark_got;
	}

	public void setQ5_Mark_got(Integer q5_Mark_got) {
		Q5_Mark_got = q5_Mark_got;
	}

	public Integer getQ6_Mark_got() {
		return Q6_Mark_got;
	}

	public void setQ6_Mark_got(Integer q6_Mark_got) {
		Q6_Mark_got = q6_Mark_got;
	}

	public Integer getQ7_Mark_got() {
		return Q7_Mark_got;
	}

	public void setQ7_Mark_got(Integer q7_Mark_got) {
		Q7_Mark_got = q7_Mark_got;
	}

	public Integer getQ8_Mark_got() {
		return Q8_Mark_got;
	}

	public void setQ8_Mark_got(Integer q8_Mark_got) {
		Q8_Mark_got = q8_Mark_got;
	}

	public Integer getQ9_Mark_got() {
		return Q9_Mark_got;
	}

	public void setQ9_Mark_got(Integer q9_Mark_got) {
		Q9_Mark_got = q9_Mark_got;
	}

	public Integer getQ10_Mark_got() {
		return Q10_Mark_got;
	}

	public void setQ10_Mark_got(Integer q10_Mark_got) {
		Q10_Mark_got = q10_Mark_got;
	}

	public float getMarksObtained() {
		return MarksObtained;
	}

	public void setMarksObtained(Integer marksObtained) {
		MarksObtained = marksObtained;
	}

	public double getPercentage() {
		return Percentage;
	}

	public void setPercentage(float percentage) {
		Percentage = percentage;
	}

	public String getResult() {
		return Result;
	}

	public void setResult(String result) {
		Result = result;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Candidate_Name, MarksObtained, Percentage, Q10_Mark, Q10_Mark_got, Q1_Mark, Q1_Mark_got,
				Q2_Mark, Q2_Mark_got, Q3_Mark, Q3_Mark_got, Q4_Mark, Q4_Mark_got, Q5_Mark, Q5_Mark_got, Q6_Mark,
				Q6_Mark_got, Q7_Mark, Q7_Mark_got, Q8_Mark, Q8_Mark_got, Q9_Mark, Q9_Mark_got, Result, Total_Marks,
				Grade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidate other = (Candidate) obj;
		return Objects.equals(Candidate_Name, other.Candidate_Name)
				&& Float.floatToIntBits(MarksObtained) == Float.floatToIntBits(other.MarksObtained)
				&& Float.floatToIntBits(Percentage) == Float.floatToIntBits(other.Percentage)
				&& Objects.equals(Q10_Mark, other.Q10_Mark) && Objects.equals(Q10_Mark_got, other.Q10_Mark_got)
				&& Objects.equals(Q1_Mark, other.Q1_Mark) && Objects.equals(Q1_Mark_got, other.Q1_Mark_got)
				&& Objects.equals(Q2_Mark, other.Q2_Mark) && Objects.equals(Q2_Mark_got, other.Q2_Mark_got)
				&& Objects.equals(Q3_Mark, other.Q3_Mark) && Objects.equals(Q3_Mark_got, other.Q3_Mark_got)
				&& Objects.equals(Q4_Mark, other.Q4_Mark) && Objects.equals(Q4_Mark_got, other.Q4_Mark_got)
				&& Objects.equals(Q5_Mark, other.Q5_Mark) && Objects.equals(Q5_Mark_got, other.Q5_Mark_got)
				&& Objects.equals(Q6_Mark, other.Q6_Mark) && Objects.equals(Q6_Mark_got, other.Q6_Mark_got)
				&& Objects.equals(Q7_Mark, other.Q7_Mark) && Objects.equals(Q7_Mark_got, other.Q7_Mark_got)
				&& Objects.equals(Q8_Mark, other.Q8_Mark) && Objects.equals(Q8_Mark_got, other.Q8_Mark_got)
				&& Objects.equals(Q9_Mark, other.Q9_Mark) && Objects.equals(Q9_Mark_got, other.Q9_Mark_got)
				&& Objects.equals(Result, other.Result)
				&& Float.floatToIntBits(Total_Marks) == Float.floatToIntBits(other.Total_Marks) && Grade == other.Grade;
	}

	@Override
	public String toString() {
		return "Candidate [Candidate_Name=" + Candidate_Name + ", Total_Marks=" + Total_Marks + ", Q1_Mark=" + Q1_Mark
				+ ", Q2_Mark=" + Q2_Mark + ", Q3_Mark=" + Q3_Mark + ", Q4_Mark=" + Q4_Mark + ", Q5_Mark=" + Q5_Mark
				+ ", Q6_Mark=" + Q6_Mark + ", Q7_Mark=" + Q7_Mark + ", Q8_Mark=" + Q8_Mark + ", Q9_Mark=" + Q9_Mark
				+ ", Q10_Mark=" + Q10_Mark + ", Q1_Mark_got=" + Q1_Mark_got + ", Q2_Mark_got=" + Q2_Mark_got
				+ ", Q3_Mark_got=" + Q3_Mark_got + ", Q4_Mark_got=" + Q4_Mark_got + ", Q5_Mark_got=" + Q5_Mark_got
				+ ", Q6_Mark_got=" + Q6_Mark_got + ", Q7_Mark_got=" + Q7_Mark_got + ", Q8_Mark_got=" + Q8_Mark_got
				+ ", Q9_Mark_got=" + Q9_Mark_got + ", Q10_Mark_got=" + Q10_Mark_got + ", MarksObtained=" + MarksObtained
				+ ", Percentage=" + Percentage + ", Result=" + Result + ", grade=" + Grade + "]";
	}

	
}
