package com.cis.ui.controllers.lock;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import com.cis.dao.LockDAO;
public class DeleteLockController implements Controller{
	 private LockDAO lockDAO;
	 public LockDAO getLockDAO() {
		return lockDAO;
	}
	public void setLockDAO(LockDAO lockDAO) {
		this.lockDAO = lockDAO;
	}
	@Override
	 public ModelAndView handleRequest(HttpServletRequest request,
	 		HttpServletResponse response) throws Exception {
	 	// TODO Auto-generated method stub
	 	String lockSno=request.getParameter("lockSno");
	  // System.out.println(machineNo);
	 	lockDAO.deleteLock(new Integer(lockSno));
	 	return new ModelAndView("redirect:locklist.htm");
	 }


}
