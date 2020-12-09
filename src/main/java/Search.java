import java.util.List;

public class Search implements CheckPerson{

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        roster.stream().filter(p -> tester.test(p)).forEach(p -> p.printPerson());
    }


    @Override
    public boolean test(Person p) {
        return p.gender == Person.Sex.FEMALE && p.getAge() >= 0 && p.getAge() <= 80;
    }


}
