package z.z.w.test.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import z.z.w.test.service.impl.ITaskServerImpl;

/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.controller.MyTaskController.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2015-7-26 下午09:55:00 
 *   LastChange: 2015-7-26 下午09:55:00 
 *      History:
 * </pre>
 **************************************************************************/
@Controller
@RequestMapping( "/task" )
public class MyTaskController
{
	private static Logger	logger	= LoggerFactory.getLogger( MyTaskController.class );
	private ITaskServerImpl	iTaskServerImpl;

	@RequestMapping( "/showTask" )
	public void showTask()
	{
		logger.info( "URL request has came into task controller...." );
		iTaskServerImpl.checkStatusInfos();
	}

	/**
	 * <br>
	 * Created on: 2015-7-26 下午09:57:29
	 * 
	 * @return the iTaskServerImpl
	 */
	public ITaskServerImpl getiTaskServerImpl()
	{
		return iTaskServerImpl;
	}

	/**
	 * <br>
	 * Created on: 2015-7-26 下午09:57:29
	 * 
	 * @param iTaskServerImpl
	 *            the iTaskServerImpl to set
	 */
	@Resource
	public void setiTaskServerImpl( ITaskServerImpl iTaskServerImpl )
	{
		this.iTaskServerImpl = iTaskServerImpl;
	}

}
