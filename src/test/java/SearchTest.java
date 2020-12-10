import org.junit.Test;

public class SearchTest {
    SocialNetworks network = new SocialNetworks();
    SocialNetworks.Search search = new SocialNetworks.Search();

    @Test
    public void searchTest(){
        SocialNetworks.Search.printPersons(network.getNetwork(), search);
    }
}
