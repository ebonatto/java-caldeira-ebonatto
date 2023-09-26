public class Print {
    private String name;
    private int pages;

    public Print(String name, int pages) {
        if (!setPages(pages)) {
            return;
        };
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public boolean setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
            return true;
        } else {
            System.out.println("Número de páginas inválido!");
            return false;
        }
    }
}
