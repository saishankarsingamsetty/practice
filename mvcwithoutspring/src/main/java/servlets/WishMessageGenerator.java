package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class WishMessageGenerator extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String url = req.getRequestURI();
		
		if(url.equalsIgnoreCase("gm"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("/gm");
			rd.forward(req, res);
		}
		else if(url.equalsIgnoreCase("ge"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("/ge");
			rd.forward(req, res);
		}
		else {
			RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
			rd.forward(req, res);
		}
		
		
	}
}
