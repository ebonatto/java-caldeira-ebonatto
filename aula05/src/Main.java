import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.println("Hello world!");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dateStr = "01/01/2002";
        Date dateDate = formatter.parse(dateStr);
        System.out.println(dateDate);
    }
}