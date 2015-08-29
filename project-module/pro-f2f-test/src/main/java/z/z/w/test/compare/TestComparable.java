package z.z.w.test.compare;

import java.util.Arrays;

/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.compare.TestComparable.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2015-5-20 上午07:11:02 
 *   LastChange: 2015-5-20 上午07:11:02 
 *      History:
 * </pre>
 **************************************************************************/
public class TestComparable
{
	public void compare()
	{
		PersonBean[] p = { new PersonBean( 20, "Tom" ), new PersonBean( 20, "Jeff" ), new PersonBean( 30, "Mary" ), new PersonBean( 20, "Ada" ), new PersonBean( 40, "Walton" ), new PersonBean( 61, "Peter" ), new PersonBean( 20, "Bush" ) };
		System.out.println( "before sort:\n" + Arrays.toString( p ) );
		AlphDesc desc = new AlphDesc();
		Arrays.sort( p, desc );
		System.out.println( "after sort:\n" + Arrays.toString( p ) );
	}

	public static void main( String[] args )
	{
		TestComparable tc = new TestComparable();
		tc.compare();
	}
}
