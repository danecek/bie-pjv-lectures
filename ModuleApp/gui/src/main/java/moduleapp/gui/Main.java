package moduleapp.gui;

import java.awt.Font;
import java.lang.module.ModuleDescriptor;
import java.lang.module.ModuleFinder;
import java.lang.module.ModuleReference;
import java.nio.file.Path;
import java.util.Optional;
import java.util.ServiceLoader;
import javax.swing.JFrame;
import javax.swing.JLabel;
import moduleapp.api.Hello;

public class Main extends JFrame {

    public Main() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ServiceLoader<Hello> h = ServiceLoader.load(Hello.class);
        var l = new JLabel(h.findFirst().get().hello(), JLabel.CENTER);
        l.setFont(new Font(null, Font.BOLD, 32));
        add(l);
        this.setBounds(500, 500, 500, 500);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Path dir1 = Path.of("/home/danecek/Vyuka/BIE-PJV/bie-pjv-lectures/ModuleApp/api/target/api-1.0.jar");
        ModuleFinder finder = ModuleFinder.of(dir1);
        Optional<ModuleReference> omref = finder.find("moduleapp.api");
        ModuleDescriptor md = omref.get().descriptor();
        System.out.println(md.name());
        System.out.println(md.version());
        System.out.println(md.provides());
        System.out.println(md.requires());
        new Main();
    }
}
