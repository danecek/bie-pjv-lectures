import moduleapp.api.Hello;
import moduleapp.api.apiimpl.HelloImpl;

module moduleapp.api {
    exports moduleapp.api;
      provides Hello with HelloImpl;
}






