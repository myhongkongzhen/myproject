package z.z.w.test.compare;

import java.util.Comparator;

/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.compare.AlphDesc.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2015-5-20 上午07:10:46 
 *   LastChange: 2015-5-20 上午07:10:46 
 *      History:
 * </pre>
 **************************************************************************/
public class AlphDesc implements Comparator< PersonBean >
{

	/*
	 * (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare( PersonBean personA, PersonBean personB )
	{
		int cop = personA.age - personB.age;
		if( cop != 0 )
			return cop;
		else
			return personB.getName().compareTo( personA.getName() );
	}
}
