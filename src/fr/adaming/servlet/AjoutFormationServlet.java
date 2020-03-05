package fr.adaming.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * Servlet implementation class AjoutFormationServlet
 */
@WebServlet("/ajoutformation")
public class AjoutFormationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutFormationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<Lieu> list = new ArrayList<Lieu>();
		ILieuDao dao = new LieuDao();
		list=dao.getLieux();
		request.setAttribute("lieux", list);
		this.getServletContext().getRequestDispatcher("/WEB-INF/vues/enregistrement.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Formation forma = new Formation();
		forma.setTheme(request.getParameter("theme"));
		IFormationDao dao= new FormationDao();
		dao.saveNewFormation(forma);
		
		this.getServletContext().getRequestDispatcher("/listes").forward(request, response);
		
		
	}

}
