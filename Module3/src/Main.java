public class Main {

    public static void main(String[] args){

        LinkedStack stack = new LinkedStack();

        stack.push(new Player(1, "ZXen0on",100));
        stack.push(new Player(2, "Blair",200));
        stack.push(new Player(3, "Yukio",300));
        stack.push(new Player(4, "Mozu",400));
        stack.push(new Player(5, "DungeonMaster",500));

        stack.printStack();

        System.out.println("Popping: " + stack.pop());

        stack.printStack();
    }
}