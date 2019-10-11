package multimodule.data;

import multimodule.data.dataimpl.HelloImpl;

public abstract class Hello {

    public static final Hello INSTANCE = new HelloImpl();

    public abstract String hello();

}
