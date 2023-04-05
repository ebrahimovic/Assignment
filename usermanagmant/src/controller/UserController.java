package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import dao.UserDao;
import dto.UserDTO;

public class UserController implements UserDao {

    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    private static final String INSERT = "INSERT INTO user_table(userName, userEmail, userPassword, userAge) VALUES(?, ?, ?, ?)";
    private static final String UPDATE = "UPDATE  user_table userName =?, userEmail=?, userPassword=?, userAge=? WHERE USERID =?";
    private static final String DELETE ="DELETE FROM user_table WHERE USERID =?";

    public UserController(){
        try{
            connection = DriverManager.getConnection(UserDao.URL, UserDao.USER, UserDao.PASSWORD);
            System.out.println("database connnected");
        }catch(SQLException e){
            System.out.println("Unable to connect");
            e.printStackTrace();

        }
    }
    @Override
    public void insert(UserDTO user){
        int rowAffected =0;
        try{
            preparedStatement = connection.prepareStatement(INSERT);
            preparedStatement.setString(1, user.getUserNameString());
            preparedStatement.setString(2, user.getUserEmail());
            preparedStatement.setString(3, user.getUserPassword());
            preparedStatement.setInt(4, user.getUserAge());

            preparedStatement.executeUpdate();

        }catch(SQLException e){
 
            System.out.println("unable to inseert data");
            e.printStackTrace();
        } finally{
            try{
                preparedStatement.close();
            } catch (SQLException e){
                System.out.println("unable to close the statement");
            e.printStackTrace();
            }
        }
        if (rowAffected > 0){
            System.out.println("insert was succesful");
        }

    }

    
    @Override
    public void update(UserDTO user){
        int rowAffected =0;
        try{
            preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setString(1, user.getUserNameString());
            preparedStatement.setString(2, user.getUserEmail());
            preparedStatement.setString(3, user.getUserPassword());
            preparedStatement.setInt(4, user.getUserAge());
            preparedStatement.setInt(4, user.getUserId());

            preparedStatement.executeUpdate();

        }catch(SQLException e){
 
            System.out.println("unable to inseert data");
            e.printStackTrace();
        } finally{
            try{
                preparedStatement.close();
            } catch (SQLException e){
                System.out.println("unable to close the statement");
            e.printStackTrace();
            }
        }
        if (rowAffected > 0){
            System.out.println("insert was succesful");
        }
    

    }
    @Override
    public void delete(int id){
        int rowAffected =0;
        try{
            preparedStatement = connection.prepareStatement(DELETE);
            preparedStatement.setInt(0, id);


            preparedStatement.executeUpdate();

        }catch(SQLException e){
 
            System.out.println("unable to inseert data");
            e.printStackTrace();
        } finally{
            try{
                preparedStatement.close();
            } catch (SQLException e){
                System.out.println("unable to close the statement");
            e.printStackTrace();
            }
        }
        if (rowAffected > 0){
            System.out.println("insert was succesful");
        }
    

    }

    @Override
    public List<UserDTO> getUserList(){
        List<UserDTO> userList = new LinkedList<>();
       
        try{
            preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setString(1, user.getUserNameString());
            preparedStatement.setString(2, user.getUserEmail());
            preparedStatement.setString(3, user.getUserPassword());
            preparedStatement.setInt(4, user.getUserAge());
            preparedStatement.setInt(4, user.getUserId());

            preparedStatement.executeUpdate();

        }catch(SQLException e){
 
            System.out.println("unable to inseert data");
            e.printStackTrace();
        } finally{
            try{
                preparedStatement.close();
            } catch (SQLException e){
                System.out.println("unable to close the statement");
            e.printStackTrace();
            }
        }
        if (rowAffected > 0){
            System.out.println("insert was succesful");
        }
    

    }


   
}
