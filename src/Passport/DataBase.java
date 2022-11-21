package Passport;

import java.util.HashSet;
import java.util.Set;

public class DataBase {

    private final Set<Passport> dataBase = new HashSet<>();

    public Passport find(int number) {
        for (Passport passport : dataBase) {
            if (passport.getNumber() == number) {
                return passport;
            }
        }
        return null;
    }

    public void add(Passport passport) {
//        this.dataBase.add(passport);
        boolean b = false;
        for (Passport passport1 : dataBase) {
            if (passport1.getNumber()== passport.getNumber()) {
                passport1.setFirstname(passport.getFirstname());
                passport1.setLastname(passport.getLastname());
                passport1.setSurname(passport.getSurname());
                passport1.setBirthDate(passport.getBirthDate());
                b = true;
            }
        }
        if (!b) {
            dataBase.add(passport);
        }
    }

    public Set<Passport> getDataBase() {
        return dataBase;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "dataBase=" + dataBase +
                '}';
    }
}
