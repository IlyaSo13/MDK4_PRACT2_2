package MDK4_PRACT2_2;

import MDK4_PRACT2_2.Interfaces.Tool;

public class Drum implements Tool {
    String size;
    public Drum(String size) {
        this.size = size;
    }
    @Override
    public void play() {
        System.out.println("Играет барабан с размером " + size);
    }
}