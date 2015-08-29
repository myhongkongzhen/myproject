/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.dao.TestMapper.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2014-10-14 上午11:08:22 
 *   LastChange: 2014-10-14 上午11:08:22 
 *      History:
 * </pre>
 **************************************************************************/
package z.z.w.test.dao;

import java.util.List;
import java.util.Map;

import z.z.w.test.entity.TbTestUser;

/**
 * z.z.w.test.dao.TestMapper.java
 */

public interface TestMapper
{
	public int insert( TbTestUser testUser );

	public List< TbTestUser > selectAll();

	public TbTestUser selectUserById( String id );

	/**
	 * <br>
	 * Created on: 2014-12-17 上午11:18:21
	 * 
	 * @param map
	 * @return
	 */
	public List< TbTestUser > queryByParam( Map< String, Integer > map );
}
