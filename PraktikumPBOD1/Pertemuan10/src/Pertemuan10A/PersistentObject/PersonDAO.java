/*
 *  File        : PersonDAO.java
 *  Deskripsi   : Interface untuk person access object  
*/
package Pertemuan10A.PersistentObject;

public interface PersonDAO {
    public void savePerson(Person p) throws Exception;
}
