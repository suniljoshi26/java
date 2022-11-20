public class Ship {
    public String name;
    public int boomCount = 10;
    public int Fule = 100;

    public void Move(int x, int y) {
        this.decreasefule(20);
        System.out.println("Moving Ship " + this.name + x + " to " + y);
    }

    public void Fire(int x, int y) {
        this.decreasefule(10);
        this.decreaseboomcopunt();
        System.out.println("Moving Ship " + this.name + x + " to " + y);
    }

    private void decreasefule(int amount) {
        this.Fule -= amount;
        System.out.println(this.name + "    decreasefule " + this.Fule);

    }

    private void decreaseboomcopunt() {
        this.boomCount -= 1;

        System.out.println(this.name + " decreasefule " + this.boomCount);
    }
}
