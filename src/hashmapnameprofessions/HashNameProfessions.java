package hashmapnameprofessions;

/*
Given the following table of Names - Professions, implement a class that allows me to get the profession of a person using his name. Use the best possible data structure for the implementation.
Implementation:

HashMap was used to solve this exercise. Implement the class People and call the method findPerson(String name) which receives an String as parameter indicating the Name of the person whose profession you want to find. This method returns a String with the profession found or "Person not found." otherwise.
 */

public class HashNameProfessions {
    public static void main(String[] args){
        People p = new People();
        try{
            String name = args[0];
            String message = p.findPerson(name);
            System.out.println(message);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid parameter.");
        }
    }
}
