package oops;

public class ScienceStudent extends Student {
	private String projectName;
	private double rating;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public ScienceStudent(String name, int id, String projectName, double rating) {
		super(name, id);
		this.projectName = projectName;
		this.rating = rating;
	}

	public void displayScienceStudent() {
		this.displayStudent();
		System.out.println(projectName);
		System.out.println(rating);
	}
}