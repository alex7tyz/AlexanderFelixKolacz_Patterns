package Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Tema Claro ===");
        Application appClaro = new Application(new LightThemeFactory());
        appClaro.renderizarInterface();

        System.out.println();

        System.out.println("=== Tema Escuro ===");
        Application appEscuro = new Application(new DarkThemeFactory());
        appEscuro.renderizarInterface();
    }
}