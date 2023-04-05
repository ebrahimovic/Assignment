package dao;

import java.util.List;

import dto.UserDTO;

public interface UserDao {

    public static final String URL ="jdbc:mysql://127.0.0.1:3306/usermanagmant";
    public static final String USER = "root";
    public static final String PASSWORD = "1234";
    
    public void insert(UserDTO user);

    public void update(UserDTO user);

    public void delete(int id);

    // public void getUSerById(int id);

    public List<UserDTO> getUserList();

    // public UserDTO getUserByEmailAndPassword(String email, String password);

}
 