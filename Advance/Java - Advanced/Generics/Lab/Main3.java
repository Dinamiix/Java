package Lab;

public class Main3 {

    public static void main(String[] args) {
        Jar<Integer> jar = new Jar<>();
        jar.add(13);
        int removed = jar.remove();
        System.out.println(removed);
    }
}
