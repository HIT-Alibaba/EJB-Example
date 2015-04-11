<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.skyline.ejbconvert.IConvert, javax.naming.*, java.util.Properties" %>

<html doctype="html">
  <head>
    <title></title>
  </head>
  <body>

  <%
    Properties props = new Properties();
    props.setProperty("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
    props.setProperty("java.naming.provider.url", "localhost:1099");
    try {
      InitialContext ctx = new InitialContext(props);
      IConvert c = (IConvert)ctx.lookup("ConvertBean/remote");
      out.print("<p>" + c.dollarToYuan(89) + "</p>");
      out.print("<p>" + c.yuanToEuro(89) + "</p>");
    } catch (NamingException e) {
      out.println(e.getMessage());
    }
  %>
  </body>
</html>