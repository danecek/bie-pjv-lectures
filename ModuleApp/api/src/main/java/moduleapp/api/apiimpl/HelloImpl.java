package moduleapp.api.apiimpl;

import moduleapp.api.Hello;

public class HelloImpl implements Hello {

    @Override
    public String hello() {
        return "Hello";
    }

}
