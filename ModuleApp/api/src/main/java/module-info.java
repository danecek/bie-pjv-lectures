import moduleapp.api.Hello;
import moduleapp.api.apiimpl.HelloImpl;

module moduleapp.api {
    requires transitive java.logging;
    exports moduleapp.api;
      provides Hello with HelloImpl;
}






