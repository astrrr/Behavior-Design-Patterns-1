import java.util.concurrent.Flow;

public class NumberSubscriber extends StringSubscriber{
    Flow.Subscription subscription;

    public NumberSubscriber() {
    }



    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(Object item) {
        System.out.println("Number Subscriber: "+item);
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {

    }
}
