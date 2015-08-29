/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.HelloWorldExample.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2014-11-11 下午07:23:52 
 *   LastChange: 2014-11-11 下午07:23:52 
 *      History:
 * </pre>
 **************************************************************************/
package z.z.w.test;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import z.z.w.test.dto.drools.Message;
import z.z.w.test.dto.drools.Sun;

/**
 * z.z.w.test.HelloWorldExample.java
 */
public class HelloWorldExample
{

    /**
     * <br>
     * Created on: 2014-11-11 下午07:23:52
     * 
     * @param args
     */
    public static void main( String[] args )
    {
        // KieServices is the factory for all KIE services 
        KieServices ks = KieServices.Factory.get();

        // From the kie services, a container is created from the classpath
        KieContainer kc = ks.getKieClasspathContainer();

        // From the container, a session is created based on  
        // its definition and configuration in the META-INF/kmodule.xml file 
        KieSession ksession = kc.newKieSession( "HelloWorldKS" );

        final Message message = new Sun();
        message.setMessage( "GOODBYEGOODBYE" );
        message.setStatus( Message.GOODBYE );
        Sun s = ( Sun ) message;
        s.setSum( "000000000" );
        ksession.insert( message );

        // and fire the rules
        ksession.fireAllRules();

        // and then dispose the session
        ksession.dispose();
    }

}
