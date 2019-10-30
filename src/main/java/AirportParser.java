import java.util.Arrays;

public class AirportParser  {
    private String[] EMPTY = {};
    public String[] split(String data, String delimeter){
        String[] columns = {};

        columns = data.split(delimeter, 2);

        if(columns[0] == "Code")
            return EMPTY;

        return columns;
    }
}
