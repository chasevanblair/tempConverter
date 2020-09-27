package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Convert;

/**
 * Servlet implementation class conversion
 */
@WebServlet("/conversion")
public class convertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public convertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String startType = request.getParameter("type").toString();

		String value = request.getParameter("tempValue").toString();

		Convert convert = new Convert(startType, value);


		
		
		request.setAttribute("converted", convert);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
	
		 
		
	}

}
