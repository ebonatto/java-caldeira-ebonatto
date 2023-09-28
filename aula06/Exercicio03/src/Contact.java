public class Contact {
    private String phone;
    private String address;
    private String cityRegion;

    public Contact(String phone, String address, String cityRegion) {
        this.phone = phone;
        this.address = address;
        this.cityRegion = cityRegion;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCityRegion() {
        return cityRegion;
    }

    public void setCityRegion(String cityRegion) {
        this.cityRegion = cityRegion;
    }

    @Override
    public String toString() {
        return String.format("Telefone: %s\n" +
                "Endereço: %s\n" +
                "Região da cidade: %s\n",
                this.getPhone(), this.getAddress(), this.getCityRegion());
    }
}
