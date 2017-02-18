package com.cis.ui.controllers.lock;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.cis.service.LockService;

import com.cis.service.beans.LockBean;

public class EditLockFormController extends SimpleFormController{
	
	private LockService lockService;
	public void setLockService(LockService lockService) 
	
	{
	
		this.lockService = lockService;
   }

public ModelAndView onSubmit(HttpServletRequest request,HttpServletResponse response,Object command,BindException e)throws Exception
{
	System.out.println("post");
	
	LockForm lockForm=(LockForm)command;
	LockBean lockBean=new LockBean();
	lockBean.setLockSno(lockForm.getLockSno());
	lockBean.setLockPrice(lockForm.getLockPrice());
	lockBean.setLockModel(lockForm.getLockModel());
	lockBean.setLockColor(lockForm.getLockColor());
	lockBean.setLockKind(lockForm.getLockKind());
	lockBean.setLockSize(lockForm.getLockSize());
	lockBean.setHeight(lockForm.getHeight());
	
	lockBean.setWidth(lockForm.getWidth());
	lockBean.setWeight(lockForm.getWeight());
	lockBean.setDepth(lockForm.getDepth());
	lockBean.setWareHouse(lockForm.getWareHouse());
	
	
	lockService.modifyLock(lockBean);
	
	return new ModelAndView("redirect:locklist.htm");
}

public Object formBackingObject(HttpServletRequest request)throws Exception
{
	String lockSno=request.getParameter("lockSno");
	LockBean lockBean=lockService.getLock(new Integer(lockSno));
	LockForm lockForm=new LockForm();
	lockForm.setLockSno(lockBean.getLockSno());
	lockForm.setLockPrice(lockBean.getLockPrice());
	lockForm.setLockModel(lockBean.getLockModel());
	lockForm.setLockColor(lockBean.getLockColor());
	lockForm.setLockKind(lockBean.getLockKind());
	lockForm.setLockSize(lockBean.getLockSize());
	lockForm.setHeight(lockBean.getHeight());
	lockForm.setWidth(lockBean.getWidth());
	lockForm.setWeight(lockBean.getWeight());
	lockForm.setDepth(lockBean.getDepth());
	lockForm.setWareHouse(lockBean.getWareHouse());


	return lockForm;
	
}


}
