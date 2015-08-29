/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.bean.TbTestUser.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2014-10-13 下午02:58:55 
 *   LastChange: 2014-10-13 下午02:58:55 
 *      History:
 * </pre>
 **************************************************************************/
package z.z.w.test.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * z.z.w.test.bean.TbTestUser.java
 */
@Entity
public class TbTestUser {

	private int id;
	private String name;
	private int age;

	/**
	 * <br>
	 * Created on: 2014-10-13 下午02:59:17
	 * 
	 * @return the id
	 */
	@Id
	@GeneratedValue
	@Column(insertable = false, unique = true)
	public int getId() {
		return id;
	}

	/**
	 * <br>
	 * Created on: 2014-10-13 下午02:59:17
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * <br>
	 * Created on: 2014-10-13 下午02:59:17
	 * 
	 * @return the name
	 */
	@Column(nullable = false)
	public String getName() {
		return name;
	}

	/**
	 * <br>
	 * Created on: 2014-10-13 下午02:59:17
	 * 
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <br>
	 * Created on: 2014-10-13 下午02:59:17
	 * 
	 * @return the age
	 */
	@Column
	public int getAge() {
		return age;
	}

	/**
	 * <br>
	 * Created on: 2014-10-13 下午02:59:17
	 * 
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * <br>
	 * Created on: 2014-10-13 下午02:59:20
	 */
	public TbTestUser() {
		// TODO 2014-10-13下午02:59:20 TbTestUser constructor
		super();
	}

	/**
	 * <br>
	 * Created on: 2014-10-13 下午02:59:23
	 * 
	 * @param id
	 * @param name
	 * @param age
	 */
	public TbTestUser(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TbTestUser [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TbTestUser other = (TbTestUser) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
