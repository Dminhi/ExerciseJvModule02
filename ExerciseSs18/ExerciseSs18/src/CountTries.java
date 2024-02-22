public class CountTries {
    int ID;
    String code,name;

    public CountTries() {
    }

    public CountTries(int ID, String code, String name) {
        this.ID = ID;
        this.code = code;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CountTries[" +
                "ID=" + ID +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ']';
    }
}
