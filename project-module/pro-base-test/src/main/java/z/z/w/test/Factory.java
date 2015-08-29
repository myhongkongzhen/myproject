package z.z.w.test;

/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.Factory.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2014-11-23 下午12:46:11 
 *   LastChange: 2014-11-23 下午12:46:11 
 *      History:
 * </pre>
 **************************************************************************/
public class Factory
{
    private String name;

    /**
     * <br>
     * Created on: 2014-11-23 下午12:46:46
     */
    public Factory()
    {
        super();
    }

    /* (non-Javadoc)
     * 
     * @see java.lang.Object#toString() */
    @Override
    public String toString()
    {
        return "Factory [name=" + name + "]";
    }

    /* (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode() */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( name == null ) ? 0 : name.hashCode() );
        return result;
    }

    /* (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object) */
    @Override
    public boolean equals( Object obj )
    {
        if( this == obj )
            return true;
        if( obj == null )
            return false;
        if( getClass() != obj.getClass() )
            return false;
        Factory other = ( Factory ) obj;
        if( name == null )
        {
            if( other.name != null )
                return false;
        }
        else if( !name.equals( other.name ) )
            return false;
        return true;
    }

    /**
     * <br>
     * Created on: 2014-11-23 下午12:46:54
     * 
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * <br>
     * Created on: 2014-11-23 下午12:46:54
     * 
     * @param name
     *            the name to set
     */
    public void setName( String name )
    {
        this.name = name;
    }
}
