package z.z.w.test.clone;

/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.clone.ShadowClone.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2015-5-20 上午07:17:09 
 *   LastChange: 2015-5-20 上午07:17:09 
 *      History:
 * </pre>
 **************************************************************************/
public class ShadowClone implements Cloneable
{
	// 基本类型
	private int		a;
	// 非基本类型
	private String	b;
	// 非基本类型
	private int[]	c;

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		// TODO 2015-5-20 上午07:17:26 ShadowClone.clone()
		return super.clone();
	}

	/**
	 * <br>
	 * Created on: 2015-5-20 上午07:17:34
	 * 
	 * @return the a
	 */
	public int getA()
	{
		return a;
	}

	/**
	 * <br>
	 * Created on: 2015-5-20 上午07:17:34
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
	 * Created on: 2015-5-20 上午07:17:34
	 * 
	 * @return the b
	 */
	public String getB()
	{
		return b;
	}

	/**
	 * <br>
	 * Created on: 2015-5-20 上午07:17:34
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
	 * Created on: 2015-5-20 上午07:17:34
	 * 
	 * @return the c
	 */
	public int[] getC()
	{
		return c;
	}

	/**
	 * <br>
	 * Created on: 2015-5-20 上午07:17:34
	 * 
	 * @param c
	 *            the c to set
	 */
	public void setC( int[] c )
	{
		this.c = c;
	}
}
