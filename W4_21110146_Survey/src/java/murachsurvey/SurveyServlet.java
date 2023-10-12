package murachsurvey;

import java.io.*;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;

import murachbusiness.User;


public class SurveyServlet extends HttpServlet  
{

    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException 
    {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String url = "/index.html";

        // get current action
        String action = request.getParameter("action");

        if (action == null) {
            action = "join";  // default action
        }
     
 // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/index.html";    // the "join" page
        }
        else if (action.equals("add")) {                
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String dob = request.getParameter("date");
            String hear = request.getParameter("hear");
            
        if (hear == null){
            hear = "NA";
        }
        
        String select = request.getParameter("yes1");
        String select2 = request.getParameter("yes2");
        String rselect = "";

        if ("y1".equals(select)) {
            rselect = "I'd like";
        }

        if ("y2".equals(select2)) {
            if (!rselect.isEmpty()) 
            {
                rselect +=  " AND " + "I accept";
            }
            else
            rselect +=  "I accept";
        } 
        
        if (rselect.isEmpty())
            rselect = "I dont accept";
        
            String contact = request.getParameter("contactlist");
            
            // store data in User object and save User object in db
            User user = new User(firstName, lastName, email, dob, hear, rselect, contact);

            
            // set User object in request object and set URL
            request.setAttribute("U", user);
            url = "/thanks.jsp";   // the "thanks" page
        }
        
        System.out.println(action);
        // forward request and response objects to specified URL
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
        
     
    }    
  @Override
    protected void doGet(HttpServletRequest request, 
                         HttpServletResponse response) 
                         throws ServletException, IOException {
        doPost(request, response);
    }    
}