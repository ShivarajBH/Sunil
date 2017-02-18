package com.cis.ui.controllers.lock;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.cis.service.LockService;
//import com.cis.service.MachineService;
import com.cis.service.beans.LockBean;
//import com.cis.service.beans.MachineBean;
public class LockListController implements Controller{
	private LockService lockService;


	public void setLockService(LockService lockService) {
		this.lockService = lockService;
	}



	@Override
	public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Lock");
		List<LockBean> locks=lockService.getAllLocks();
		
		request.setAttribute("locks",locks);
		
		return new ModelAndView("WEB-INF/Locks/locklist");
		
	}
}
