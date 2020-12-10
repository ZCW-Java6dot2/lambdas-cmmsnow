import java.util.ArrayList;
import java.util.List;

public class SocialNetworks {
    List<Person> network;

    public SocialNetworks(){
        this.network = new ArrayList<>();
    }

    public List<Person> getNetwork(){
        return network;
    }

    public void add(Person p){
        network.add(p);
    }

    public static class Search implements CheckPerson{

        public static void printPersons(List<Person> roster, CheckPerson tester) {
            for (Person p : roster) {
                if (tester.test(p)) {
                    p.printPerson();
                }
            }
        }

        @Override
        public boolean test(Person p) {
            return p.gender == Person.Sex.FEMALE && p.getAge() >= 0 && p.getAge() <= 80;
        }


    }
}
