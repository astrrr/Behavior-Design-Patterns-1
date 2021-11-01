
import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Subscription;

public class StringSubScription implements Subscription{
    Flow.Subscriber subscriber;
    long count;
    public StringSubScription(Flow.Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    @Override
    public void request(long n) {
        this.count=n;
    }

    @Override
    public void cancel() {
        System.out.println("Cancel");
    }

    public void publish(String text){
        for (int i =0; i<count; i++){
            subscriber.onNext(text);
        }
        subscriber.onComplete();
    }
}
