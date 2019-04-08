package controller;

import entity.Employee;
import model.EmployeeModel;

import java.util.EventListener;
import java.util.Scanner;

public class EmployeeController {
    private EmployeeModel employeeModel = new EmployeeModel();
    private Scanner scanner = new Scanner(System.in);

    public void signUp() {


        while (true) {
            System.out.println("nhập tên  ");
            String name = scanner.nextLine();
            System.out.println("nhập tên tài khoản ");
            String account = scanner.nextLine();
            System.out.println("nhập mật khẩu ");
            String password = scanner.nextLine();
            System.out.println("nhập địa chỉ ");
            String address = scanner.nextLine();
            System.out.println("nhập email");
            String email = scanner.nextLine();

            if (employeeModel.checkExistAccount(account)) {
                System.out.println("tên tài khoản đã tồn tại vui lòng nhập lại ");
            } else {
                Employee employee = new Employee(name, address, email, account, password);
                employeeModel.register(employee);
                break;
            }
        }


    }

    public void signIn() {
        System.out.println("nhập tài khoản");
        String account = scanner.nextLine();
        System.out.println("nhập password");
        String passwourd = scanner.nextLine();
        Employee employee = employeeModel.login(account, passwourd);
        if (employee == null) {
            System.out.println("sai thông tin tài khoản ");
        } else {
            System.out.println("tên :" + employee.getName());
            System.out.println("điachi :" + employee.getAddress());
            System.out.println("tàikhoan :" + employee.getAccount());
            System.out.println("password :" + employee.getPassword());
            System.out.println("email :" + employee.getEmail());
            System.out.println("ngay tạo :" + employee.getCreated_at());
        }


    }


}
