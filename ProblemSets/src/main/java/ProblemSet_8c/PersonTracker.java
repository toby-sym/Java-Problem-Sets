package ProblemSet_8c;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PersonTracker
{
    private ArrayList<Person> peopleList;

    public PersonTracker()
    {
        peopleList = new ArrayList<>();
    }

    public String readTextFile(String filePath) {
        StringBuilder result = new StringBuilder();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                String forename = parts[0];
                String surname = parts[1];
                int age = Integer.parseInt(parts[2]);
                
                addPerson(forename, surname, age);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    public void addPerson(String forename, String surname, int age)
    {
        Person person = new Person(forename, surname, age);
        peopleList.add(person);
    }

    public String displayList()
    {
        StringBuilder result = new StringBuilder();
        for (Person person : peopleList)
        {
            result.append(person.getForename() + " " + person.getSurname() + " (" + person.getAge() + ")\n");
        }
        return result.toString();
    }
    
    public String getPeopleList()
    {
        StringBuilder result = new StringBuilder();
        
        if (peopleList.size() == 0)
        {
            return "[]";
        }
        
        for (int i = 0; i < peopleList.size(); i++)
        {
            result.append("[" + peopleList.get(i) + "]");
        }
        return result.toString();
    }
}
