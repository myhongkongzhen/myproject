/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.RedisClientTest.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2014-11-11 下午08:21:19 
 *   LastChange: 2014-11-11 下午08:21:19 
 *      History:
 * </pre>
 **************************************************************************/
package z.z.w.test;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * z.z.w.test.RedisClientTest.java
 */
public class RedisClientTest
{

    /**
     * [wzz@myhongkongzhen@gmail src]$ redis-server ../redis.conf <br>
     * Test method for {@link z.z.w.test.RedisClient#show()}.
     */
    @Test
    public void testShow()
    {
        try
        {
            new RedisClient().show();
        }
        catch( Exception e )
        {
            e.printStackTrace();
            fail( "Not yet implemented" );
        }

    }

}
