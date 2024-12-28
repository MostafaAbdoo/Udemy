package Account;

public abstract class Account {
    String email,userName,password,firstName,lastName;
    int age; Subscribtion subscribtion;
    Account(String email,String userName,String password,String firstName, String lastName, int age, Subscribtion subscribtion){
        this.age=age;
        this.email=email;
        this.firstName=firstName;
        this.lastName=lastName;
        this.userName=userName;
        this.password=password;
        this.subscribtion=subscribtion;
    }
    abstract void editInfo(Account account);
    abstract String getEmail();
    abstract String getUserName();
    abstract String getName();
    abstract String getPassword();
    abstract Subscribtion getSubscribtion();
}
