public class Holder {

    private int data;

    public Holder(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void rule1() {
        System.out.println("Holder : Rule1");
    }

    public void rule2() {
        System.out.println("Holder : Rule2");
    }
}
