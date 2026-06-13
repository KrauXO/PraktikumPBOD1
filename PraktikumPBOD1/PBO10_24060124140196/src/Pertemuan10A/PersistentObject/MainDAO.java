/*
 *  File        : MainDAO.java
 *  Deskripsi   : Main program utuk akses DAO
*/

package Pertemuan10A.PersistentObject;

public class MainDAO {
    public static void main(String args[]){
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        
        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
