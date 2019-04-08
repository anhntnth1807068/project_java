package model;

import entity.Employee;

import java.sql.*;

public class
EmployeeModel {
    private Connection connection;

    private void initConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/human_resource?user=root&password=");
        }
    }

    public boolean register(Employee emp) {
        try {
            initConnection();
            PreparedStatement stt = connection.prepareStatement
                    ("insert into  employees(name ,address,email,account,password) value (?,?,?,?,?)");
            stt.setString(1, emp.getName());
            stt.setString(2, emp.getAddress());
            stt.setString(3, emp.getEmail());
            stt.setString(4, emp.getAccount());
            stt.setString(5, emp.getPassword());
            stt.execute();
            System.out.println("Đăng kí thành công!");
            return true;
        } catch (SQLException e) {
            System.out.println("có lỗi xảy ra vui lòng nhập lại . error" + e.getMessage());
            return false;
        }

    }

    public boolean checkExistAccount(String account){
        try {
            initConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select *from employees where account=?");
            preparedStatement.setString(1, account);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public Employee login(String account, String password){
        try {
            initConnection();
            PreparedStatement preparedStatement =connection.prepareStatement
                    ("select *from employees where account =? and password=?");
            preparedStatement.setString(1,account);
            preparedStatement.setString(2,password);
            ResultSet resultSet =preparedStatement.executeQuery();
            if (resultSet.next()){
              String name = resultSet.getString(1);
              String address = resultSet.getString(2);
              String email = resultSet.getString(3);
              String acount = resultSet.getString(4);
              String pass =resultSet.getString(5);
              String created =resultSet.getString(6);
              String update =resultSet.getString(7);
              String status =resultSet.getString(8);
              Employee employee =new Employee(name,address,email,acount,pass,created,update,status);
              return employee;
            }
        } catch (SQLException e) {
            System.out.println("có lỗi xảy ra  . Vui lòng thử lại. Error:"+e.getMessage());

        }
        return null;
    }
}
