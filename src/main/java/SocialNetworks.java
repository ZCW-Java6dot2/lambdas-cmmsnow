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
}
