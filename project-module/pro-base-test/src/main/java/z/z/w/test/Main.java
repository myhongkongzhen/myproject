package z.z.w.test;

/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.Main.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2014-11-23 下午12:48:04 
 *   LastChange: 2014-11-23 下午12:48:04 
 *      History:
 * </pre>
 **************************************************************************/
public class Main
{

    /**
     * <br>
     * Created on: 2014-11-23 下午12:48:04
     * 
     * @param args
     */
    public static void main( String[] args )
    {
        Factory f = new Sun();
        f.setName( "mizu" );

        Sun s = ( Sun ) f;
        s.setAge( 34 );

        System.out.println( s.toString() );

    }

}
