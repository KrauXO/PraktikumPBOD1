/*
 *  File        : Person.java
 *  Deskripsi   : Person Database Model
*/

package Pertemuan10A.PersistentObject;

public class Person {
    /* ATRIBUT */
    private int id;
    private String name;
    
    public Person(String n){
        name = n;
    }
    
    public Person(int i, String n){
        id = i;
        name = n;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
}
