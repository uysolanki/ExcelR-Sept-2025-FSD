package day14;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class StreamingAPIDemo4 {

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
		
		//it dept object employees
		employees.stream()
		.filter(emp->emp.getDepartment().equalsIgnoreCase("it"))
		.forEach(emp->System.out.println(emp));
		
		//it dept employee names
				employees.stream()
				.filter(emp->emp.getDepartment().equalsIgnoreCase("it"))
				.map(emp->emp.getName())
				.forEach(emp->System.out.println(emp));
		System.out.println("****");		
		//it dept employee names
				employees.stream()    //12
				.filter(StreamingAPIDemo4::checkEmployeeBelongsToITDept)  //4
				.map(emp->emp.getName()) //4
				.map(String::toUpperCase)
				.forEach(emp->System.out.println(emp));
		System.out.println("****");				
		//name of empl earning > 2000
	}

	public static boolean checkEmployeeBelongsToITDept(Employee emp)
	{
		if(emp.getDepartment().equalsIgnoreCase("it"))
			return true;
		else
			return false;
	}
}
