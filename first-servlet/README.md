**My First Servlet**

Create a new Dynamic Web Project

Create a servlet and implement the interface Servlet.

Add the <servlet> and <servlet-mapping> in web.xml.

Run the servlet on a Tomcat Server as below

http://localhost:{port}/{project-name}/{url-pattern}

First when Tomcat is started it may give 404 error as index.html is missing.

Instead of specifying the url-pattern in web.xml it can be done in @WebServlet annotation on the class.

Important code to remember:

	 <servlet>
		<servlet-name>first</servlet-name>
		<servlet-class>com.servlet.FirstServlet</servlet-class>
	</servlet>

	<servlet-mapping>
		<servlet-name>first</servlet-name>
		<url-pattern>/welcome</url-pattern>
	</servlet-mapping>