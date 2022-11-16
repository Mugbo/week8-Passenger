package ie.atu.Passenger;

import lombok.AllArgsConstructor;

import java.math.BigInteger;
import java.util.ArrayList;

public class Passenger {

    private String Title;
    private String Name;
    private String ID;
    private String Phone;
    private int Age;

    public Passenger(String Title, String Name,String ID, String Phone , int Age){
        this.Title = Title;
        this.Name = Name;
        this.ID = ID;
        this.Phone = Phone;
        this.Age = Age;
    }
    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {

        if(title == "Mr" || title == "Ms" || title == "Mrs"){
            Title = title;
        }
        else{
            throw new IllegalArgumentException("Title must be Mr, Mrs or Ms.");
        }

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        int nameStringSize = name.length();

        if( nameStringSize  >= 3  ){
            Name = name;
        }
        else{
            throw new IllegalArgumentException("Name has to be a minimum of 3 characters.");
        }
    }

    public String getID() {
        return ID;
    }

    public void setID(String id) {
        int idStringSize = id.length();

        if( idStringSize  >= 10  ){
            ID = id;
        }
        else{
            throw new IllegalArgumentException("ID has to be a minimum of 10 characters.");
        }
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        int phoneStringSize = phone.length();

        if( phoneStringSize  >= 7 ){
            Phone = phone;
        }
        else{
            throw new IllegalArgumentException("Phone number has to be a minimum of 7 numbers.");
        }
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        if(age > 16){
            Age =   age;
        }
        else{
            throw new IllegalArgumentException("Passengers must be over 16 years old to fly.");
        }
    }
}
