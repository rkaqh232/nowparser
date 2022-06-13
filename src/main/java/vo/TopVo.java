package vo;

public class TopVo {
    private int id;
    private String title;
    private String licenseOrgan;
    private String esRegdt;

    @Override
    public String toString() {
        return "TopVo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", licenseOrgan='" + licenseOrgan + '\'' +
                ", esRegdt='" + esRegdt + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLicenseOrgan() {
        return licenseOrgan;
    }

    public void setLicenseOrgan(String licenseOrgan) {
        this.licenseOrgan = licenseOrgan;
    }

    public String getEsRegdt() {
        return esRegdt;
    }

    public void setEsRegdt(String esRegdt) {
        this.esRegdt = esRegdt;
    }
}
