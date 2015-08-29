/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.service.TestService.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2014-10-13 下午03:04:59 
 *   LastChange: 2014-10-13 下午03:04:59 
 *      History:
 * </pre>
 **************************************************************************/
package z.z.w.test.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import z.z.w.test.bean.TbTestUser;
import z.z.w.test.bean.page.TestUser;
import z.z.w.test.dao.impl.TestDao;

/**
 * z.z.w.test.service.TestService.java
 */
@Service
public class TestService {

	private static Logger logger = LoggerFactory.getLogger(TestService.class);
	private TestDao<TbTestUser> testDao = null;

	/**
	 * 
	 * <br>
	 * Created on: 2014-10-13 下午03:07:11
	 * 
	 * @param testUser
	 */
	public void add(TestUser testUser) {
		logger.debug("test add service .....");
		TbTestUser ttu = new TbTestUser();
		BeanUtils.copyProperties(testUser, ttu);
		testDao.save(ttu);
		logger.debug("Add user : [{}-{}].", ttu.getId(), ttu.getName());
	}

	/**
	 * <br>
	 * Created on: 2014-10-13 下午08:15:49
	 * 
	 * @return the testDao
	 */
	public TestDao<TbTestUser> getTestDao() {
		return testDao;
	}

	/**
	 * <br>
	 * Created on: 2014-10-13 下午08:15:49
	 * 
	 * @param testDao
	 *            the testDao to set
	 */
	@Resource
	public void setTestDao(TestDao<TbTestUser> testDao) {
		this.testDao = testDao;
	}

}
