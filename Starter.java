public class Starter {
    public static void main(String args[]) {
        LinkedList data = new LinkedList();
        data.add(2);
        data.add(1);
        data.add(3);
        data.add(2);
        System.out.println(data.printAllValues());
        data.sort();
        System.out.println(data.printAllValues());
    }
}
