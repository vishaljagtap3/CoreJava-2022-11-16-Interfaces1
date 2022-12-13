public class Data implements Rules {

    private int data;

    public Data(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public void rule1() {
        System.out.println("Data: Rule1");
    }

    @Override
    public void rule2() {
        System.out.println("Data: Rule2");
    }
}
