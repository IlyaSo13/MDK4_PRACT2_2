package MDK4_PRACT2_2;

import MDK4_PRACT2_2.Interfaces.Tool;

public class Tube implements Tool {
    int diameter;
    public Tube(int diameter) {
        this.diameter = diameter;
    }
    @Override
    public void play() {
        System.out.println("Играет труба с диаметром " + diameter);
    }
}
