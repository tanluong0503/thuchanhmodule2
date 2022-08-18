package bai2.model;

public class PhoneBook {
    private String fullName;
    private String phone;
    private String group;
    private String sex;
    private String address;
    private String email;

    public PhoneBook() {
    }

    public PhoneBook(String fullName, String phone, String group, String sex, String address, String email) {
        this.fullName = fullName;
        this.phone = phone;
        this.group = group;
        this.sex = sex;
        this.address = address;
        this.email = email;
    }



    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    @Override
    public String toString() {
        return "PhoneBook{" +
                "fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                ", group='" + group + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
