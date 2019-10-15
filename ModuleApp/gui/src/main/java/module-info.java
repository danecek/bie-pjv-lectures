
import moduleapp.api.Hello;

module moduleapp.gui {
    requires java.desktop;
    requires moduleapp.api;
    uses Hello;
}
