package z.z.w.test.compare;

/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.compare.PersonBean.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2015-5-20 上午07:10:24 
 *   LastChange: 2015-5-20 上午07:10:24 
 *      History:
 * </pre>
 **************************************************************************/
public class PersonBean implements Comparable< PersonBean >
{
	public PersonBean( int age, String name )
	{
		this.age = age;
		this.name = name;
	}

	int		age		= 0;
	String	name	= "";

	public int getAge()
	{
		return age;
	}

	public void setAge( int age )
	{
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public boolean equals( Object o )
	{
		if( !( o instanceof PersonBean ) )
		{
			return false;
		}
		PersonBean p = ( PersonBean ) o;
		return ( age == p.age ) && ( name.equals( p.name ) );
	}

	public int hashCode()
	{
		int result = 17;
		result = 31 * result + age;
		result = 31 * result + name.hashCode();
		return result;

	}

	public String toString()
	{
		return( age + "{" + name + "}" );
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo( PersonBean person )
	{
		int cop = age - person.getAge();
		if( cop != 0 )
			return cop;
		else
			return name.compareTo( person.name );
	}

}
