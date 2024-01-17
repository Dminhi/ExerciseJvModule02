package students;

public class students {
    private String name = "john";
    private String classe = "C02";

    public students() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
        return "students{" +
                "name='" + name + '\'' +
                ", classe='" + classe + '\'' +
                '}';
    }
}
