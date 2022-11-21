package PhoneBook;

import java.util.HashMap;

public class PhoneBook {
    private final HashMap<String, String> phoneList = new HashMap<>();

    public HashMap<String, String> getPhoneList() {
        return phoneList;
    }
}
