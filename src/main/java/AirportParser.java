import java.util.Arrays;

public class AirportParser  {
    private String[] EMPTY = {};
    private String[] split(String data, String delimeter){
        String[] columns = {};

        columns = data.split(delimeter, 2);

        if(columns[0].equals("Code"))
            return EMPTY;

        return columns;
    }

    private String[] removeQuotes(String[] data){
        for(int i = 0; i < data.length; i++){
            data[i] = data[i].replaceAll("\"", "");
        }

        return data;
    }
}
