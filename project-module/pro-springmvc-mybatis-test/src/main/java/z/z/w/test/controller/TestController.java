/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.controller.TestController.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2014-10-14 上午11:26:35 
 *   LastChange: 2014-10-14 上午11:26:35 
 *      History:
 * </pre>
 **************************************************************************/
package z.z.w.test.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import z.z.w.test.entity.TbTestUser;
import z.z.w.test.service.TestService;

/** 
 * z.z.w.test.controller.TestController.java
 */
@Controller
@RequestMapping("/test")
public class TestController {
	private TestService testService = null;
	private static Logger logger = LoggerFactory.getLogger(TestController.class);

	@RequestMapping("/{id}/showUser")
	public String show(@PathVariable String id, Model model) {
		TbTestUser ttu = testService.findUserById(id);
		model.addAttribute("tbTestUser", ttu);
		logger.debug("User : [{}-{}-{}].", ttu.getId(), ttu.getName(), ttu.getAge());
		return "showuser";
	}

	/**
	 * <br>
	 * Created on: 2014-10-14 上午11:42:35
	 * 
	 * @return the testService
	 */
	public TestService getTestService() {
		return testService;
	}

	/**
	 * <br>
	 * Created on: 2014-10-14 上午11:42:35
	 * 
	 * @param testService
	 *            the testService to set
	 */
	@Resource
	public void setTestService(TestService testService) {
		this.testService = testService;
	}
}
