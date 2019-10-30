import java.util.Arrays;

public class FlightParser  {
    private String[] EMPTY = {};
    private int DELAY = 18;
    private int CANCEL = 19;

    public String[] parse(String data, String delimeter){
        return removeQuotes(split(data, delimeter));
    }

    private String[] split(String data, String delimeter){
        String[] columns = {};

        columns = data.split(delimeter);

        if(columns[0].equals("\"YEAR\"")  || columns[DELAY].equals("0.00") || columns[CANCEL].equals("1.00"))
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
