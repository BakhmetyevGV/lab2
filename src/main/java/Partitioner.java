import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.lib.partition.HashPartitioner;

public class Partitioner extends HashPartitioner<AirportWritableComparable, Text> {
    @Override

    @Override
    public int getPartition(AirportWritableComparable key, Text value, int numReduceTasks) {
        return super.getPartition(key, value, numReduceTasks);
    }
}
