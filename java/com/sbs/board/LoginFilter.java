package com.sbs.board;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
//		HttpServletRequest request = (HttpServletRequest)req;
//		HttpServletResponse response = (HttpServletResponse)res;
//		HttpSession session = request.getSession();
//		
//		String qstring = request.getQueryString();
//		
//		System.out.println(qstring);
////		
//		if(qstring != null && qstring.equals("action=showAdd")) {
//			if(session.getAttribute("loginedMember") == null) {
//				response.sendRedirect("/TestServlet?action=showLogin");
//				return;
//			} 
//		}
		chain.doFilter(req, res);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}