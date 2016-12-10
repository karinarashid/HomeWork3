package Encapsulation;

public class EmployeeDatabase {

	public static void main(String[] args) {
	
		employeeFromTriStar em1 = new employeeFromTriStar();
		em1.setEmployeeName("Karina Rashid");
		em1.setHighestPaidEmployee(84000);
		
		System.out.println(em1.getEmployeeName()+ " " + em1.getHighestPaidEmployee());

		//Exception 
		int number = 84000;
		try {
			int result = number/12;
			System.out.println(result);	
		}catch(Exception ex){
			System.out.println("you can divide 12 to get monthly salary");

			
		}
		}

}

