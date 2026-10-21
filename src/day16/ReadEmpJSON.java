package day16;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ReadEmpJSON {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		List<Employee> employees=null;
        try {
            employees = mapper.readValue(
            	//new File("D:\\EclipseJavaprogs2\\Test\\json\\employee.json"),	   //absolute path
                new File("data/employee.json"),									  //relative path
                new TypeReference<List<Employee>>() {}
            );
            
        

       
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		for(Employee emp:employees)
		System.out.println(emp);
		
		//display dept wise count of emps
		Map<String,Long> countOfEmployeesDeptWise=employees.stream()
		.collect(Collectors.groupingBy(emp->emp.getDepartment(),Collectors.counting()));
		System.out.println(countOfEmployeesDeptWise);
		
		//display dept name with max employees
		String deptWithMaxEmployees=countOfEmployeesDeptWise.entrySet().stream()
		.max(Map.Entry.comparingByValue())   //IT=5  => IT
		.map(Map.Entry::getKey)
		.orElse(null);
		
		System.out.println(deptWithMaxEmployees + " dept, has maximum employees");
		
		
		
		
				//display dept name with max employees
				String deptWithMaxEmployees1=employees
						.stream()
						.collect(Collectors.groupingBy(emp->emp.getDepartment(),Collectors.counting()))
						.entrySet()
						.stream()
						.max(Map.Entry.comparingByValue())   //IT=5  => IT
						.map(Map.Entry::getKey)
						.orElse(null);
				
				System.out.println(deptWithMaxEmployees1 + " dept, has maximum employees");
		
		
				//display year of joining wise with count of employees
				employees.stream()
				.collect(Collectors.groupingBy(Employee::getJoiningYear,Collectors.counting()))
				.entrySet()
				.stream()
				.sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
				.forEach(entry->System.out.println(entry.getKey() +"," +entry.getValue()));
				
				
				
				
				//display year in which max employees joined 
				Map.Entry<Integer, Long> hashmap=employees.stream()
				.collect(Collectors.groupingBy(Employee::getJoiningYear,Collectors.counting()))
				.entrySet()
				.stream()
				.sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
				.findFirst()
				.orElse(null);
				
				System.out.println("maximum number of employees joined in the year "+hashmap.getKey());
			
				
				
				
		

	}

}
