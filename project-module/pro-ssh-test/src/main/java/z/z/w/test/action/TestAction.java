/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.action.TestAction.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2014-10-13 下午03:07:39 
 *   LastChange: 2014-10-13 下午03:07:39 
 *      History:
 * </pre>
 **************************************************************************/
package z.z.w.test.action;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import z.z.w.test.bean.page.TestUser;
import z.z.w.test.service.TestService;

/**
 * z.z.w.test.action.TestAction.java
 */
@Action
public class TestAction extends BaseAction<TestUser> {
	private static final Logger logger = LoggerFactory.getLogger(TestAction.class);

	private TestService testService = null;
	private TestUser testUser = new TestUser();

	public void add() {
		logger.debug("test action ....");
		// ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(ServletActionContext.getServletContext());
		// ITestService iTestService = (ITestService) ac.getBean("testServiceImpl");
		testUser.setAge(20);
		testUser.setName("貴城慧");
		testService.add(testUser);
	}

	/**
	 * <br>
	 * Created on: 2014-10-13 下午03:08:32
	 * 
	 * @return the testService
	 */
	public TestService getTestService() {
		return testService;
	}

	/**
	 * <br>
	 * Created on: 2014-10-13 下午03:08:32
	 * 
	 * @param testService
	 *            the testService to set
	 */
	@Resource
	public void setTestService(TestService testService) {
		this.testService = testService;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see z.z.w.test.action.BaseAction#getModel()
	 */
	@Override
	public TestUser getModel() {
		return testUser;
	}
}
