import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Item {
    private String name;
    private String expirationDate;
    private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public Item(String name, String expirationDate) {
        if (validDate(expirationDate)) {
            this.expirationDate = expirationDate;
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isExpirated() throws ParseException {
        Date today = new Date();
        Date expDate = formatter.parse(expirationDate);
        return today.compareTo(expDate) > 0;
    }

    public static boolean validDate(String date) {
        try {
            formatter.parse(date);
        } catch (ParseException e) {
            System.out.println("Data inválida! Use dd/MM/yyyy (Ex.: 19/08/2002)");
            return false;
        }
        return true;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
}
