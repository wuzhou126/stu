package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojo.Persion;
import service.PersionService;
import service.UserService;

/**
 * Servlet implementation class PersionServlet
 */
@WebServlet("/PersionServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	PersionService persionService = new PersionService();
	UserService userService = new UserService();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Persion> list = persionService.selectAllPersion();
		//List<User> list = userService.selectAllUser();
		for (Persion p : list) {
			System.out.println(p.getName() + "  " + p.getAge());
		}
	}
}
