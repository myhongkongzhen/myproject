/**
 * z.z.w.demo.Demo.java
 */
package z.z.w.demo;

import Demoprint._PrinterDisp;
import Ice.Current;
import Ice.Object;

/**************************************************************************
 * <pre>
 *     FileName: z.z.w.demo.Demo.java
 *         Desc: 
 *      @author: wuzhenzhen - myhongkongzhen@gmail.com
 *     @version: 2014-11-5 下午04:33:03 
 *   LastChange: 2014-11-5 下午04:33:03 
 *      History:
 * </pre>
 **************************************************************************/
public class Demo extends _PrinterDisp implements Object
{

    /**
     * <br>
     * Created on: 2014-11-5 下午04:34:21
     */
    private static final long serialVersionUID = -928932435575331956L;

    /* (non-Javadoc)
     * 
     * @see Demo._PrinterOperations#printString(java.lang.String, Ice.Current) */
    public void printString( String s, Current __current )
    {
        System.out.println( __current );
        System.out.println( " s s s s " + s );
    }

}
