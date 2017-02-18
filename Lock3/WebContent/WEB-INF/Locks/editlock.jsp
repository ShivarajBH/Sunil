<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<form:form commandName="editlock" method="post" action="editlock.htm">
	
	<h3>Edit Lock Details</h3>
	
	
	<table>
		<tr>
			<td>Lock Price:  </td>
			<td><form:input path="lockPrice"/></td>
		</tr>
		<tr>
			<td>Lock Model :  </td>
			<td><form:select path="lockModel">
			         <form:option value="">Select</form:option>
                    <form:option value="knablock">knab lock</form:option>
                   <form:option value="leverhandle">lever handle</form:option>
                   <form:option value="deadbolt">dead bolt</form:option>
                    <form:option value="keylessentry">keyless entry</form:option>
                    </form:select>
                </td>
	    </tr> 
	    <tr> 
	          <td>Lock Color:</td>
              <td><form:input path="lockColor"/></td>
	    </tr>
	    
	        <tr> 
	          <td>Lock Kind:</td>
              <td><form:input path="lockKind"/></td>
	    </tr>
	    
	        <tr> 
	          <td>Lock Size:</td>
               <td><form:select path="lockKind">
			         <form:option value="">Select</form:option>
                    <form:option value="single">Single</form:option>
                   <form:option value="double">lever Double</form:option>
                   <form:option value="multiLevel">Multi Level</form:option>
                   </form:select>
	    </tr>
	    
	        <tr> 
	          <td>height:</td>
              <td><form:input path="height"/></td>
	    </tr>
	    
	      <tr> 
	          <td>width:</td>
              <td><form:input path="width"/></td>
	    </tr>
	    
	        <tr> 
	          <td>depth:</td>
              <td><form:input path="depth"/></td>
	    </tr>
	    
	     <tr> 
	          <td>weight:</td>
              <td><form:input path="weight"/></td>
	    </tr>
	    
	       <tr> 
	          <td>wareHouse:</td>
              <td><form:select path="wareHouse">
			         <form:option value="">Select</form:option>
                    <form:option value="Indranagar">Indranagar</form:option>
                   <form:option value="SilkBoard">SilkBoard</form:option>
                   <form:option value="Vijaynagar">Vijaynagar </form:option>
                   </form:select>
	    </tr>
	    
	    
	         
	       
	
	<tr>
		<form:hidden path="lockSno"/>
			<td colspan="2"><input type="submit" value="Update"/></td>
		
		</table>
	</form:form>
</body>
</html>