package statisticker;
import java.util.List;

public class StatsChecker{
        EmailAlert emailAlerter = new EmailAlert();
        LEDAlert ledAlerter = new LEDAlert();
        IAlerter alerters[] = null;
        float maxThreshold =0f;
        
        public StatsChecker(float maxThreshold, IAlerter[] alerters){
          this.maxThreshold =maxThreshold;
          this.alerters=alerters;
        }
        
        public void checkAndAlert(List<Float> numbers){
           float max=numbers.get(0);
           for(int i=0;i<numbers.size();i++){
                if(max<numbers.get(i))
                        max=numbers.get(i);
           }
           if(max>maxThreshold){
                 alerters[0].emailSent=true;
                 alerters[1].ledGlows=true;
           }
        }
}
