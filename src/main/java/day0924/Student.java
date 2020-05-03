package day0924;

public class Student {
	String name;
	String classnum;
	int score;
	
	public Student(String name, String classnum, int score) {
		super();
		this.name = name;
		this.classnum = classnum;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassnum() {
		return classnum;
	}
	public void setClassnum(String classnum) {
		this.classnum = classnum;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	

}
