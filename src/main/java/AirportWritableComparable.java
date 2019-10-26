import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirportWritableComparable implements WritableComparable<AirportWritableComparable> {
    public int airportID;
    public int key;

    public AirportWritableComparable(int airportID, int key){
        this.airportID = airportID;
        this.key = key;
    }

    @Override
    public int compareTo(AirportWritableComparable airportWritableComparable) {
        return 0;
    }

    @Override
    public void write(DataOutput dataOutput) throws IOException {

    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {

    }
}
