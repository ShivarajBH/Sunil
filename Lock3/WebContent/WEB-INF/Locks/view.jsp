<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

	<h3>Lock Details</h3>
	<table border=1 width=50% height=50%>
		<tr>
		<td>Lock Price:</td>
		<td>${requestScope.lock.lockPrice}</td>
		</tr>
		<tr>
		<td>Lock Model:</td>
		<td>${requestScope.lock.lockModel}</td>
		</tr>
		<tr>
		<td>Lock Color:</td>
		<td>${requestScope.lock.lockColor}</td>
		</tr>
		
		<tr>
		<td>Lock Kind:</td>
		<td>${requestScope.lock.lockKind}</td>
		</tr>
		<tr>
		<td>Lock Size:</td>
		<td>${requestScope.lock.lockSize}</td>
		</tr>
		
		<tr>
		<td>height:</td>
		<td>${requestScope.lock.height}</td>
		</tr>
		<tr>
		
		
		<tr>
		<td>width:</td>
		<td>${requestScope.lock.width}</td>
		</tr>
		<tr>
		<td>depth:</td>
		<td>${requestScope.lock.depth }</td>
		</tr>
		
		<tr>
		<td>weight:</td>
		<td>${requestScope.lock.weight }</td>
		</tr>
		
		<tr>
		<td>wareHouse:</td>
		<td>${requestScope.lock.wareHouse}</td>
		</tr>
		
		
		<tr>
			<td colspan="2">
				<a href="editlock.htm?lockSno=${requestScope.lock.lockSno}">Edit</a>
				<%-- <a href="dellock.htm?lockSno=${requestScope.lock.lockSno}">Delete</a> --%>
				 <a href="dellock.htm?lockSno=${requestScope.lock.lockSno}" onclick="return confirm('Are you sure you want to Remove?');">Delete</a>
			</td>
		</tr>
	</table>
 