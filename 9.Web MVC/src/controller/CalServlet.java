package controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.CalService;
import vo.CalVO;

/**
 * Servlet implementation class CalServlet
 */
@WebServlet("/doCal")
public class CalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		
		try { 			  
			  String op1 = (String)request.getParameter("op1"); //1.�� ����
			  String op = (String)request.getParameter("op"); //1.�� ����
			  String op2 = (String)request.getParameter("op2"); //1.�� ����			 
			  
			  CalVO vo = new CalVO(op1, op, op2);
			  
			  if(op.equals("add") || op.equals("sub") || op.equals("mul") || op.equals("div") ) { //3.�� ����
				CalService cs = new CalService(); 
				cs.doCal(vo); //4.���� ȣ��
			  }
		      RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp"); //5.�� ����
              request.setAttribute("vo", vo);
		      dispatcher.forward(request,response);			  
          } catch(Exception e) { //6.���� ó��
        	  response.getWriter().append("Served at: ").append(e.getMessage());
          }		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
