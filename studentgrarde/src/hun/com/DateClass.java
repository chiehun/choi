package hun.com;

import java.util.ArrayList;



public class DateClass {
ArrayList <Department>dept = new ArrayList<Department>(); // 학과 정보
ArrayList<Student> stu =new ArrayList<Student>(); //학생 정보
ArrayList<Takes> take = new ArrayList<Takes>(); //성적
	public DateClass() {
	
		
	}
	public void initDepartment() {
		dept.add( new Department  (920, "컴퓨터공학과", "201호"));
		dept.add(new Department(923, "산업공학과", "207호"));
		dept.add(new Department(925, "전자공학과", "308호"));
		
	}
	public void initStudent() {
		stu.add(new Student("1292001", "900424-1825409", "김광식", 3, "서울", 920));
		stu.add(new Student("1292002", "900305-1730021", "김정현", 3, "서울", 920));
		stu.add(new Student("1292003", "891021-2308302", "김현정", 4, "대전", 920));
		stu.add(new Student("1292301", "890902-2704012", "김현정", 2, "대구", 923));
		stu.add(new Student("1292303", "910715-1524390", "박광수", 3, "광주", 923));
		stu.add(new Student("1292305", "921011-1809003", "김우주", 4, "부산", 923));
		stu.add(new Student("1292501", "900825-1506390", "박철수", 3, "대전", 925));
		stu.add(new Student("1292502", "911011-1809003", "백태성", 3, "서울", 925));
	}
	public void initTake() {
		take.add(new Takes("1292001", "C101-01", "B+"));
		take.add(new Takes("1292001", "C103-01", "A+"));
		take.add(new Takes("1292001", "C301-01", "A"));
		take.add(new Takes("1292002", "C102-01", "A"));
		take.add(new Takes("1292002", "C103-01", "B+"));
		take.add(new Takes("1292002", "C502-01", "C+"));
		take.add(new Takes("1292003", "C103-02", "B"));
		take.add(new Takes("1292003", "C501-02", "A+"));
		take.add(new Takes("1292301", "C102-01", "C+"));
		take.add(new Takes("1292303", "C102-01", "C"));
		take.add(new Takes("1292303", "C103-02", "B+"));
		take.add(new Takes("1292303", "C501-01", "A+"));
	}
}
