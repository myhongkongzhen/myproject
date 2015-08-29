/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.action.BaseAction.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2014-10-13 下午07:54:06 
 *   LastChange: 2014-10-13 下午07:54:06 
 *      History:
 * </pre>
 **************************************************************************/
package z.z.w.test.action;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;

import com.opensymphony.xwork2.ModelDriven;

/**
 * z.z.w.test.action.BaseAction.java
 */
@ParentPackage("testActionPackage")
// http://localhost:8888/testAction!add.zzw
@Namespace("/")
public class BaseAction<T> implements ModelDriven<T> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	public T getModel() {
		return null;
	}

}
