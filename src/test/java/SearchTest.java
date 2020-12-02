import org.junit.Test;

public class SearchTest {
    SocialNetworks network = new SocialNetworks();
    Search search = new Search();

    @Test
    public void searchTest(){
        Search.printPersons(network.getNetwork(), search);
    }
}
