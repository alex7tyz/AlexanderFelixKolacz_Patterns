package Abstract_Factory;

public class Application {
    private UIComponentFactory factory;
    public Application(UIComponentFactory factory) {
        this.factory = factory;
    }
    public void renderizarInterface() {
        Button button = factory.createButton();
        TextField textField = factory.createTextField();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        textField.render();
        checkbox.render();
    }
}