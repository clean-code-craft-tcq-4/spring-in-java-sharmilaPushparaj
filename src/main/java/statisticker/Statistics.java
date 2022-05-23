package statisticker;

import java.util.List;

public class Statistics 
{
    public class Stats {
        float average=Float.NaN;
        float max=Float.NaN;
        float min=Float.NaN;
    }
    public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
        Statistics statistics = new Statistics();
        Statistics.Stats s= statistics.new Stats();
        s.average=Float.NaN;
        s.max=Float.NaN;
        s.min=Float.NaN;
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
                s.min=minTemp;
            }
        }
        return s;
    }
}
