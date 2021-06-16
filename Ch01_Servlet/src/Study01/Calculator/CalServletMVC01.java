package Study01.Calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalServletMVC01
 */
@WebServlet("/calservletmvc01")
public class CalServletMVC01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
											//Client에서 요청받음			//Client에 요청함
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1, num2;
		int result;
		String operator;
		
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter p = response.getWriter();
		
		num1 = Integer.parseInt(request.getParameter("num1")); 
	    num2 = Integer.parseInt(request.getParameter("num2")); 
		operator = request.getParameter("operator");
		
		result = calc(num1, num2,operator);
		
		p.println("<html><head><title>계산기MVC01</title></head><body><h2>계산결과</h2><hr>");
		p.println(num1+operator+num2+ " = " + result);
		p.println("</body></html>");
		
		
		
	}
	
	public int calc(int num1, int num2, String operator) {
			int result=0;
		if(operator.contentEquals("+")) {
			result = num1 + num2;
		}else if(operator.contentEquals("-")) {
			result = num1 - num2;
		}else if(operator.contentEquals("*")) {
			result = num1 * num2;
		}else if(operator.contentEquals("/")) {
			result = num1 / num2;
		}
		
		
		
		return result;
		
		
		
	}
	
	
	
	

}
