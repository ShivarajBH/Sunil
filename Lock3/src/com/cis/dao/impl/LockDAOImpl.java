package com.cis.dao.impl;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;


import com.cis.dao.LockDAO;

//import com.cis.dao.model.Agency;
import com.cis.dao.model.Lock;
public class LockDAOImpl implements LockDAO {
	private HibernateTemplate ht;
	   public LockDAOImpl(HibernateTemplate ht) {
		   this.ht = ht;
		
	}
		public Integer saveLock(Lock lock) {
			Integer lockId =(Integer)ht.save(lock);
			return lockId;					
		}

		public List<Lock> getLocks() {
			return ht.find("from Lock");
		}
		public Lock getLock(Integer lockSno) {
		
			return (Lock)ht.get(Lock.class, lockSno);
		
		}

		public void deleteLock(Integer lockSno) {
		
			ht.delete(getLock(lockSno));
		}

		public void updateLock(Lock lockSno) {
			
			ht.update(lockSno);
		}


}
