package ProblemSet_7b;

import java.util.ArrayList;

public class Student {
    private String name;
    private String urn;
    private ArrayList<Module> moduleList;

    public Student(String name, String urn) {
        this.name = name;
        this.urn = urn;
        this.moduleList = new ArrayList<>();
    }

    public void addModuleList(Module module) {
        moduleList.add(module);
    }

    public String printModules() {
        StringBuilder moduleString = new StringBuilder();
        for (int i = 0; i < moduleList.size(); i++) {
            if (moduleList.get(i) != null) {
                if (i == 0) {
                    moduleString.append(moduleList.get(i));
                } else {
                    moduleString.append(", ").append(moduleList.get(i));
                }
            }
        }
        return moduleString.toString();
    }

    public String getName() {
        if (!name.matches("^[A-Z][a-z]+\\s[A-Z][a-z]+$")) {
            return "Error";
        } else {
            return name;
        }
    }

    public int getUrn() {
        if (!urn.matches("^\\d{5}$")) {
            return 0;
        } else {
            return Integer.parseInt(urn);
        }
    }
}
