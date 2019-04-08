package entity;

public class
Employee {
    private String name;
    private  String address;
    private  String  email;
    private  String account;
    private  String password;
    private  String created_at;
    private  String  updateed_at;
    private  String status;


    public Employee() {
    }

    public Employee(String name, String address, String email, String account, String password) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.account = account;
        this.password = password;
    }

    public Employee(String name, String address, String email, String account, String password, String created_at, String updateed_at, String status) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.account = account;
        this.password = password;
        this.created_at = created_at;
        this.updateed_at = updateed_at;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdateed_at() {
        return updateed_at;
    }

    public void setUpdateed_at(String updateed_at) {
        this.updateed_at = updateed_at;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
