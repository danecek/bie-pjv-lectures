package moduleapp.api;

import moduleapp.api.apiimpl.HelloImpl;

public interface Hello {

    public static final Hello INSTANCE = new HelloImpl();

    String hello();

}
