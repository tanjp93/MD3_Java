package XayDunLopChiGhiTrongJava;

public  class AccessModifier {
    private  String name;
private String classes;

    public AccessModifier() {
        name = "John";
        classes = "CO2";
    }
    public AccessModifier(String fullname, String className) {
        name = fullname;
        classes = className;
    }

    public  String getName() {
        return name;
    }

    public void setName(String fullname) {
        name = fullname;
    }

    public  String getClasses() {
        return classes;
    }

    public void setClasses(String className) {
        classes = className;
    }
}
