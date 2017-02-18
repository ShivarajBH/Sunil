<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
 <script type ="text/javascript">
function validate(formObj){
var valid= true;
if(formObj.lockId.value==""){

valid=false;
alert("Please Enter Lock Barcode");

}
return valid;

}

</script> 


</head>

<body>


<form:form commandName="addLock" method="post" onsubmit="return validate(this);"> 
<h3>Add Lock Details:<h3>

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
              <td><form:select path="lockKind">
			         <form:option value="">Select</form:option>
                    <form:option value="single">Single</form:option>
                   <form:option value="double">lever Double</form:option>
                   <form:option value="multiLevel">Multi Level</form:option>
                   </form:select>
	    </tr>
	    
	        <tr> 
	          <td>Lock Size:</td>
              <td><form:hidden path="lockSize"/></td>
	    </tr>
	    
	        <tr> 
	          <td>height:</td>
              <td><form:input path="height"/></td>
	     
	          <td>width:</td>
              <td><form:input path="width"/></td>
	    </tr>
	         
	    
	        <tr> 
	          <td>depth:</td>
              <td><form:input path="depth"/></td>
	   
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
			<td colspan="2"><input type="submit" value="Submit"/></td>
		</tr>
	   </table>
 </form:form> 
</body>

</html>	
