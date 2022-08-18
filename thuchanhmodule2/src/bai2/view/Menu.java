package bai2.view;

import bai2.model.PhoneBook;
import bai2.sevices.PhoneBookServices;
import bai2.utils.AppUtils;

public class Menu {
    public static void run() {
        PhoneBookView phoneBookView = new PhoneBookView();
        System.out.println();
        System.out.println("---- CHƯƠNG TRÌNH QUẢN LÍ DANH BẠ ----");
        System.out.println("Chọn chức năng theo số (để tiếp tục)");
        System.out.println("1. Xem danh sách ");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi từ file");
        System.out.println("8. Thoát");
        int choose = AppUtils.retryChoose(1, 8);
        switch (choose) {
            case 1:
                PhoneBookView.showPhoneBookList();
                break;
            case 2:
                PhoneBookView.addPhoneBook();
                break;
            case 3:
                PhoneBookView.updatePhoneBook();
                break;
            case 4:
                PhoneBookView.removePhoneBook();
                break;
            case 5:
                PhoneBookView.searchPhoneBook();
            case 6:
                AppUtils.exit();
                break;
        }
    }
}
