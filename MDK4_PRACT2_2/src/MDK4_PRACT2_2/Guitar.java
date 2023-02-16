package MDK4_PRACT2_2;

import MDK4_PRACT2_2.Interfaces.Tool;

public class Guitar implements Tool {
    int numStrings;
    public Guitar(int numStrings) {
        this.numStrings = numStrings;
    }
    @Override
    public void play() {
        System.out.println("Играет гитара с " + numStrings + " струнами");
    }
}
