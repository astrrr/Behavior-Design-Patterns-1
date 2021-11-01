import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Publisher;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPublisher implements Publisher {
    List<StringSubScription> listSubscriptions = new ArrayList<>();
    String text;
    @Override
    public void subscribe(Flow.Subscriber subscriber) {
        StringSubScription newSubScription = new StringSubScription(subscriber);
        listSubscriptions.add(newSubScription);
        subscriber.onSubscribe(newSubScription);
    }

    public void publishString(String txt){
        text = txt;
        for(StringSubScription subScription : listSubscriptions){
            //System.out.println(subScription);
            if(subScription.subscriber instanceof AlphabetSubscriber && hasPattern("[a-zA-z]")) {
                subScription.publish(text);
            }
            if(subScription.subscriber instanceof NumberSubscriber && hasPattern("[0-9]")) {
                subScription.publish(text);
            }
            if(subScription.subscriber instanceof SymbolSubscriber && hasPattern("\\p{Punct}")) {
                subScription.publish(text);
            }

        }
    }

    private boolean hasPattern( String pattern) {
        Pattern stringItem = Pattern.compile(pattern);
        Matcher result = stringItem.matcher(text);
        return result.find();
    }
}
