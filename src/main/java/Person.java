import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Person /*implements CheckPerson*/ {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public Person() {
        this.name = "";
        this.birthday = LocalDate.now();
        this.gender = null;
        this.emailAddress = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        return Period.between(birthday, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "java.Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public void printPerson() {
        System.out.println(toString());
    }

//    @Override
//    public boolean test(Person p) {
//        return p.gender == Person.Sex.FEMALE && p.getAge() >= 0 && p.getAge() <= 80;
//    }
//
//    public static String printPersons(List<Person> roster, CheckPerson tester) {
//        for (Person p : roster) {
//            if (tester.test(p)) {
//                p.printPerson();
//            }
//        }
//    }

}
