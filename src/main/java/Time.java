
import java.io.IOException; 
import java.util.StringTokenizer; 
 
import org.apache.hadoop.conf.Configuration; 
import org.apache.hadoop.fs.Path; 
import org.apache.hadoop.io.IntWritable; 
import org.apache.hadoop.io.LongWritable; 
import org.apache.hadoop.io.Text; 
import org.apache.hadoop.mapreduce.Job; 
import org.apache.hadoop.mapreduce.Mapper; 
import org.apache.hadoop.mapreduce.Reducer; 
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class Time {
    public static void main(String[] args) throws Exception { 
        Job job = Job.getInstance();

        MultipleInputs.addInputPath(job, new Path("664600583_T_ONTIME_sample.csv"),
                TextInputFormat.class, FlightMapper.class);

        MultipleInputs.addInputPath(job, new Path("664600583_T_ONTIME_sample.csv"),
                TextInputFormat.class, FlightMapper.class);
    } 
}
