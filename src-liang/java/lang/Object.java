/*
 * Copyright (c) 1994, 2012, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package java.lang;

/**
 * ������ṹ�����
 * @author liang
 * �ٷ����ܵ�ʱ��˵����Ҳ�Ǽ̳�������࣬�������Լ�����ȥ��һ�£�����~~~
 * �ҿ��ˣ����ǲ�û�м̳а���������д�ġ�public final class Array����Ӧ����ֻ�̳��˷������������ʣ�
 */

public class Object {

	
    private static native void registerNatives();
    static {
        registerNatives();
    }

    /**
     * �����������е���
     */
    public final native Class<?> getClass();


    /**'
     * 
     */
    public native int hashCode();


    public boolean equals(Object obj) {
        return (this == obj);
    }

   
    protected native Object clone() throws CloneNotSupportedException;

 
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }


    public final native void notify();

 
    public final native void notifyAll();

    
    public final native void wait(long timeout) throws InterruptedException;

    
    public final void wait(long timeout, int nanos) throws InterruptedException {
        if (timeout < 0) {
            throw new IllegalArgumentException("timeout value is negative");
        }

        if (nanos < 0 || nanos > 999999) {
            throw new IllegalArgumentException(
                                "nanosecond timeout value out of range");
        }

        if (nanos > 0) {
            timeout++;
        }

        wait(timeout);
    }

    
    public final void wait() throws InterruptedException {
        wait(0);
    }

    
    protected void finalize() throws Throwable { }
}
