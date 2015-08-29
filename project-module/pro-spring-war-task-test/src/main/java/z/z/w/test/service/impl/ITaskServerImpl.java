package z.z.w.test.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import z.z.w.test.service.ITaskServer;

/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.service.impl.ITaskServerImpl.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2015-7-26 下午09:51:31 
 *   LastChange: 2015-7-26 下午09:51:31 
 *      History:
 * </pre>
 **************************************************************************/
@Service
public class ITaskServerImpl implements ITaskServer
{
	private static Logger	logger	= LoggerFactory.getLogger( ITaskServerImpl.class );

	/*
	 * (non-Javadoc)
	 * @see z.z.w.test.service.ITaskServer#checkStatusInfos()
	 */
	@Scheduled( cron = "0/5 * *  * * ? " )
	// 每5秒执行一次
	public void checkStatusInfos()
	{
		logger.info( "This is test for tasking.==>[{}].", System.currentTimeMillis() );
	}

}
