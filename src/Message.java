public class Message implements Rules {

    private String text;

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void rule1() {
        System.out.println("Message: Rule1");
    }

    @Override
    public void rule2() {
        System.out.println("Message: Rule2");
    }
}
