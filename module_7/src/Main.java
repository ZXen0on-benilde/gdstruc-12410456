//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(67);
        tree.insert(47);
        tree.insert(17);
        tree.insert(27);
        tree.insert(87);
        tree.insert(57);
        tree.insert(37);
        tree.insert(77);

        System.out.println("Ascending:");
        tree.traverseInOrder();

        System.out.println("\nDescending:");
        tree.traverseInOrderDescending();

        System.out.println("\nMin node: " + tree.getMin());
        System.out.println("Max node: " + tree.getMax());
    }
}