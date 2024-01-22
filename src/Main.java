// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //create an instance of the model and set the initial state to red
        LightModel model1 = new LightModel();
        //create an instance of the view
        LightView view1 = new LightView();
        //add the view as a listener to the model
        model1.addListener(view1);
        model1.calculateState();
        //cycle through the standard states of a UK traffic signal


    }
}