import org.w3c.dom.Text;

import java.io.IOException;
import java.util.Iterator;

import static java.sql.Types.DOUBLE;

public class Reducer extends org.apache.hadoop.mapreduce.Reducer<AirportWritableComparable, Text, Text, Text> {

    @Override
    protected void reduce(AirportWritableComparable key, Iterable<Text> values, Context context)
            throws IOException, InterruptedException {
        Iterator<Text> it = values.iterator();

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;
        int num = 0;

        String name = "";

        while (it.hasNext()){
            String s = it.next().toString();
            if(s.equals("")){
                num++;
                continue;
            }
            if(s.)
        }
    }
}
