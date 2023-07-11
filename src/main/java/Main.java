import WebServices.GameStateResource;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.server.ResourceConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import test_db_entities.State;
import test_db_managers.StateManager;
import javax.ws.rs.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // save state example

//        State testState = new State();
//        testState.setIp("127.0.0.1");
//        testState.setPort(9000);
//        testState.setCurrentTurn(0);
//        testState.setLastScore(0);
//        testState.setPlayers("0:0;Y;R;V;A;N;S;M,1:18;L;S;T;X;Q;L;D,");
//        testState.setBag("AAAAAAAABBCCDDDEEEEEEEEEEEEFFGGGHHIIIIIIIIIKLLMNNNNNOOOOOOOOPPRRRRRSSTTTTUUUUVWWYZ");
//        testState.setLastTurnBoard("__________________________________________________________");
//        testState.setBoard("___________________________________________________A______");
//        StateManager stateManager = new StateManager(new Configuration().configure().buildSessionFactory().openSession());
//        stateManager.saveState(testState);

        // update state example


//        State testState = new State();
//        testState.setIp("127.0.0.1");
//        testState.setPort(5000);
//        testState.setCurrentTurn(1); // Updated value
//        testState.setLastScore(100); // Updated value
//        testState.setPlayers("0:0;Y;R;V;A;N;S;M,1:18;L;S;T;X;Q;L;D,");
//        testState.setBag("AAAAAAAABBCCDDDEEEEEEEEEEEEFFGGGHHIIIIIIIIIKLLMNNNNNOOOOOOOOPPRRRRRSSTTTTUUUUVWWYZ");
//        testState.setLastTurnBoard("__________________________________________________________");
//        testState.setBoard("___________________________________________________A______");

//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        String gameIp = "\"127.0.0.1\"";
//
//        String gameIp = "127.0.0.1";
//        int gamePort = 10000;
//        Query query1 = session.createQuery(String.format("from State where ip  = \"%s\" and port = \"%d\"", gameIp, gamePort));
//        List<State> list1 = query1.list();
//        list1.forEach(System.out::println);
//        State testState = list1.get(0);

//        StateManager stateManager = new StateManager(session);
//
//        State testState = stateManager.getGameStateByIpAndPort(gameIp,gamePort);
//        testState.setBoard("___________________________________________________A______");
////        list1.forEach(System.out::println);
//        stateManager.updateState(testState);
//        System.out.println(testState);
//        // Register the resource class with Jersey
//        ResourceConfig resourceConfig = new ResourceConfig();
//        resourceConfig.register(new GameStateResource(stateManager));

        // Start the Jersey server
//        URI baseUri = UriBuilder.fromUri("http://localhost/").port(8080).build();
//        HttpServer server = JdkHttpServerFactory.createHttpServer(baseUri, resourceConfig);

//        System.out.println("Jersey server started at " + baseUri);


        // load state exmaple
//        sessionFactory = new Configuration().configure().buildSessionFactory();
//        session = sessionFactory.openSession();
//        Query query = session.createQuery("from State");
//        List<State> list = query.list();
//        list.forEach(System.out::println);


        // GET request
        URL url = null;
        try {
            url = new URL("http://example.com");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
        } catch (Exception e) {
          throw new RuntimeException(e);
        }

//
//        // Check the response status
//        int statusCode = response.getStatus();
//        if (statusCode == Response.Status.OK.getStatusCode()) {
//            // Request succeeded, retrieve the response entity
//            String responseBody = response.readEntity(String.class);
//            System.out.println("Response: " + responseBody);
//        } else {
//            // Request failed, handle the error
//            System.out.println("Request failed with status: " + statusCode);
//        }
//
//        // Close the client
//        client.close();
    }
}


