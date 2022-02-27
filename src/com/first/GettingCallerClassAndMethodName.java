package com.first;

public interface GettingCallerClassAndMethodName {

    static void main(String... args) {
        System.out.println(getCallerClassAndMethodName());
        System.out.println(other());
    }

    static String other() {
        return getCallerClassAndMethodName();
    }

    static String getCallerClassAndMethodName() {
        StackTraceElement[] st = new Throwable().getStackTrace();
        if (st.length < 3) return null;
        return st[2].getClassName()+"#"+st[2].getMethodName();
    }
}
