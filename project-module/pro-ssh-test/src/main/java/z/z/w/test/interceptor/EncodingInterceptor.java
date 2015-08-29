/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.interceptor.EncodingInterceptor.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2014-10-13 下午02:57:08 
 *   LastChange: 2014-10-13 下午02:57:08 
 *      History:
 * </pre>
 **************************************************************************/
package z.z.w.test.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * z.z.w.test.interceptor.EncodingInterceptor.java
 */

public class EncodingInterceptor extends AbstractInterceptor {

	/**
	 * <br>
	 * Created on: 2014-10-13 下午02:57:12
	 */
	private static final long serialVersionUID = 6941275871562891057L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.interceptor.AbstractInterceptor#intercept(com.opensymphony.xwork2.ActionInvocation)
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		return invocation.invoke();
	}

}
