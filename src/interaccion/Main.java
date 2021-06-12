package interaccion;

import vista.Frame;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setLocation(100,100);
        frame.setSize(905,880);
        frame.addEventos();
        frame.setVisible(true);
    }
}