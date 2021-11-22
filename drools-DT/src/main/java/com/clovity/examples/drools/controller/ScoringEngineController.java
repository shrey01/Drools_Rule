package com.clovity.examples.drools.controller;


import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.clovity.examples.drools.domain.Candidate;

@RestController
public class ScoringEngineController {

	private final KieContainer kieContainer;

	public ScoringEngineController(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

	@RequestMapping(value = "/getResult", method = RequestMethod.GET, produces = "application/json")
	public Candidate getQuestions(@RequestParam(required = true) String CandidateName,
			@RequestParam(required = true) Integer Q1_Mark, @RequestParam(required = true) Integer Q2_Mark,
			@RequestParam(required = true) Integer Q3_Mark, @RequestParam(required = true) Integer Q4_Mark,
			@RequestParam(required = true) Integer Q5_Mark, @RequestParam(required = true) Integer Q6_Mark,
			@RequestParam(required = true) Integer Q7_Mark, @RequestParam(required = true) Integer Q8_Mark,
			@RequestParam(required = true) Integer Q9_Mark, @RequestParam(required = true) Integer Q10_Mark,
			@RequestParam(required = true) Integer Q1_Mark_got, @RequestParam(required = true) Integer Q2_Mark_got,
			@RequestParam(required = true) Integer Q3_Mark_got, @RequestParam(required = true) Integer Q4_Mark_got,
			@RequestParam(required = true) Integer Q5_Mark_got, @RequestParam(required = true) Integer Q6_Mark_got,
			@RequestParam(required = true) Integer Q7_Mark_got, @RequestParam(required = true) Integer Q8_Mark_got,
			@RequestParam(required = true) Integer Q9_Mark_got, @RequestParam(required = true) Integer Q10_Mark_got) {
		KieSession kieSession = kieContainer.newKieSession();

		Candidate cd = new Candidate(CandidateName, Q1_Mark, Q2_Mark, Q3_Mark, Q4_Mark, Q5_Mark, Q6_Mark, Q7_Mark,
				Q8_Mark, Q9_Mark, Q10_Mark, Q1_Mark_got, Q2_Mark_got, Q3_Mark_got, Q4_Mark_got, Q5_Mark_got,
				Q6_Mark_got, Q7_Mark_got, Q8_Mark_got, Q9_Mark_got, Q10_Mark_got);
		cd.setTotal_Marks(
				Q1_Mark + Q2_Mark + Q3_Mark + Q4_Mark + Q5_Mark + Q6_Mark + Q7_Mark + Q8_Mark + Q9_Mark + Q10_Mark);
		cd.setMarksObtained(Q1_Mark_got + Q2_Mark_got + Q3_Mark_got + Q4_Mark_got + Q5_Mark_got + Q6_Mark_got
				+ Q7_Mark_got + Q8_Mark_got + Q9_Mark_got + Q10_Mark_got);
		float d = cd.getMarksObtained() / cd.getTotal_Marks();
		cd.setPercentage(d * 100);
		char g = getGrade(cd.getPercentage());
		cd.setGrade(g);
		kieSession.insert(cd);
		kieSession.fireAllRules();
		kieSession.dispose();
		System.out.println(cd.toString());
		return cd;
	}

	private char getGrade(double percentage) {
		char p;

		if (percentage > 100) {
			p = 'O';
			return p;
		}
		if (percentage > 90)
			p = 'A';
		else if (percentage > 80 && percentage <= 90)
			p = 'B';
		else if (percentage > 70 && percentage <= 80)
			p = 'C';
		else if (percentage > 60 && percentage <= 70)
			p = 'D';
		else if (percentage > 50 && percentage <= 60)
			p = 'E';
		else if (percentage > 40 && percentage <= 50)
			p = 'F';
		else
			p = 'G';
		return p;
	}

}
