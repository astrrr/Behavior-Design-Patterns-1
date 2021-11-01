public class Main {
    public static void main(String[] args) {
        StringPublisher publisher = new StringPublisher();

        StringSubscriber alphabetSubscriber = new AlphabetSubscriber();
        publisher.subscribe(alphabetSubscriber);

        StringSubscriber numberSubscriber = new NumberSubscriber();
        publisher.subscribe(numberSubscriber);

        StringSubscriber symbolSubscriber = new SymbolSubscriber();
        publisher.subscribe(symbolSubscriber);


        System.out.println("------------- 1st publish-------------");
        publisher.publishString("abc");

        System.out.println("-------------2nd publish-------------");
        publisher.publishString("123");

        System.out.println("-------------3rd publish-------------");
        publisher.publishString("+-*/");

        System.out.println("-------------4th publish-------------");
        publisher.publishString("@abc");

        System.out.println("-------------5th publish-------------");
        publisher.publishString("abc123");

        System.out.println("-------------6th publish-------------");
        publisher.publishString("1+2");

        System.out.println("-------------7th publish-------------");
        publisher.publishString("2x+1");
    }
}
