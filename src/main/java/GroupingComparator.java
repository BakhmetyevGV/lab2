import org.apache.hadoop.io.WritableComparator;

public class GroupingComparator extends WritableComparator {
    public GroupingComparator(){
        super(GroupingComparator.class, true);
    }

    @Override
    public int compare(){

    }
}
