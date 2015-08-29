/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.service.TestServiceTest.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2014-10-13 下午03:14:09 
 *   LastChange: 2014-10-13 下午03:14:09 
 *      History:
 * </pre>
 **************************************************************************/
package z.z.w.test.service;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import z.z.w.test.bean.page.TestUser;

/**
 * z.z.w.test.service.TestServiceTest.java
 */
// @RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(locations = { "classpath:spring.xml" })
public class TestServiceTest {

	/**
	 * Test method for {@link z.z.w.test.service.TestService#add()}.
	 */  
	@Test
	public void testAdd() {
		try {
			ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "classpath:spring.xml" });
			TestService testService = (TestService) ac.getBean("testService");
			TestUser testUser = new TestUser();
			testUser.setAge(20);
			testUser.setName("貴城慧");
			testService.add(testUser);
		} catch (Exception e) {
			fail("MASSAGE : " + e.getMessage() + "\nCAUSE : " + e.getCause() + "\nCLASS : " + e.getClass());
		}
	}

}
