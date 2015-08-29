package z.z.w.test;

/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.TestSpring.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2015-6-17 下午04:18:43 
 *   LastChange: 2015-6-17 下午04:18:43 
 *      History:
 * </pre>
 **************************************************************************/
public class TestSpring
{
//	private static String	a	= "ab";
	private static String	a	= new String( "ab" );

	/**
	 * <br>
	 * Created on: 2015-6-17 下午04:18:43
	 * 
	 * @param args
	 */
	public static void main( String[] args )
	{
		String s1 = "a";
		String s2 = "b";
		String s = s1 + s2;
		System.out.println( s == a );
		System.out.println( s.intern() == a );
		System.out.println( s.intern() == a.intern() );

//		String s1 = "a";
//		String s2 = "b";
//		String s = s1 + s2;
//		System.out.println( s == a );
//		System.out.println( s.intern() == a );

//		String a = "ab";
//		final String bb = getBB();
//		String b = "a" + bb;
//		System.out.println( a == b );

//		String a = "a1";
//		String b = "a" + 1;
//		System.out.println( a == b );

//		String a = "ab";
//		String bb = "b";
//		String b = "a" + bb;
//		System.out.println( a == b );

//		String a = "ab";
//		final String bb = "b";
//		String b = "a" + bb;
//		System.out.println( a == b );

	}

	private static String getBB()
	{
		return "b";
	}
}
