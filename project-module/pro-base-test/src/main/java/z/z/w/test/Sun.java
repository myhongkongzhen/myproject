package z.z.w.test;

/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.Sun.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2014-11-23 下午12:47:19 
 *   LastChange: 2014-11-23 下午12:47:19 
 *      History:
 * </pre>
 **************************************************************************/
public class Sun extends Factory
{
    private int age;

    /**
     * <br>
     * Created on: 2014-11-23 下午12:47:29
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
        return "Sun [age=" + age + ", toString()=" + super.toString() + "]";
    }

    /* (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode() */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + age;
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
        if( age != other.age )
            return false;
        return true;
    }

    /**
     * <br>
     * Created on: 2014-11-23 下午12:47:43
     * 
     * @return the age
     */
    public int getAge()
    {
        return age;
    }

    /**
     * <br>
     * Created on: 2014-11-23 下午12:47:43
     * 
     * @param age
     *            the age to set
     */
    public void setAge( int age )
    {
        this.age = age;
    }

}
