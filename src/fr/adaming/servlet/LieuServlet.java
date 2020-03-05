package fr.adaming.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.FormationDao;
import dao.IFormationDao;
import dao.ILieuDao;
import dao.LieuDao;
import fr.adaming.model.Formation;
import fr.adaming.model.Lieu;

/**
 * Servlet implementation class Lieu
 */
@WebServlet("/newlieu")
public class LieuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LieuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/vues/newlieu.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Lieu li = new Lieu();
		li.setVille(request.getParameter("ville"));
		li.setAdresse(request.getParameter("adress"));
		ILieuDao dao= new LieuDao();
		dao.createLieu(li);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/vues/newlieu.jsp").forward(request, response);
	}

}
