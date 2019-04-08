package utility;

import controller.EmployeeController;

import java.util.Scanner;

public class MenuUtility {
    private EmployeeController employeeController = new EmployeeController();
    private Scanner scanner = new Scanner(System.in);

    public void gennerateEmployeeMenu() {
        while (true) {
            System.out.println("------------------menu------------------");
            System.out.println("1.đăng kí nhân viên");
            System.out.println("2.đăng nhập nhân viên");
            System.out.println("3.thoát chương trình");
            String choice = scanner.nextLine();
            if ("1".equals(choice)) {
                employeeController.signUp();
            } else if ("2".equals(choice)) {
                employeeController.signIn();
            } else {
                System.out.println("lựa chọn sai vui lòng lựa chọn lại ");
            }
            if (choice == "3") {
                break;
            }

        }
    }


}
