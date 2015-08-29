/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.entity.TbTestUser.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2014-10-14 上午10:31:40 
 *   LastChange: 2014-10-14 上午10:31:40 
 *      History:
 * </pre>
 **************************************************************************/
package z.z.w.test.entity;

/**
 * z.z.w.test.entity.TbTestUser.java
 */

public class TbTestUser
{

    private Integer id;
    private String  name;
    private int     age;

    /**
     * <br>
     * Created on: 2014-11-5 下午07:25:27
     */
    public TbTestUser( )
    {
        // TODO 2014-11-5下午07:25:27 TbTestUser constructor  
        super( );
    }

    /**
     * <br>
     * Created on: 2014-11-5 下午07:25:30
     * 
     * @param id
     * @param name
     * @param age
     */
    public TbTestUser( Integer id, String name, int age )
    {
        super( );
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /* (non-Javadoc)
     * 
     * @see java.lang.Object#toString() */
    @Override
    public String toString( )
    {
        return "TbTestUser [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

    /* (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode() */
    @Override
    public int hashCode( )
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ( ( id == null ) ? 0 : id.hashCode( ) );
        result = prime * result + ( ( name == null ) ? 0 : name.hashCode( ) );
        return result;
    }

    /* (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object) */
    @Override
    public boolean equals( Object obj )
    {
        if( this == obj ) return true;
        if( obj == null ) return false;
        if( getClass( ) != obj.getClass( ) ) return false;
        TbTestUser other = ( TbTestUser ) obj;
        if( age != other.age ) return false;
        if( id == null )
        {
            if( other.id != null ) return false;
        }
        else if( !id.equals( other.id ) ) return false;
        if( name == null )
        {
            if( other.name != null ) return false;
        }
        else if( !name.equals( other.name ) ) return false;
        return true;
    }

    /**
     * <br>
     * Created on: 2014-11-5 下午07:25:42
     * 
     * @return the id
     */
    public Integer getId( )
    {
        return id;
    }

    /**
     * <br>
     * Created on: 2014-11-5 下午07:25:42
     * 
     * @param id
     *            the id to set
     */
    public void setId( Integer id )
    {
        this.id = id;
    }

    /**
     * <br>
     * Created on: 2014-11-5 下午07:25:42
     * 
     * @return the name
     */
    public String getName( )
    {
        return name;
    }

    /**
     * <br>
     * Created on: 2014-11-5 下午07:25:42
     * 
     * @param name
     *            the name to set
     */
    public void setName( String name )
    {
        this.name = name;
    }

    /**
     * <br>
     * Created on: 2014-11-5 下午07:25:42
     * 
     * @return the age
     */
    public int getAge( )
    {
        return age;
    }

    /**
     * <br>
     * Created on: 2014-11-5 下午07:25:42
     * 
     * @param age
     *            the age to set
     */
    public void setAge( int age )
    {
        this.age = age;
    }

}
