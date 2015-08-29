package z.z.w.test;

/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.MissedNumber.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2015-5-20 下午10:27:56 
 *   LastChange: 2015-5-20 下午10:27:56 
 *      History:
 * </pre>
 **************************************************************************/
public class MissedNumber
{
	public int findMissedOne( int[] numArray )
	{
		int sum = 0;
		int idx = -1;
		for( int i = 0; i < numArray.length; i++ )
		{
			if( numArray[ i ] == 0 )
			{
				idx = i;
			}
			else
			{
				sum += numArray[ i ];
			}
		}

		// the total sum of numbers between 1 and arr.length.
		int total = ( numArray.length + 1 ) * numArray.length / 2;
		int missedNumber = total - sum;
		return missedNumber;

	}

	/**
	 * <br>
	 * Created on: 2015-5-20 下午10:27:56
	 * 
	 * @param args
	 */
	public static void main( String[] args )
	{
		MissedNumber mNum = new MissedNumber();
		int[] testArray = new int[] { 0, 21, 26, 36 };
		int missedNumber = mNum.findMissedOne( testArray );
		System.out.println( missedNumber );
	}

}
