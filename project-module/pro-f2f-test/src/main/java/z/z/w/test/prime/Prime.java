package z.z.w.test.prime;

/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.prime.Prime.java
 *         Desc: “筛选"法
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2015-5-20 下午09:09:14 
 *   LastChange: 2015-5-20 下午09:09:14 
 *      History:
 * </pre>
 **************************************************************************/
public class Prime
{

	/**
	 * <br>
	 * Created on: 2015-5-20 下午09:09:14
	 * 
	 * @param args
	 */
	public static void main( String[] args )
	{
		int n = 20;
		int[] array = new int[ n ];

		for( int i = 2; i < n; i++ )
		{
			array[ i ] = i;
		}

		for( int i = 2; i < n; i++ )
		{
			if( array[ i ] != 0 )
			{
				int j, temp;
				temp = array[ i ];

				for( j = 2 * temp; j < n; j = j + temp )
				{
					System.out.println( array[ j ] + "===" );
					array[ j ] = 0;
					System.out.println( array[ j ] );
				}
//				System.out.println( "\n" );
			}
		}

		for( int i : array )
		{
			System.out.println( i );
		}
	}

}
