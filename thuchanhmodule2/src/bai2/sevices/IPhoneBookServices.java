package bai2.sevices;

import bai2.model.PhoneBook;

import java.util.List;

public interface IPhoneBookServices {
    List <PhoneBook> findAll();
    void add (PhoneBook newPhoneBook);
    void edit (PhoneBook afterPhoneBook);

    void removeByPhone (String phone);

    boolean existsPhone(String phone);

    PhoneBook getByPhone(String phone);
}
