import java.text.ParseException;

public class Task {
    String title;
    String date;
    String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
