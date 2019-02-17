package controller;

import java.util.List;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Employee;
import service.EmployeeServiceIml;

@WebServlet("/employeeController")
public class EmployeeController extends HttpServlet{
	
	private final EmployeeServiceIml employeeService=new EmployeeServiceIml();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String surname=req.getParameter("surname");
		int salary=Integer.parseInt(req.getParameter("salary"));
		
		Employee employee=new Employee();
		employee.setName(name);
		employee.setSurname(surname);
		employee.setSalary(salary);
		
		employeeService.saveEmployee(employee);
		
		dispatch(req, resp);
	  
	}
	
	private void dispatch(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException  {
         List<Employee> employeeList=employeeService.findAllEmployees();
		
		req.setAttribute("allEmployees", employeeList);
		
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("employee.jsp");
		requestDispatcher.forward(req, resp);
	
	}
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int remove_id=Integer.parseInt(req.getParameter("employeeId"));
		employeeService.removeEmployee(remove_id);
		
		dispatch(req, resp);

}
}
