package structural.composite;

public class Main {

	public static void main(String[] args) {
		Employee CEO = new Employee("Caner", "Borekci", 1000);
		Employee headOfSoftware = new Employee("Ulas", "Atlý", 500);
		Employee headOfSales = new Employee("Ali", "Gumusoglu", 500);
		
		Employee softwareDev1 = new Employee("ibo", "caner", 200);
		Employee softwareDev2 = new Employee("emir", "dogrucu", 200);
		
		
		CEO.add(headOfSoftware);
		CEO.add(headOfSales);
		
		headOfSoftware.add(softwareDev1);
		headOfSoftware.add(softwareDev2);
		
		
		System.out.println(CEO.toString());
		for(Employee heads : CEO.subordinates){
			System.out.println(heads.toString());
			for(Employee employee : heads.subordinates) {
				System.out.println(employee.toString());
				
			}
		}


	}

}
