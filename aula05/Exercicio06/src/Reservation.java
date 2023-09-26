import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Reservation {
    private String name;
    private String place;
    private String cpf;
    private String entryDate;
    private String exitDate;
    private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(String name, String place, String cpf, String entryDate, String exitDate) {
        if (validaCPF(cpf)) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido!");
            return;
        }
        if (validDate(entryDate) && validDate(exitDate)) {
            this.entryDate = entryDate;
            this.exitDate = exitDate;
        } else {
            System.out.println("Data inválida!");
        }
        this.name = name;
        this.place = place;
    }

    public static boolean validaCPF(String cpf) {
        int total = 0;
        int tamanhoCPF = 11;
        if (cpf.length() != tamanhoCPF) {
            return false;
        }

        int n = Integer.parseInt(String.valueOf(cpf.charAt(0)));
        boolean iguais = true;
        for (int i = 1; i < tamanhoCPF; i++) {
            try {
                int digito = Integer.parseInt(String.valueOf(cpf.charAt(i)));
                if (n != digito) {
                    iguais = false;
                    i = tamanhoCPF;
                }
            } catch (NumberFormatException ex) {
                return false;
            }
        }

        if (iguais) {
            return false;
        }
        for (int i = 0; i < tamanhoCPF - 2; i++) {
            int digito = Integer.parseInt(String.valueOf(cpf.charAt(i)));
            total += (tamanhoCPF - 1 - i) * digito;
        }

        int resto = (total * 10) % 11 == 10 ? 0 : (total * 10) % 11;
        if (resto != Integer.parseInt(String.valueOf(cpf.charAt(9)))) {
            return false;
        }
        total = 0;
        for (int i = 0; i < tamanhoCPF - 1; i++) {
            int digito = Integer.parseInt(String.valueOf(cpf.charAt(i)));
            total += (tamanhoCPF - i) * digito;
        }

        resto = (total * 10) % 11 == 10 ? 0 : (total * 10) % 11;
        if (resto != Integer.parseInt(String.valueOf(cpf.charAt(10)))) {
            return false;
        }
        return true;
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

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public String getExitDate() {
        return exitDate;
    }
}
