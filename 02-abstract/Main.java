public class Main {
    public static void main(String[] args) {
        
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        Application app = new Application(factory);
        
        app.paint();
    }
    
    
}
