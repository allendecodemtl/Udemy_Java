package com.github.allendecodemtl.L_04_AccessModifiers;


interface Accessible {          // -> package-private
    int SOME_CONTSTANT = 100;   // -> public static final
    public void methodA();      // -> public abstract
    void methodB();             // -> public abstract
    boolean methodC();          // -> public abstract
}
