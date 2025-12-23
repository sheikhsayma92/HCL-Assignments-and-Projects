package Assignment2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;
import java.util.regex.Pattern;

//Interface
interface StudOps {
	void addStudent(Stud s) throws Exception;

	void displayStudents();

	void removeStudent(String id) throws Exception;

	void searchStudent(String id) throws Exception;

	void sortByMarks();

	void convertHashMapToTreeMap();

	void countCourseWise();

	void displayCourses();
}

//StudMgmt class
class StudMgmt implements StudOps {
	private List<Stud> studentList = new ArrayList<>();
	private Vector<Stud> studentVector = new Vector<>();
	private Stack<Stud> studentStack = new Stack<>();
	private Map<String, Stud> studentMap = new HashMap<>();
	private Hashtable<String, Stud> studentTable = new Hashtable<>();
	private Set<String> courses = new HashSet<>();

	// Regex validation
	private boolean validateId(String id) {
		return Pattern.matches("\\d+", id);
	}

	private boolean validateName(String name) {
		return Pattern.matches("[A-Za-z ]+", name);
	}

	private boolean validateCourse(String course) {
		return Pattern.matches("[A-Za-z ]+", course);
	}

	@Override
	public void addStudent(Stud s) throws Exception {
		if (!validateId(s.getId()))
			throw new Exception("Invalid ID!");
		if (!validateName(s.getName()))
			throw new Exception("Invalid Name!");
		if (!validateCourse(s.getCourse()))
			throw new Exception("Invalid Course!");

		if (studentMap.containsKey(s.getId()))
			throw new Exception("Duplicate ID!");

		studentList.add(s);
		studentVector.add(s);
		studentStack.push(s);
		studentMap.put(s.getId(), s);
		studentTable.put(s.getId(), s);
		courses.add(s.getCourse());

		System.out.println("Student added successfully!");
	}

	@Override
	public void displayStudents() {
		if (studentList.isEmpty()) {
			System.out.println("No student records found.");
			return;
		}
		System.out.println("\n--- Student Records ---");
		for (Stud s : studentList) {
			System.out.println(s);
		}
	}

	@Override
	public void removeStudent(String id) throws Exception {
		if (!studentMap.containsKey(id))
			throw new Exception("Student not found!");
		Stud s = studentMap.remove(id);
		studentList.remove(s);
		studentVector.remove(s);
		studentTable.remove(id);
		System.out.println("Student removed successfully!");
	}

	@Override
	public void searchStudent(String id) throws Exception {
		if (studentMap.containsKey(id)) {
			System.out.println("Student Found: " + studentMap.get(id));
		} else {
			throw new Exception("Student not found!");
		}
	}

	@Override
	public void sortByMarks() {
		studentList.sort(Comparator.comparingInt(Stud::getMarks).reversed());
		System.out.println("Students sorted by marks:");
		displayStudents();
	}

	@Override
	public void convertHashMapToTreeMap() {
		TreeMap<String, Stud> treeMap = new TreeMap<>(studentMap);
		System.out.println("Converted HashMap to TreeMap:");
		for (Map.Entry<String, Stud> entry : treeMap.entrySet()) {
			System.out.println(entry.getValue());
		}
	}

	@Override
	public void countCourseWise() {
		Map<String, Integer> courseCount = new HashMap<>();
		for (Stud s : studentList) {
			courseCount.put(s.getCourse(), courseCount.getOrDefault(s.getCourse(), 0) + 1);
		}
		System.out.println("Course-wise student count: " + courseCount);
	}

	@Override
	public void displayCourses() {
		System.out.println("Unique Courses: " + courses);
	}
}
