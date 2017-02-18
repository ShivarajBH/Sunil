<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	<h3>Lock Details:</h3>
	<a href="insertlock.htm">New lock</a><br /><br/>
	<table border=1 width=50% height=50%>
	
		<tr>
			<td>
			Lock Price
			</td>
			<td>
			Lock Model
			</td>
			<td>
				Lock Color
			</td>
			
			<td>
			Lock Kind
			</td>
		
			<td>
				height
			</td>
			
			<td>
				width
			</td>
			<td>
				depth
			</td>
			<td>
			weight
			</td>
			
			
			<td>
				wareHouse
			</td>
			
		</tr>
		
		<c:forEach items="${requestScope.locks}" var="lock">
			<tr>
				<td>
					<c:out value="${lock.lockPrice}"/>
				</td>
				<td>
					<c:out value="${lock.lockModel}"/>
				</td>
				<td>
					<c:out value="${lock.lockColor}"/>
				</td>
				
				
				<td>
					<c:out value="${lock.lockKind}"/>
				</td>
				<td>
					<c:out value="${lock.lockSize}"/>
				</td>
				<td>
					<c:out value="${lock.height}"/>
					</td>
				
				
					<td>
					<c:out value="${lock.depth}"/>
					</td>
					
					<td>
					<c:out value="${lock.weight}"/>
					<td>
				
					<c:out value="${lock.wareHouse}"/>
				</td>
		
				
				<td>
				<a href="view.htm?lockSno=${lock.lockSno}">View</a> 
				 
				</td>
			</tr>
		</c:forEach>
	</table>

