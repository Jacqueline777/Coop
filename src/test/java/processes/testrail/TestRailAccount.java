package processes.testrail;


import java.util.Properties;


public class TestRailAccount {
    public static APIClient testRailApiClient() {

        Properties prop = new Properties();
//        Properties passProp = getPassProperties();

        String baseUrl = "https://imstechlabs.testrail.io/";

        String usernameTestRail = "jkamadi@imsglobalventures.com";
        String passwordTestRail = "g9TUzwR6cKjFM8aQhnIo-R8x7cXqhi63JGdXOgVVx";

        APIClient client = new APIClient(baseUrl);
        client.setUser(usernameTestRail);
        client.setPassword(passwordTestRail);

        return client;
    }
}
