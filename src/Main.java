import Arithmetics.TaskSet;
import Passport.DataBase;
import Passport.Passport;



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


    }

}