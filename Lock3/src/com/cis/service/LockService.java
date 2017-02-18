package com.cis.service;
import java.util.List;
import com.cis.service.beans.LockBean;
public interface LockService {
	public Integer saveLock(LockBean lockBean);
	public List<LockBean> getAllLocks();
	public LockBean getLock(Integer lockSno);
	public void modifyLock(LockBean lockBean);
}
