package ProblemSet_7c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentTracker {
    private ArrayList<Student> studentList;
    private HashMap<Integer, ArrayList<Module>> moduleList;

    public StudentTracker() {
        studentList = new ArrayList<>();
        moduleList = new HashMap<>();
    }

    public void addStudent(Student student, List<Module> modules) {
        ArrayList<Module> studentModules = new ArrayList<>(modules);
        studentList.add(student);
        for (Module module : studentModules) {
            student.addModuleList(module);
        }
        moduleList.put(student.getUrn(), studentModules);
    }

    public String printStudents() {
        StringBuilder sb = new StringBuilder();

        for (Student student : studentList) {
            sb.append(student.getName())
              .append("(")
              .append(student.getUrn())
              .append(")\n");
        }

        return sb.toString();
    }

    public String printModules(int urn) {
        StringBuilder sb = new StringBuilder();

        sb.append("URN ").append(urn).append(" is enrolled in:\n");

        if (moduleList.containsKey(urn)) {
            ArrayList<Module> modules = moduleList.get(urn);

            for (int i = 0; i < modules.size(); i++) {
                sb.append(modules.get(i).getName());
                if (i < modules.size() - 1) {
                    sb.append(", ");
                }
            }
        }
        return sb.toString();
    }
}
