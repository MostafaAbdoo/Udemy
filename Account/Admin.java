package Account;

public class Admin extends Account {
    String email,userName,password,firstName,lastName;
    int age; Subscribtion subscribtion;
     Admin(String email, String userName, String password, String firstName, String lastName, int age, Subscribtion subscribtion){
        super(email, userName, password,firstName, lastName,  age,  subscribtion);
    }
    @Override
    void editInfo(Account account){

    }
    String getName(){
         return firstName+" "+lastName;
    }
    String getPassword(){
         return password;
    }
    String getUserName(){
         return userName;
    }
    Subscribtion getSubscribtion(){
         return subscribtion;
    }
    String getEmail(){
         return email;
    }
}
