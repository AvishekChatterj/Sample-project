package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class SampleFilter
 */
@WebFilter("/SampleFilter")
public class SampleFilter implements Filter {

    /**
     * Default constructor. 
     */
    public SampleFilter() {
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
		// TODO Auto-generated method stub
		// place your code here
		PrintWriter printWriter=response.getWriter();
		String password=request.getParameter("password");
		if(password.equals("abc"))
		{
			chain.doFilter(request, response);// sends the request to the next resource
		}
		else
		{
			printWriter.println("Enter the password correctly");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
		// pass the request along the filter chain;
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
