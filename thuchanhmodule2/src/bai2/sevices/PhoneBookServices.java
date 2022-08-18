package bai2.sevices;

import bai2.model.PhoneBook;
import bai2.utils.CSVUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PhoneBookServices implements IPhoneBookServices {

    public final static String PATH = "data\\PhoneBook.csv";


    @Override
    public List<PhoneBook> findAll() {
        List<String> records = CSVUtils.read(PATH);
        List<PhoneBook> phoneBooks = new ArrayList<>();
        for (String record : records) {
        }
        return phoneBooks;
    }

    @Override
    public void add(PhoneBook newPhoneBook) {
        newPhoneBook.setPhone(newPhoneBook.getPhone());
        List<PhoneBook> students = findAll();
        students.add(newPhoneBook);
        CSVUtils.write(PATH, students);
    }

    @Override
    public void edit(PhoneBook afterPhoneBook) {
        List<PhoneBook> phoneBooks = findAll();
        for (PhoneBook phoneBook : phoneBooks) {
            String name = afterPhoneBook.getFullName();
            if (name != null && !name.isEmpty()) {
                phoneBook.setFullName(name);
            }
            String phone = afterPhoneBook.getPhone();
            if (phone != "0") {
                phoneBook.setPhone(phone);
            }
            String group = afterPhoneBook.getGroup();
            phoneBook.setGroup(group);
            String sex = afterPhoneBook.getSex();
            phoneBook.setSex(sex);
            String address = afterPhoneBook.getAddress();
            phoneBook.setAddress(address);
            String email = afterPhoneBook.getEmail();
            phoneBook.setEmail(email);
        }

    }

    @Override
    public void removeByPhone(String phone) {
        List<PhoneBook> students = findAll();
        students.removeIf(new Predicate<PhoneBook>() {
            @Override
            public boolean test(PhoneBook student) {
                return student.getPhone() == phone;
            }
        });
        CSVUtils.write(PATH, students);
    }

    @Override
    public boolean existsPhone(String phone) {
        List<PhoneBook> students = findAll();
        for (PhoneBook student : students) {
            if (student.getPhone() == phone) {
                return true;
            }
        }
        return false;
    }

    @Override
    public PhoneBook getByPhone(String phone) {
        for (PhoneBook student : findAll()) {
            if (student.getPhone() == phone)
                return student;
        }
        return null;
    }
}
