package z.z.w.test.clone;

import java.io.Serializable;

/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.clone.DeepClone.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2015-5-20 上午07:22:04 
 *   LastChange: 2015-5-20 上午07:22:04 
 *      History:
 * </pre>
 **************************************************************************/
public class DeepClone implements Serializable
{
	/**
	 * <br>
	 * Created on: 2015-5-20 上午07:22:52
	 */
	private static final long	serialVersionUID	= -3055233853051806261L;
	private int					a;
	private String				b;
	private int[]				c;

	/**
	 * <br>
	 * Created on: 2015-5-20 上午07:22:41
	 * 
	 * @return the a
	 */
	public int getA()
	{
		return a;
	}

	/**
	 * <br>
	 * Created on: 2015-5-20 上午07:22:41
	 * 
	 * @param a
	 *            the a to set
	 */
	public void setA( int a )
	{
		this.a = a;
	}

	/**
	 * <br>
	 * Created on: 2015-5-20 上午07:22:41
	 * 
	 * @return the b
	 */
	public String getB()
	{
		return b;
	}

	/**
	 * <br>
	 * Created on: 2015-5-20 上午07:22:41
	 * 
	 * @param b
	 *            the b to set
	 */
	public void setB( String b )
	{
		this.b = b;
	}

	/**
	 * <br>
	 * Created on: 2015-5-20 上午07:22:41
	 * 
	 * @return the c
	 */
	public int[] getC()
	{
		return c;
	}

	/**
	 * <br>
	 * Created on: 2015-5-20 上午07:22:41
	 * 
	 * @param c
	 *            the c to set
	 */
	public void setC( int[] c )
	{
		this.c = c;
	}
}
