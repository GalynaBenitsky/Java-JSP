package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Hospital Management System</title>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"  media=\"all\" />\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Ropa+Sans' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.3/semantic.min.css\">\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/responsiveslides.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            $(function () {\n");
      out.write("\n");
      out.write("                // Slideshow 1\n");
      out.write("                $(\"#slider1\").responsiveSlides({\n");
      out.write("                    maxwidth: 1600,\n");
      out.write("                    speed: 600\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            p.sansserif {\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("            .Box-body:last-of-type {\n");
      out.write("                border-style:solid;\n");
      out.write("                border-color:black;\n");
      out.write("                border-bottom-left-radius: 2px;\n");
      out.write("                border-bottom-right-radius: 2px;\n");
      out.write("                margin-bottom: -1px;\n");
      out.write("                border-width:1px;\n");
      out.write("            }\n");
      out.write("            .markdown-body {\n");
      out.write("                font-family: -apple-system,BlinkMacSystemFont,Segoe UI,Helvetica,Arial,sans-serif,Apple Color Emoji,Segoe UI Emoji,Segoe UI Symbol;\n");
      out.write("                font-size: 16px;\n");
      out.write("                line-height: 1.5;\n");
      out.write("                word-wrap: break-word;\n");
      out.write("            }\n");
      out.write("            .div1 {\n");
      out.write("                width:940px;\n");
      out.write("                height:130px;\n");
      out.write("                border-radius:10px;\n");
      out.write("                border-style:outset;\n");
      out.write("                Background-color: white;\n");
      out.write("                border-color:black;\n");
      out.write("                border-width:5px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .p-6 {\n");
      out.write("                padding: 40px!important;\n");
      out.write("            }\n");
      out.write("            footer {\n");
      out.write("                position: relative;\n");
      out.write("                height: 90px;\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: #47BB8F;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            p.copyright {\n");
      out.write("                position: absolute;\n");
      out.write("                width: 100%;\n");
      out.write("                color: #fff;\n");
      out.write("                line-height: 60px;\n");
      out.write("                font-size: 1em;\n");
      out.write("                text-align: center;\n");
      out.write("                bottom:0;\n");
      out.write("            }\t  </style>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        <div class=\"ui container first\">\n");
      out.write("            <div class=\"ui center aligned teal inverted segment\">\n");
      out.write("                <font color=\"black\"><h1 class=\"header\" id=\"nam\">Hospital DBMS</h1></font>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clear\"> </div>\n");
      out.write("            <!--start-image-slider---->\n");
      out.write("            <div class=\"image-slider\">\n");
      out.write("                <!-- Slideshow 1 -->\n");
      out.write("                <ul class=\"rslides\" id=\"slider1\">\n");
      out.write("                    <li><img src=\"images/doctors.jpg\" alt=\"\"></li>\n");
      out.write("                  \n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!--End-image-slider---->\n");
      out.write("            <div class=\"clear\"> </div>\n");
      out.write("            <div class=\"ui  horizontal segments\">\n");
      out.write("                <div class=\"ui  teal inverted segment\">\n");
      out.write("                    <div class=\"admin\">\n");
      out.write("                        <div class=\"ui icon\">\n");
      out.write("                            <i class=\" large user  icon\"></i>Admin login\n");
      out.write("                            <a href=\"admin-login.jsp\">\n");
      out.write("                                <button  class=\"ui blue button\">LOGIN</button>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("                <div class=\"doctor\">\n");
      out.write("                    <div class=\"ui teal inverted segment\">\n");
      out.write("                        <div class=\"ui icon\">\n");
      out.write("                            <i class=\"ui large user md icon\"></i>Doctor login\n");
      out.write("                            <a href=\"Doclogin.jsp\">\n");
      out.write("                                <button class=\"ui blue button\"> LOGIN</button>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>   \n");
      out.write("                <div class=\"ui  right aligned teal inverted segment\">   \n");
      out.write("                    <div class=\"user\">\n");
      out.write("                        <div class=\"ui icon\">\n");
      out.write("                            <i class=\"ui  large users icon\"></i>User \n");
      out.write("                            <a href=\"plogin.jsp\">\n");
      out.write("                                <button class=\"ui blue button\">LOGIN</button>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>  \n");
      out.write("            </div>   \n");
      out.write("\n");
      out.write("            <div class=\"Box-body p-6\">\n");
      out.write("                <article class=\"markdown-body entry-content\" itemprop=\"text\"><h1>Hospital Management System</h1>\n");
      out.write("                   \n");
      out.write("                </article>\n");
      out.write("            </div>\n");
      out.write("            <br><br><footer>\n");
      out.write("                <p class=\"copyright\"> .& Galyna Matsygin.</p>\n");
      out.write("            </footer>\n");
      out.write("        </div>   \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
