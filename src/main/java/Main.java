public class Main {
    public static void main(String[] args) {
        StringPublisher publisher = new StringPublisher();

        StringSubscriber alphabetSubscriber = new AlphabetSubscriber();
        StringSubscriber numberSubscriber = new NumberSubscriber();
        StringSubscriber symbolSubscriber = new SymbolSubscriber();

        publisher.subscribe(alphabetSubscriber);
        publisher.subscribe(numberSubscriber);
        publisher.subscribe(symbolSubscriber);


        System.out.println("-------------first publish-------------");
        publisher.publishString("abc");

        System.out.println("-------------second publish-------------");
        publisher.publishString("123");

        System.out.println("-------------third publish-------------");
        publisher.publishString("+-*/");
    }
}
