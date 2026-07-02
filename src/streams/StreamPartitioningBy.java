package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPartitioningBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("Deepu", 85.6);
		Student s2 = new Student("SriMadhurima", 95.5);
		Student s3=  new Student("Hasini", 92.4);
		List<Student> mpcStudents = new ArrayList<> ();
		mpcStudents.add(s1);
		mpcStudents.add(s2);
		mpcStudents.add(s3);
		
		Student s10 = new Student("Pooji", 85.9);
		Student s20 = new Student("Keerthana", 91.5);
		Student s30 =  new Student("Manasa", 70.4);
		List<Student> bipcStudents = new ArrayList<> ();
		bipcStudents.add(s10);
		bipcStudents.add(s20);
		bipcStudents.add(s30);
		
		Student s100 = new Student("Harsha", 94.9);
		Student s200 = new Student("Bindu", 69.5);
		Student s300 =  new Student("Sahana", 75.4);
		List<Student> cecStudents = new ArrayList<> ();
		cecStudents.add(s100);
		cecStudents.add(s200);
		cecStudents.add(s300);
		
		
		List<Department> departments = new ArrayList<> ();
		Department dept1 = new Department("MPC", mpcStudents);
		Department dept2 = new Department("BiPC", bipcStudents);
		Department dept3 = new Department("CEC", cecStudents);

		departments.add(dept3);
		departments.add(dept2);
		departments.add(dept1);
		
		Map<Boolean,List<Student>> students = departments.stream()
															.flatMap(dept -> dept.getStudents().stream())
															.collect(Collectors.partitioningBy(student -> student.getGrade() >= 85.0));
		
		System.out.print(students);
	}

}
