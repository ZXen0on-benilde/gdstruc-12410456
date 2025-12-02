import java.util.ArrayList;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Player zxen0on = new Player(1, "ZXen0on", 100);
        Player blair   = new Player(2, "Blair",   231);
        Player yukio   = new Player(3, "Yukio",   351);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(zxen0on);
        playerLinkedList.addToFront(blair);
        playerLinkedList.addToFront(yukio);

        playerLinkedList.printList();
        System.out.println("Size: " + playerLinkedList.getSize());

        System.out.println("Contains Blair? " + playerLinkedList.contains(blair));
        System.out.println("Index of Blair: " + playerLinkedList.indexOf(blair));

        playerLinkedList.removeFromFront();
        playerLinkedList.printList();
        System.out.println("Size after remove: " + playerLinkedList.getSize());
    }
}



