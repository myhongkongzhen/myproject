/**
 * z.z.w.demo.Client.java
 */
package z.z.w.demo;

import Demoprint.PrinterPrx;
import Demoprint.PrinterPrxHelper;

/**************************************************************************
 * <pre>
 *     FileName: z.z.w.demo.Client.java
 *         Desc: 
 *      @author: wuzhenzhen - myhongkongzhen@gmail.com
 *     @version: 2014-11-5 下午04:17:28 
 *   LastChange: 2014-11-5 下午04:17:28 
 *      History:
 * </pre>
 **************************************************************************/
public class Client
{
	public static void main( String[] args )
	{
		int status = 0;
		Ice.Communicator ic = null;

		try
		{
			ic = Ice.Util.initialize( args );
			Ice.ObjectPrx obj = ic.stringToProxy( "test:default -p 8888" );

			PrinterPrx print = PrinterPrxHelper.checkedCast( obj );
			if( print == null )
			{
				throw new RuntimeException( "proxy error!" );
			}

			print.printString( "hhhhhhhhhhhhhhhhhlllllllllllllllloooooooooooooooddddddddddd" );
		}
		catch( Exception e )
		{
			status = 1;
			e.printStackTrace( );
		}

		if( ic != null )
		{
			try
			{
				ic.destroy( );
			}
			catch( Exception e )
			{
				status = 1;
				e.printStackTrace( );
			}
		}

		System.exit( status );
	}
}
