package hashmapnameprofessions;

import java.util.HashMap;

public class People {

    private HashMap<String, String> people;

    public People(){
        people = new HashMap<String, String>();
        people.put("Maria","Engineer");
        people.put("Jorge","Doctor");
        people.put("Federico","Accountant");
        people.put("Joseph","Lawyer");
    }

    public String findPerson(String name){
        if(people.containsKey(name)){
            String profession = people.get(name);
            return profession;
        }else{
            return "Person not found.";

        }
    }
}
