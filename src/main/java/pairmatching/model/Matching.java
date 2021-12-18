package pairmatching.model;

import java.util.ArrayList;

public class Matching {
	private String course;
	private String level;
	private String mission;
	private ArrayList<Crew> crews;

	public boolean isSameCourse(String course) {
		return this.course.equals(course);
	}

	public boolean isSameLevel(String level) {
		return this.level.equals(level);
	}

	public boolean isSameMission(String mission) {
		return this.mission.equals(mission);
	}
}
