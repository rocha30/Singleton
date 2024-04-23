//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Appconfig config = Appconfig.getInstance();
        config.setServerUrl("http://miapi.com");
        System.out.println("URL del Servidor: " + config.getServerUrl());
        config.setId(20);
        System.out.println("El ID es: " + config.getId());
        config.setName("Mario");
        System.out.println("Tu nombre es : " + config.getName());



    }
}