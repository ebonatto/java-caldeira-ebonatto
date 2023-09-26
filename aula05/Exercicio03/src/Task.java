import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Task {
    public String title;
    public String date;
    public String description;
    private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public Task(String title, String date, String description) {
        if (validDate(date)) {
            this.date = date;
        }
        this.title = title;
        this.description = description;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        if (validDate(date)) {
            this.date = date;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
