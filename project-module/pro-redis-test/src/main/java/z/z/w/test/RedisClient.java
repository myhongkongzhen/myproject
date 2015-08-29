/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.RedisClient.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2014-11-11 下午08:16:02 
 *   LastChange: 2014-11-11 下午08:16:02 
 *      History:
 * </pre>
 **************************************************************************/
package z.z.w.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

/**
 * z.z.w.test.RedisClient.java
 */
public class RedisClient
{
    // private Jedis jedis; //非切片额客户端连接
    // private JedisPool jedisPool; //非切片连接池
    private ShardedJedis     shardedJedis;    // 切片额客户端连接
    private ShardedJedisPool shardedJedisPool; // 切片连接池

    /**
     * <br>
     * Created on: 2014-11-11 下午08:17:07
     */
    public RedisClient()
    {
        super();
        // initialPool( );
        initialShardedPool();
        shardedJedis = shardedJedisPool.getResource();
        // jedis = jedisPool.getResource( );
    }

    /**
     * 初始化切片池 <br>
     * Created on: 2014-11-11 下午08:17:31
     */
    private void initialShardedPool()
    {
        // 池基本配置
        JedisPoolConfig config = new JedisPoolConfig();
        // config.setMaxActive( 20 );
        config.setMaxIdle( 5 );
        // config.setMaxWait( 1000l );
        config.setTestOnBorrow( false );
        // slave链接
        List< JedisShardInfo > shards = new ArrayList< JedisShardInfo >();
        shards.add( new JedisShardInfo( "192.168.137.3", 6379, "master" ) );

        // 构造池
        shardedJedisPool = new ShardedJedisPool( config, shards );
    }

    /**
     * 初始化非切片池 <br>
     * Created on: 2014-11-11 下午08:17:27
     */
    //	private void initialPool( )
    //	{
    //		// 池基本配置
    //		JedisPoolConfig config = new JedisPoolConfig( );
    //		// config.setMaxActive( 20 );
    //		config.setMaxIdle( 5 );
    //		// config.setMaxWait( 1000l );
    //		config.setTestOnBorrow( false );
    //
    //		// jedisPool = new JedisPool( config, "192.168.137.3", 6379 );
    //	}

    /**
     * 
     * <br>
     * Created on: 2014-11-11 下午08:19:25
     */
    public void show()
    {
        sortMap();
        //        keyOperate();
        // jedisPool.returnResource( jedis );
        shardedJedisPool.returnResource( shardedJedis );
    }

    /**
     * <br>
     * Created on: 2014-11-23 下午02:50:54
     */
    private void sortMap()
    {
        // 添加数据  
        shardedJedis.hset( "ww", "entryKey33", "131" );
        shardedJedis.hset( "ww", "entryKey1", "43" );
        shardedJedis.hset( "ww", "entryKey2", "34" );
        shardedJedis.hset( "ww", "entryKey22", "231" );
        shardedJedis.hset( "wwentryKey", "131", "a93" );
        shardedJedis.hset( "wwentryKey", "43", "b13" );
        shardedJedis.hset( "wwentryKey", "34", "c53" );
        shardedJedis.hset( "wwentryKey", "231", "d13" );

        shardedJedis.hset( "lll", "131", "93" );
        shardedJedis.hset( "lll", "43", "13" );
        shardedJedis.hset( "lll", "34", "53" );
        shardedJedis.hset( "lll", "231", "13" );
        // 判断某个值是否存在  
        //        System.out.println( shardedJedis.hexists( "ww", "entryKey" ) );
        // 获取指定的值  
        //        System.out.println( shardedJedis.hget( "ww", "entryKey" ) ); // 批量获取指定的值  
        //        System.out.println( shardedJedis.hmget( "ww", "entryKey", "entryKey1" ) );
        //        System.out.println( "1----------------------" );
        // 删除指定的值  
        //        System.out.println( shardedJedis.hdel( "ww", "entryKey" ) );
        // 为key中的域 field 的值加上增量 increment  
        //        System.out.println( shardedJedis.hincrBy( "ww", "entryKey4", 123l ) );
        // 获取所有的keys  
        //        System.out.println( shardedJedis.hkeys( "ww" ) );
        // 获取所有的values  
        //        System.out.println( shardedJedis.hvals( "ww" ) );
        //        System.out.println( "2----------------------" );

        List< String > list = shardedJedis.hvals( "ww" );
        Iterator< String > it = list.iterator();
        List< String > so = new LinkedList< String >();
        while( it.hasNext() )
        {
            String ruleid = it.next();
            String v = shardedJedis.hget( "wwentryKey", ruleid );
            System.out.println( ruleid + "---" + v );
            so.add( v );
        }
        System.out.println( "-----------------" );
        Collections.sort( so );
        it = so.iterator();
        while( it.hasNext() )
        {
            String ruleid = it.next();
            System.out.println( ruleid + "---" );
        }
    }

    /**
     * <br>
     * Created on: 2014-11-11 下午08:19:45
     */
    private void keyOperate()
    {
        System.out.println( "======================key==========================" );
        // 清空数据
        // System.out.println( "清空库中所有数据：" + jedis.flushDB( ) );
        // 判断key否存在
        System.out.println( "判断key999键是否存在：" + shardedJedis.exists( "key999" ) );
        System.out.println( "新增key001,value001键值对：" + shardedJedis.set( "key001", "value001" ) );
        System.out.println( "判断key001是否存在：" + shardedJedis.exists( "key001" ) );
        // 输出系统中所有的key
        System.out.println( "新增key002,value002键值对：" + shardedJedis.set( "key002", "value002" ) );
        System.out.println( "系统中所有键如下：" );
        // Set<String> keys = jedis.keys( "*" );
        // Iterator<String> it = keys.iterator( );
        // while( it.hasNext( ) )
        // {
        // String key = it.next( );
        // System.out.println( key );
        // }
        // 删除某个key,若key不存在，则忽略该命令。
        // System.out.println( "系统中删除key002: " + jedis.del( "key002" ) );
        System.out.println( "判断key002是否存在：" + shardedJedis.exists( "key002" ) );
        // 设置 key001的过期时间
        // System.out.println( "设置 key001的过期时间为5秒:" + jedis.expire( "key001", 5 ) );
        try
        {
            Thread.sleep( 2000 );
        }
        catch( InterruptedException e )
        {
        }
        // 查看某个key的剩余生存时间,单位【秒】.永久生存或者不存在的都返回-1
        // System.out.println( "查看key001的剩余生存时间：" + jedis.ttl( "key001" ) );
        // 移除某个key的生存时间
        // System.out.println( "移除key001的生存时间：" + jedis.persist( "key001" ) );
        // System.out.println( "查看key001的剩余生存时间：" + jedis.ttl( "key001" ) );
        // 查看key所储存的值的类型
        // System.out.println( "查看key所储存的值的类型：" + jedis.type( "key001" ) );
        /* 一些其他方法：1、修改键名：jedis.rename("key6", "key0"); 2、将当前db的key移动到给定的db当中：jedis.move("foo", 1) */
    }

}
