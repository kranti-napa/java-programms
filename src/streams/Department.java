package streams;

import java.util.List;

public class Department {

	private String deptName;
	private List<Student> students;
	
	public Department(String deptName, List<Student> students) {
		super();
		this.deptName = deptName;
		this.students = students;
	}
	
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List students) {
		this.students = students;
	}
}
