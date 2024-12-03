package ProblemSet_7a;

public class Module {
    private String name;

    public Module(String name) {
        this.name = name;
    }

    public String getName() {
        if (!name.matches("[C,O,M]{3}[0-9]{4}$")) {
            return "Error";
        } else {
            return name;
        }
    }
}
