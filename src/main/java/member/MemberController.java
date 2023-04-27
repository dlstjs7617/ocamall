package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register/*")
public class MemberController extends HttpServlet {
	MemberDAO memberDAO;
	public void init(ServletConfig config) throws ServletException {
		memberDAO = new MemberDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      request.setCharacterEncoding("utf-8");
	      response.setContentType("text/html;charset=utf-8");
	      String nextPage = null;
	      String action = request.getPathInfo();   // URL 요청명을 가져온다.
	      System.out.println("요청매핑이름 : " + action);
	      if (action == null || action.equals("/register.do")) {
	         //List<MemberVO> memberList = memberDAO.listMembers();
	         //request.setAttribute("memberList", memberList);   // 회원정보 바인딩
	         nextPage = "/html/register.jsp";
	      }else if(action.equals("/register.do")) {
	         nextPage = "/html/register.jsp";
	      }else if(action.equals("/addMember.do")) {
	    	  String email = request.getParameter("email");
	    	  String pwd = request.getParameter("pwd");
	    	  int postcode = Integer.parseInt(request.getParameter("postcode"));
	    	  String address = request.getParameter("address");
	    	  String detailAddress = request.getParameter("detailAddress");
	    	  int phone1 = Integer.parseInt(request.getParameter("phone1"));
	    	  int phone2 = Integer.parseInt(request.getParameter("phone2"));
	    	  int phone3 = Integer.parseInt(request.getParameter("phone3"));
	    	  String name = request.getParameter("name");
	         MemberVO memberVO = new MemberVO(email, pwd, postcode, address, detailAddress, phone1, phone2, phone3, name);
	         memberDAO.addMember(memberVO);
	         request.setAttribute("msg", "addMember");
	         nextPage = "html/register_confirm.jsp";
	      }
	      RequestDispatcher dispatcher = request.getRequestDispatcher(nextPage);
	      dispatcher.forward(request, response);      // 컨트롤러에서 화면출력하는 listMembers.jsp로 포워딩 -> nextPage로 포워딩
	   }
}