public class Main {
    public static void main(String[] args) {
        Data data = new Data(100);
        Message message = new Message("Hello Java!");
        Holder holder = new Holder(200);

        //interfaces are not base classes however they behave like base classes

        Rules r;
        r = data;
        if(r instanceof Data) {
            ((Data) r).setData(100);
            System.out.println(((Data) r).getData());
        }
        r.rule1();
        r.rule2();

        System.out.println();

        r = message;
        if(r instanceof Message) {
            ((Message)r).setText("Hello world!");
            System.out.println(((Message)r).getText());
        }
        r.rule1();
        r.rule2();
        //r = holder; //error

    }
}
