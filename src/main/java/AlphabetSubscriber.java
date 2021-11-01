import java.util.concurrent.Flow;

public class AlphabetSubscriber extends StringSubscriber {
    Flow.Subscription subscription;

    public AlphabetSubscriber() {
    }



    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(Object item) {
        System.out.println("Alphabet Subscriber: "+item);
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {

    }
}
