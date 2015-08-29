/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.dto.drools.Message.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2014-11-11 下午07:22:54 
 *   LastChange: 2014-11-11 下午07:22:54 
 *      History:
 * </pre>
 **************************************************************************/
package z.z.w.test.dto.drools;

/**
 * z.z.w.test.dto.drools.Message.java
 */
public class Message
{
    public static final int HELLO   = 0;
    public static final int GOODBYE = 1;

    private String          message;
    private int             status;

    /**
     * <br>
     * Created on: 2014-11-11 下午07:37:54
     */
    public Message( )
    {
        super( );
    }

    /**
     * <br>
     * Created on: 2014-11-11 下午07:38:01
     * 
     * @param message
     * @param status
     */
    public Message( String message, int status )
    {
        super( );
        this.message = message;
        this.status = status;
    }

    /* (non-Javadoc)
     * 
     * @see java.lang.Object#toString() */
    @Override
    public String toString( )
    {
        return "Message [message=" + message + ", status=" + status + "]";
    }

    /* (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode() */
    @Override
    public int hashCode( )
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( message == null ) ? 0 : message.hashCode( ) );
        result = prime * result + status;
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
        Message other = ( Message ) obj;
        if( message == null )
        {
            if( other.message != null ) return false;
        }
        else if( !message.equals( other.message ) ) return false;
        if( status != other.status ) return false;
        return true;
    }

    /**
     * <br>
     * Created on: 2014-11-11 下午07:38:13
     * 
     * @return the message
     */
    public String getMessage( )
    {
        return message;
    }

    /**
     * <br>
     * Created on: 2014-11-11 下午07:38:13
     * 
     * @param message
     *            the message to set
     */
    public void setMessage( String message )
    {
        this.message = message;
    }

    /**
     * <br>
     * Created on: 2014-11-11 下午07:38:13
     * 
     * @return the status
     */
    public int getStatus( )
    {
        return status;
    }

    /**
     * <br>
     * Created on: 2014-11-11 下午07:38:13
     * 
     * @param status
     *            the status to set
     */
    public void setStatus( int status )
    {
        this.status = status;
    }

}
