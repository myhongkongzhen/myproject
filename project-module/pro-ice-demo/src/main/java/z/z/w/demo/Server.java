/**
 * z.z.w.demo.Server.java
 */
package z.z.w.demo;

/**************************************************************************
 * <pre>
 *     FileName: z.z.w.demo.Server.java
 *         Desc: 
 *      @author: wuzhenzhen - myhongkongzhen@gmail.com
 *     @version: 2014-11-5 下午04:24:18 
 *   LastChange: 2014-11-5 下午04:24:18 
 *      History:
 * </pre>
 **************************************************************************/
public class Server
{

	/**
	 * <br>
	 * Created on: 2014-11-5 下午04:24:18
	 * 
	 * @param args
	 */
	public static void main( String[] args )
	{
		int status = 0;
		Ice.Communicator ic = null;

		try
		{
			ic = Ice.Util.initialize( args );
			Ice.ObjectAdapter ad = ic.createObjectAdapterWithEndpoints( "testad", "default -h 127.0.0.1 -p 8888" );
																				    
			Ice.Object obj = new Demo( );
			ad.add( obj, Ice.Util.stringToIdentity( "test" ) );
			ad.activate( );
			ic.waitForShutdown( );
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
