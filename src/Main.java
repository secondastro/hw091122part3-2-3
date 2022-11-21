import Arithmetics.TaskSet;
import Passport.DataBase;
import Passport.Passport;
import PhoneBook.PhoneBook;


public class  Main {
    public static void main(String[] args) {
        TaskSet taskSet = new TaskSet();
        System.out.println(taskSet);

        Passport ivanov = new Passport(11223344, "Иванов", "Петр", "Степанович", "22/07/1996");
        Passport petrov = new Passport(11335566,"Петров", "Анастас", "14/01/1965");
        Passport sidorov = new Passport(88775566, "Сидоров", "Геннадий", "Юрьевич", "15/03/2000)");

        DataBase db = new DataBase();
        db.add(ivanov);
        db.add(petrov);
        db.add(sidorov);

        db.add(new Passport(88775566, "Викторов", "Виктор", "Анарбекович", "14/06/1999"));
        System.out.println(db);

        System.out.println(db.find(88775566));
        System.out.println(db.find(555555));

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.getPhoneList().put("Сергей Бессмертный", "89999999999");
        phoneBook.getPhoneList().put("Василий Стрельников", "89999999991");
        phoneBook.getPhoneList().put("Игорь Ложкин", "89999999992");
        phoneBook.getPhoneList().put("Раймонд Головачев", "89999999993");
        phoneBook.getPhoneList().put("Ренат Магазов", "89999999994");
        phoneBook.getPhoneList().put("Магаз Ренатов", "89999999995");
        phoneBook.getPhoneList().put("Кудайберген Тудайберген", "89999999996");
        phoneBook.getPhoneList().put("Алабама Василькова", "89999999997");
        phoneBook.getPhoneList().put("Кисловодск наАмуре", "89999999998");
        phoneBook.getPhoneList().put("Тайпси Лайтнингов", "89999999911");
        phoneBook.getPhoneList().put("Субару Импрезов", "89999999922");
        phoneBook.getPhoneList().put("Кассиопея Жижулина", "89999999933");
        phoneBook.getPhoneList().put("Ставрид Карпов", "89999999944");
        phoneBook.getPhoneList().put("Назар Балабанов", "89999999959");
        phoneBook.getPhoneList().put("Товар Лицом", "89999999956");
        phoneBook.getPhoneList().put("Александр Овечкин", "89999999988");
        phoneBook.getPhoneList().put("Кети Топурия", "89999999978");
        phoneBook.getPhoneList().put("Аскар Вафельник", "89999999945");
        phoneBook.getPhoneList().put("Жора Крыжовников", "89999999963");
        phoneBook.getPhoneList().put("Игорь Игорев", "89999999970");
        phoneBook.getPhoneList().put("Анатолий Анатооолий", "89999999905");

        System.out.println(phoneBook.getPhoneList().values());
    }

}