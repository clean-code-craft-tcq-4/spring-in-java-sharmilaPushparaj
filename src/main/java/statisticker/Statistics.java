package statisticker;

import java.util.List;

public class Statistics 
{
    public class Stats {
        float average=Float.NAN;
        float max=Float.NAN;
        float min=Float.NAN;
    }
    public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
        Statistics statistics = new Statistics();
        Statistics.Stats s= statistics.new Stats();
        s.average=Float.NAN;
        s.max=Float.NAN;
        s.min=Float.NAN;
        if(numbers.size()!=0){
            Float result=0f;
            Float maxTemp=0f;
            Float minTemp=numbers.get(0);
            for(int ii=0;ii<numbers.size();ii++){
                result+=numbers.get(ii);
                if(numbers.get(ii)>maxTemp){
                    maxTemp=numbers.get(ii);
                }
                else if (numbers.get(ii)<minTemp){
                    minTemp=numbers.get(ii);
                }
                s.average= result/numbers.size();
                s.max=maxTemp;
                s.min=minTem;
            }
        }
        return s;
    }
}
