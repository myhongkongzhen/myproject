package z.z.w.test.others;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Field;

/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.others.MainTest.java
 *         Desc: heap中对象有强可及对象、软可及对象、弱可及对象、
 *               虚可及对象和不可到达对象。应用的强弱顺序是强、软、弱、和虚。
 *               对于对象是属于哪种可及的对象，由他的最强的引用决定
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2015-5-20 上午07:33:32 
 *   LastChange: 2015-5-20 上午07:33:32 
 *      History:
 * </pre>
 **************************************************************************/
public class MainTest
{
	public static boolean	isRun	= true;

	/**
	 * <br>
	 * Created on: 2015-5-20 上午07:33:32
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main( String[] args ) throws InterruptedException
	{
		
		Integer i = 3;
		String abc = new String( "abc" );
		System.out.println( abc.getClass() + "@" + abc.hashCode() );
		final ReferenceQueue referenceQueue = new ReferenceQueue< String >();
		new Thread()
		{
			public void run()
			{
				while( isRun )
				{
					Object o = referenceQueue.poll();
					if( o != null )
					{
						try
						{
							Field rereferent = Reference.class.getDeclaredField( "referent" );
							rereferent.setAccessible( true );
							Object result = rereferent.get( o );
							System.out.println( "gc will collect:" + result.getClass() + "@" + result.hashCode() );
						}
						catch( Exception e )
						{

							e.printStackTrace();
						}
					}
				}
			}
		}.start();
		PhantomReference< String > abcWeakRef = new PhantomReference< String >( abc, referenceQueue );
		abc = null;
		Thread.currentThread().sleep( 3000 );
		String[] q = new String[] { "abc" };
		System.out.println( q.getClass() + "@" + q.hashCode() );
		PhantomReference< String[] > abcWeakRef2 = new PhantomReference< String[] >( q, referenceQueue );
		q = null;
		System.gc();
		Thread.currentThread().sleep( 3000 );
//		isRun = false;

		/*************************************************************************
		 * 如果你希望能随时取得某对象的信息，但又不想影响此对象的垃圾收集，
		 * 
		 * 那么你应该用 Weak Reference 来记住此对象，而不是用一般的 reference。
		 * 
		 * 在设计 Optimizer 或 Debugger 这类的程序时常会用到，
		 * 
		 * 因为这类程序需要取得某对象的信息，但是不可以 影响此对象的垃圾收集。
		 *************************************************************************/
//		String abc = new String( "abc" );
//		WeakReference< String > abcWeakRef = new WeakReference< String >( abc );
//		abc = null;
////		System.gc();// 等待一段时间，obj对象就会被垃圾回收
//		if( abcWeakRef.get() == null )
//		{
//			System.out.println( "obj 已经被清除了 " );
//		}
//		else
//		{
//			System.out.println( "obj 尚未被清除，其信息是 " + abcWeakRef.get().toString() );
//		}

		/******************************************************************************
		 * 
		 * 软引用是主要用于内存敏感的高速缓存
		 * 
		 * 第一行在heap对中创建内容为“abc”的对象，并建立abc到该对象的强引用,该对象是强可及的。
		 * 
		 * 第二行和第三行分别建立对heap中对象的软引用和弱引用，此时heap中的对象仍是强可及的。
		 * 
		 * 第四行之后heap中对象不再是强可及的，变成软可及的。同样第五行执行之后变成弱可及的。
		 * 
		 * SoftReference 是用来设计 object-cache 之用的。
		 * 
		 * 如此一来 SoftReference 不但可以把对象 cache 起来，
		 * 
		 * 也不会造成内存不足的错误 （OutOfMemoryError）。
		 *****************************************************************************/
//		String abc = new String( "abc" ); // 1
//		SoftReference< String > abcSoftRef = new SoftReference< String >( abc ); // 2
//		WeakReference< String > abcWeakRef = new WeakReference< String >( abc ); // 3
//		abc = null; // 4
//		abcSoftRef.clear();// 5
	}
}
