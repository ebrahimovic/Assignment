package dto;

public class UserDTO {
    

    private int userId;
    private String userNameString;
    private String userEmail;
    private String userPassword;
    private int userAge;




    public UserDTO(String userNameString, String userEmail, String userPassword, int userAge) {
        this.userNameString = userNameString;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userAge = userAge;
    }

    public UserDTO(){
        this.userNameString = "Ali";
        this.userEmail = "Ali@gmail.com";
        this.userPassword = "User";
        this.userAge = 69 ;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserNameString() {
        return userNameString;
    }
    public void setUserNameString(String userNameString) {
        this.userNameString = userNameString;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public int getUserAge() {
        return userAge;
    }
    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public boolean isUserAdult(int userAge){
        if(userAge>18){
            return true;
        }
        {
            return false;
        }
    }

    public void getUserInfo(){
        System.out.println("User name is : "+ this.getUserNameString() +" additionally user email is : "+ this.getUserEmail()+ " and the user is an adult : "+ this.isUserAdult(userAge));
    }
}
