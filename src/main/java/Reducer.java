import org.w3c.dom.Text;

import java.io.IOException;

public class Reducer extends org.apache.hadoop.mapreduce.Reducer<AirportWritableComparable, Text, Text, Text> {
    @Override
    protected void reduce(AirportWritableComparable key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        super.reduce(key, values, context);
    }

    @Override
    public static void reduce(){

    }


}
