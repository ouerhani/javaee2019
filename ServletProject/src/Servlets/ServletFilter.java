package Servlets;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class ServletFilter
 */
//@WebFilter(urlPatterns = { "/*" }, servletNames = { "MyServlet" })

@WebFilter(urlPatterns = { "/*" })
public class ServletFilter implements Filter {

    /**
     * Default constructor. 
     */
    public ServletFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		// pass the request along the filter chain
		
		System.out.println("--------------------");
		System.out.println("----------   Filter called ----------");
		System.out.println("--------------------");

		
		//add a request attribute that will be available in the request object in the mapped servlets
		request.setAttribute("Filter attribute 1", "set in the filter code1");
		request.setAttribute("Filter attribute 2", "set in the filter code2");

			
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
