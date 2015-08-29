/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.service.TestServiceTest.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2014-10-14 上午10:43:27 
 *   LastChange: 2014-10-14 上午10:43:27 
 *      History:
 * </pre>
 **************************************************************************/
package z.z.w.test.service;

import static org.junit.Assert.fail;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import z.z.w.test.entity.TbTestUser;

/**
 * z.z.w.test.service.TestServiceTest.java
 */
@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( locations = { "classpath:spring.xml" } )
public class TestServiceTest
{

    private static Logger logger      = LoggerFactory.getLogger( TestServiceTest.class );
    private TestService   testService = null;

    // @Before
    // public void before() {
    // ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "classpath:spring.xml" });
    // testService = (TestService) ac.getBean("testService");
    // }

    /**
     * Test method for {@link z.z.w.test.service.TestService#addUser(z.z.w.test.entity.TbTestUser)}.
     */
    @Test
    public void testAddUser( )
    {
        try
        {
            TbTestUser testUser = new TbTestUser( );
            testUser.setAge( 20 );
            testUser.setName( "大和悠河" );
            testService.addUser( testUser );
            logger.debug( testUser.toString( ) );
        }
        catch( Exception e )
        {
            fail( "MASSAGE : " + e.getMessage( ) + "\nCAUSE : " + e.getCause( ) + "\nCLASS : " + e.getClass( ) );
        }
    }

    /**
     * Test method for {@link z.z.w.test.service.TestService#queryAllUsers()}.
     */
    @Test
    public void testQueryAllUsers( )
    {
        try
        {
            // ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "classpath:spring.xml" });
            // TestService testService = (TestService) ac.getBean("testService");
            List<TbTestUser> list = testService.queryAllUsers( );
            for( TbTestUser ttu : list )
            {
                logger.debug( "user : [{}-{}-{}].", ttu.getId( ), ttu.getName( ), ttu.getAge( ) );
            }
        }
        catch( Exception e )
        {
            fail( "MASSAGE : " + e.getMessage( ) + "\nCAUSE : " + e.getCause( ) + "\nCLASS : " + e.getClass( ) );
        }
    }

    /**
     * <br>
     * Created on: 2014-10-14 上午10:45:21
     * 
     * @return the testService
     */
    public TestService getTestService( )
    {
        return testService;
    }

    /**
     * <br>
     * Created on: 2014-10-14 上午10:45:21
     * 
     * @param testService
     *            the testService to set
     */
    @Resource
    public void setTestService( TestService testService )
    {
        this.testService = testService;
    }

}
