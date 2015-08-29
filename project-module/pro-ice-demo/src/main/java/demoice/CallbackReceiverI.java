// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
package demoice;

import demo._CallbackReceiverDisp;

public final class CallbackReceiverI extends _CallbackReceiverDisp
{
	/**
     * <br> Created on: 2014-11-22 下午03:32:10 
     */
    private static final long serialVersionUID = -6927654318944302244L;

    public void callback( Ice.Current current )
	{
		System.out.println( "received callback" );
	}
}
