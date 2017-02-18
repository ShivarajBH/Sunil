package com.cis.ui.controllers.lock;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;



//import com.cis.service.AgencyService;
import com.cis.service.LockService;

//import com.cis.service.beans.AgencyBean;
import com.cis.service.beans.LockBean;

public class LockViewController implements Controller{
	private LockService lockService;


	public void setLockService(LockService lockService) {
		this.lockService = lockService;
	}



		public ModelAndView handleRequest(HttpServletRequest request,
				HttpServletResponse response) throws Exception {
			// TODO Auto-generated method stub
			LockBean locks=lockService.getLock(new Integer(request.getParameter("lockSno")));
			System.out.println("return controller");
			
			request.setAttribute("lock", locks);
			
			return new ModelAndView("WEB-INF/Locks/view");
		}

}
