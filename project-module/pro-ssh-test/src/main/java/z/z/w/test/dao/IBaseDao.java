/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.dao.IBaseDao.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2014-10-13 下午08:10:42 
 *   LastChange: 2014-10-13 下午08:10:42 
 *      History:
 * </pre>
 **************************************************************************/
package z.z.w.test.dao;

import java.io.Serializable;

/**
 * z.z.w.test.dao.IBaseDao.java
 */

public interface IBaseDao<T> extends Serializable {

	public Serializable save(T t);
}
