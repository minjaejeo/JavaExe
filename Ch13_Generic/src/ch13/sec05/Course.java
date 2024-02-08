package ch13.sec05;

public class Course {
	// 모든 사람이면 등록 가능
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + 
				"이(가) Course1을 등록함");
	}
	// 학생만 등록 가능(Student이거나 Student 자식만 올 수 있다.)
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + 
				"이(가) Course2를 등록함");
	}
	// 직장인 및 일반인만 등록 가능(Worker거나 Worker의 자식만 올 수 있다.)
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+
				"이(가) Course3을 등록함");
	}
}
