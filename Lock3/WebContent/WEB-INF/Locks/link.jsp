<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<p>Are you sure you want to delete</p>
<a href="dellock.htm?lockSno=${requestScope.lock.lockSno}">Yes</a>
<a href="view.htm?lockSno=${lock.lockSno}">No</a>