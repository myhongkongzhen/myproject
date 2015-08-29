package z.z.w.test.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.clone.MainTest.java
 *         Desc: 当克隆的对象只有基本类型,不含引用类型时,可以用浅克隆实现.     
 *               当克隆的对象含有引用类型时,必须使用深克隆实现.
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2015-5-20 上午07:18:08 
 *   LastChange: 2015-5-20 上午07:18:08 
 *      History:
 * </pre>
 **************************************************************************/
public class MainTest
{

	/**
	 * <br>
	 * Created on: 2015-5-20 上午07:18:08
	 * 
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	public static void main( String[] args ) throws CloneNotSupportedException
	{
		/****************************************************************
		 * 
		 * 序列反序列化實現深克隆,引用類型改變，原值不變
		 * 
		 ****************************************************************/
		MainTest t = new MainTest();
		DeepClone dc1 = new DeepClone();
		// 对dc1赋值
		dc1.setA( 100 );
		dc1.setB( "clone1" );
		dc1.setC( new int[] { 1000 } );
		System.out.println( "克隆前: dc1.a=" + dc1.getA() );
		System.out.println( "克隆前: dc1.b=" + dc1.getB() );
		System.out.println( "克隆前: dc1.c[0]=" + dc1.getC()[ 0 ] );
		System.out.println( "-----------" );
		DeepClone dc2 = ( DeepClone ) t.deepClone( dc1 );
		// 对c2进行修改
		dc2.setA( 50 );
		dc2.setB( "clone2" );
		int[] a = dc2.getC();
		a[ 0 ] = 500;
		dc2.setC( a );
		System.out.println( "克隆前: dc1.a=" + dc1.getA() );
		System.out.println( "克隆前: dc1.b=" + dc1.getB() );
		System.out.println( "克隆前: dc1.c[0]=" + dc1.getC()[ 0 ] );
		System.out.println( "-----------" );
		System.out.println( "克隆后: dc2.a=" + dc2.getA() );
		System.out.println( "克隆后: dc2.b=" + dc2.getB() );
		System.out.println( "克隆后: dc2.c[0]=" + dc2.getC()[ 0 ] );
		/*************************************************************************
		 * 
		 * 淺克隆，只能克隆基本類型，引用類型拷貝地址，兩個地址指向同一個對象值， 一個改變其他都改變。
		 * 
		 *************************************************************************/
//		ShadowClone c1 = new ShadowClone();
//		// 对c1赋值
//		c1.setA( 100 );
//		c1.setB( "clone1" );
//		c1.setC( new int[] { 9000 } );
//
//		System.out.println( "克隆前: c1.a=" + c1.getA() );
//		System.out.println( "克隆前: c1.b=" + c1.getB() );
//		System.out.println( "克隆前: c1.c[0]=" + c1.getC()[ 0 ] );
//		System.out.println( "-----------" );
//
//		// 克隆出对象c2,并对c2的属性A,B,C进行修改
//
//		ShadowClone c2 = ( ShadowClone ) c1.clone();
//
//		// 对c2进行修改
//		c2.setA( 50 );
//		c2.setB( "clone2" );
//		int[] a = c2.getC();
//		a[ 0 ] = 500;
//		c2.setC( a );
//
//		System.out.println( "克隆后: c1.a=" + c1.getA() );
//		System.out.println( "克隆后: c1.b=" + c1.getB() );
//		System.out.println( "克隆后: c1.c[0]=" + c1.getC()[ 0 ] );
//		System.out.println( "---------------" );
//
//		System.out.println( "克隆后: c2.a=" + c2.getA() );
//		System.out.println( "克隆后: c2.b=" + c2.getB() );
//		System.out.println( "克隆后: c2.c[0]=" + c2.getC()[ 0 ] );
	}

	/**
	 * <br>
	 * Created on: 2015-5-20 上午07:25:19
	 * 
	 * @param dc1
	 * @return
	 */
	private Object deepClone( DeepClone src )
	{
		Object o = null;

		try
		{
			if( src != null )
			{
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream( baos );
				oos.writeObject( src );
				oos.close();
				ByteArrayInputStream bais = new ByteArrayInputStream( baos.toByteArray() );
				ObjectInputStream ois = new ObjectInputStream( bais );
				o = ois.readObject();
				ois.close();
			}
		}
		catch( IOException e )
		{
		}
		catch( ClassNotFoundException e )
		{
		}
		return o;
	}

}
