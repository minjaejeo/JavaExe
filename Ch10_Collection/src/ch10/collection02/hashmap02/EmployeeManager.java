package ch10.collection02.hashmap02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeManager {
//	private final int EMP_NUM = 100; 	// 100명 사원이 최대
	// Employee의 자식객체들을 저장
	private Map<String, Employee> empMap = new HashMap<>();
//	private int numOfEmp = 0;	// 저장된 사원객체 수, 다음 사원이 저장될 index
	private Scanner sc = new Scanner(System.in);
	
	private int viewMenu() {
		System.out.println("[ 사원 선택 ]");
		System.out.println("1. 정규직");
		System.out.println("2. 임시직");
		System.out.println("3. 일용직");
		System.out.println("4. 전체정보보기");
		System.out.println("5. 정규직 보기");
		System.out.println("6. 임시직 보기");
		System.out.println("7. 일용직 보기");
		System.out.println("8. 종료");
		System.out.println("번호 입력 >> ");
		int sel = sc.nextInt();
		return sel;
	}
	private RegularEmployee createRegularEmployee() {
		System.out.println("사번 >> ");
		String empno = sc.next();
		System.out.println("이름 >> ");
		String name = sc.next();
		System.out.println("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.println("보너스 >> ");
		int bonus = sc.nextInt();
		RegularEmployee emp = 
				new RegularEmployee( empno,  name,
						 yearSalary,  bonus);
		return emp;
		
		
	}
	private TempEmployee createTempEmployee() {
		System.out.println("사번 >> ");
		String empno = sc.next();
		System.out.println("이름 >> ");
		String name = sc.next();
		System.out.println("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.println("계약기간 >> ");
		int hireYear = sc.nextInt();
		TempEmployee emp = 
				new TempEmployee( empno,  name,
						 yearSalary,  hireYear);
		return emp;
	}
	private PartTimeEmployee createPartTimeEmployee() {
		System.out.println("사번 >> ");
		String empno = sc.next();
		System.out.println("이름 >> ");
		String name = sc.next();
		System.out.println("일당 >> ");
		int dailyPay = sc.nextInt();
		System.out.println("일한 일수 >> ");
		int workDay = sc.nextInt();
		PartTimeEmployee emp = 
				new PartTimeEmployee( empno,  name,
						 dailyPay,  workDay);
		return emp;
	}
	private boolean saveEmployee(Employee emp) {
		empMap.put(emp.empno, emp);
		return true;
	}
	private void viewAllEmployeeInfo(){
		for(Employee emp : empMap.values()) {
			emp.showEmployeeInfo();
		}

	}
	private void viewRegEmployeeInfo() {
		for(Employee emp : empMap.values()) {
			if(emp instanceof RegularEmployee)
				emp.showEmployeeInfo();
		}
	}
	private void viewTempEmployeeInfo() {
		for(Employee emp : empMap.values()) {
			if(emp instanceof TempEmployee)
				emp.showEmployeeInfo();
		}
	}
	private void viewPartTimeEmployeeInfo() {
		for(Employee emp : empMap.values()) {
			if(emp instanceof PartTimeEmployee)
				emp.showEmployeeInfo();
		}
	}
	
	public void run() {
		boolean isRun = true;
		while(isRun) {
			int selNum = viewMenu();
			Employee emp = null;
			
			switch(selNum) {
			case EmpMenu.REG_EMP:
				emp = createRegularEmployee();
				break;
			case EmpMenu.TEMP_EMP:
				emp = createTempEmployee();
				break;
			case EmpMenu.PART_EMP:
				emp = createPartTimeEmployee();
				break;
			case EmpMenu.ALL_INFO:
//				emp = null;
				viewAllEmployeeInfo();
				break;
			case EmpMenu.REG_INFO:
//				emp = null;
				viewRegEmployeeInfo();
				break;
			case EmpMenu.TEMP_INFO:
//				emp = null;
				viewTempEmployeeInfo();
				break;
			case EmpMenu.PART_INFO:
//				emp = null;
				viewPartTimeEmployeeInfo();
				break;
			case EmpMenu.EXIT:
//				emp = null;
				isRun = false;
				break;
			default:
//				emp = null;
				System.out.println("해당 항목이 존재하지 않습니다.");
				break;
				
			}
			// emp객체가 존재한다면
			if(emp != null) {
				boolean isSave = saveEmployee(emp);
				if(!isSave)
					System.out.println("더 이상 저장 공간이 없습니다.");
			}
		}
		System.out.println("Program Exit...");
	}

}
