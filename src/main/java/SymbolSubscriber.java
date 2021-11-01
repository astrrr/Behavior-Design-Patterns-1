import java.util.concurrent.Flow;

public class SymbolSubscriber extends StringSubscriber{
    Flow.Subscription subscription;
    public SymbolSubscriber() {
    }



    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(Object item) {
        System.out.println("Symbol Subscriber: "+item);
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {
        System.out.println("Symbol complete");
    }
}
