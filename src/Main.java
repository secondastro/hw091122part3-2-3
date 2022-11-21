import Arithmetics.TaskSet;
import Passport.DataBase;
import Passport.Passport;
import PhoneBook.PhoneBook;

import java.util.Map;


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
        phoneBook.addPhone("Сергей Бессмертный", "89999999999");
        phoneBook.addPhone("Василий Стрельников", "89999999991");
        phoneBook.addPhone("Игорь Ложкин", "89999999992");
        phoneBook.addPhone("Раймонд Головачев", "89999999993");
        phoneBook.addPhone("Ренат Магазов", "89999999994");
        phoneBook.addPhone("Магаз Ренатов", "89999999995");
        phoneBook.addPhone("Кудайберген Тудайберген", "89999999996");
        phoneBook.addPhone("Алабама Василькова", "89999999997");
        phoneBook.addPhone("Кисловодск наАмуре", "89999999998");
        phoneBook.addPhone("Тайпси Лайтнингов", "89999999911");
        phoneBook.addPhone("Субару Импрезов", "89999999922");
        phoneBook.addPhone("Кассиопея Жижулина", "89999999933");
        phoneBook.addPhone("Ставрид Карпов", "89999999944");
        phoneBook.addPhone("Назар Балабанов", "89999999959");
        phoneBook.addPhone("Товар Лицом", "89999999956");
        phoneBook.addPhone("Александр Овечкин", "89999999988");
        phoneBook.addPhone("Кети Топурия", "89999999978");
        phoneBook.addPhone("Аскар Вафельник", "89999999945");
        phoneBook.addPhone("Жора Крыжовников", "89999999963");
        phoneBook.addPhone("Игорь Игорев", "89999999970");
        phoneBook.addPhone("Анатолий Анатооолий", "89999999905");

        for(Map.Entry<String,String> entry :phoneBook.getEntries()){
            System.out.printf("%s - %s%n", entry.getKey(),entry.getValue());
        }
    }

}