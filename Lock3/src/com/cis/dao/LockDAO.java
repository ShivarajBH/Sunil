package com.cis.dao;
import java.util.List;
import com.cis.dao.model.Lock;
public interface LockDAO {
	public Integer saveLock(Lock lock);
	public List<Lock> getLocks();
	public Lock getLock(Integer lockSno);
	public void deleteLock(Integer lockSno);
	public void updateLock(Lock lock);

}
