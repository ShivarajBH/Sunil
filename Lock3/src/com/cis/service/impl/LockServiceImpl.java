package com.cis.service.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import com.cis.dao.LockDAO;
import com.cis.dao.model.Lock;
//import com.cis.dao.model.Machine;
import com.cis.service.LockService;
import com.cis.service.beans.LockBean;
//import com.itextpdf.text.log.SysoLogger;

public class LockServiceImpl implements LockService {
    private LockDAO lockDAO;
     public LockServiceImpl(LockDAO lockDAO) {
    	 this.lockDAO = lockDAO;
		// TODO Auto-generated constructor stub
	}
	@Override
	public Integer saveLock(LockBean lockBean) {
		Lock lock=new Lock();		
	    lock.setLockPrice(lockBean.getLockPrice());
	    lock.setLockModel(lockBean.getLockModel());
		lock.setLockColor(lockBean.getLockColor());
		lock.setLockKind(lockBean.getLockKind());
		lock.setLockSize(lockBean.getLockSize());
		lock.setHeight(lockBean.getHeight());
		lock.setWidth(lockBean.getWidth());
		lock.setDepth(lockBean.getDepth());
		lock.setWeight(lockBean.getWeight());
		lock.setWareHouse(lockBean.getWareHouse());
	
		
		return lockDAO.saveLock(lock);
	}

	@Override
	public List<LockBean> getAllLocks() {
		List<LockBean> locks=null;
		List<Lock> llocks=lockDAO.getLocks();
		if(llocks!=null)
		{
			locks=new ArrayList<LockBean>();
			ListIterator<Lock> li=llocks.listIterator();
			while(li.hasNext())
			{
				Lock lock=li.next();
				LockBean lockBean=new LockBean();
				
				lockBean.setLockSno(lock.getLockSno());
				lockBean.setLockPrice(lock.getLockPrice());
				lockBean.setLockModel(lock.getLockModel());
				lockBean.setLockColor(lock.getLockColor());
				lockBean.setLockPrice(lock.getLockPrice());
				lockBean.setLockKind(lock.getLockKind());
				lockBean.setLockSize(lock.getLockSize());
				lockBean.setHeight(lock.getHeight());
				lockBean.setWidth(lock.getWidth());
				lockBean.setDepth(lock.getDepth());
				lockBean.setWeight(lock.getWeight());
				lockBean.setWareHouse(lock.getWareHouse());
				
				
				
				
				locks.add(lockBean);
			}
		}
		
		return locks;
	}
	@Override
	public LockBean getLock(Integer lockSno) {
        Lock lock=lockDAO.getLock(lockSno);
		
		LockBean lockBean=null;
		if(lock !=null)
		{
			lockBean=new LockBean();
			lockBean.setLockSno(lock.getLockSno());
			lockBean.setLockPrice(lock.getLockPrice());
			lockBean.setLockModel(lock.getLockModel());
			lockBean.setLockColor(lock.getLockColor());
			lockBean.setLockKind(lock.getLockKind());
			lockBean.setLockSize(lock.getLockSize());
			lockBean.setHeight(lock.getHeight());
			lockBean.setWidth(lock.getWidth());
			lockBean.setDepth(lock.getDepth());
			lockBean.setWeight(lock.getWeight());
			lockBean.setWareHouse(lock.getWareHouse());
			
		}
		return lockBean;
	}
	@Override
	public void modifyLock(LockBean lockBean) {
		// TODO Auto-generated method stub
		Lock lock=new Lock();
		lock.setLockSno(lockBean.getLockSno());
		lock.setLockPrice(lockBean.getLockPrice());
		lock.setLockModel(lockBean.getLockModel());
		lock.setLockColor(lockBean.getLockColor());
		lock.setLockKind(lockBean.getLockKind());
		lock.setLockSize(lockBean.getLockSize());
		lock.setHeight(lockBean.getHeight());
		lock.setWidth(lockBean.getWidth());
		lock.setDepth(lockBean.getDepth());
		lock.setWeight(lockBean.getWeight());
		lock.setWareHouse(lockBean.getWareHouse());
		
		
		lockDAO.updateLock(lock);
	}

}
	


