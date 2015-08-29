package z.z.w.test.dto.drools;

/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.dto.drools.Sun.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2014-11-23 下午07:52:07 
 *   LastChange: 2014-11-23 下午07:52:07 
 *      History:
 * </pre>
 **************************************************************************/
public class Sun extends Message
{
    private String sum;

    /**
     * <br>
     * Created on: 2014-11-23 下午07:52:19
     */
    public Sun()
    {
        super();
    }

    /* (non-Javadoc)
     * 
     * @see java.lang.Object#toString() */
    @Override
    public String toString()
    {
        return "Sun [sum=" + sum + "]";
    }

    /* (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode() */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ( ( sum == null ) ? 0 : sum.hashCode() );
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
        if( !super.equals( obj ) )
            return false;
        if( getClass() != obj.getClass() )
            return false;
        Sun other = ( Sun ) obj;
        if( sum == null )
        {
            if( other.sum != null )
                return false;
        }
        else if( !sum.equals( other.sum ) )
            return false;
        return true;
    }

    /**
     * <br>
     * Created on: 2014-11-23 下午07:52:25
     * 
     * @return the sum
     */
    public String getSum()
    {
        return sum;
    }

    /**
     * <br>
     * Created on: 2014-11-23 下午07:52:25
     * 
     * @param sum
     *            the sum to set
     */
    public void setSum( String sum )
    {
        this.sum = sum;
    }

}
