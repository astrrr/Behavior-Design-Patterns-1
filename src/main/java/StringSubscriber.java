import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Subscriber;

abstract class StringSubscriber implements Subscriber {
    public StringSubscriber() {
    }

    @Override
    public abstract void onSubscribe(Flow.Subscription subscription);

    @Override
    public abstract void onNext(Object item);


    @Override
    public void onComplete() {

    }
}
