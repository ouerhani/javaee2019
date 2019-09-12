package Servlets;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class SerlvletListner
 *
 */
@WebListener
public class SerlvletListner implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public SerlvletListner() {
    	
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println(" ---------------- Listner : Context destroyed -------------");    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         System.out.println(" ---------------- Listner : Context created -------------");
    }
	
}
