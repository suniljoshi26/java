public class Xyz {
    public void Hello() {
        System.out.println("Hello world");
    }

    // methodoverloading
    public void eat(String item) {
        System.out.println("i am eating " + item);

    }

    // methodoverloading
    public void eat(int items) {

        System.out.println("i am a eating " + items + " things");
    }
}
