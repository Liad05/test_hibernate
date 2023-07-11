package WebServices;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import test_db_entities.State;
import test_db_managers.StateManager;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


@Path("/game")
public class GameStateResource {
    private StateManager stateManager;

    public GameStateResource(StateManager stateManager) {
        this.stateManager = stateManager;
    }

    @GET
    @Path("/{ip}/{port}")
    @Produces("text/plain")
    public String getGameState(@PathParam("ip") String ip, @PathParam("port") int port) {
        // Implement logic to retrieve game state by IP and port
        // Use stateanager to load the state from the database based on the IP and port
        State state = stateManager.getGameStateByIpAndPort(ip, port);
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
//        String gameIp = "\"127.0.0.1\"";

        String gameIp = ip;
        int gamePort = port;
        Query query1 = session.createQuery(String.format("from State where ip  = \"%s\" and port = \"%d\"", gameIp, gamePort));
        List<State> list1 = query1.list();
        if (state == null) {
            // If the state is not found, return a response with a 404 status
            return "no";
        } else {
            // If the state is found, return the game state as JSON in the response
            return "okay";
        }
    }

}
