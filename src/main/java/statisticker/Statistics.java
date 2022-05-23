package statisticker;

import java.util.List;

public class Statistics 
{
    public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
        Statistics statistics = new Statistics();
        Statistics.Stats stats= statistics.new Stats();
        stats.average=Float.NAN;
        stats.maximum=Float.NAN;
        stats.minimum=Float.NAN;
        if(numbers.size()!=0){
            Float result=0f;
            Float maxTemp=0f;
            Float minTemp;
            minTemp=numbers.get(0);
            for(int ii=0;ii<numbers.size();ii++){
                result+=numbers.get(ii);
                if(numbers.get(ii)>maxTemp)
                    maxTemp=numbers.get(ii);
                else if (numbers.get(ii)<minTemp)
                    minTemp=numbers.get(ii);
                stats.average= result/numbers.size();
                stats.maximum=maxTemp;
                stats.minimum=minTem;
                
            }
            return stats;
    }
}
