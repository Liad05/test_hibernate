package test_db_entities;


public class State{
    private int id;
    private String ip;
    private int port;
    private int currentTurn;
    private int lastScore;
    private String players;
    private String bag;
    private String lastTurnBoard;
    private String board;

    public int getId() {
        return id;
    }

    public String getIp() {
        return ip;
    }

    public int getPort() {
        return port;
    }

    public int getCurrentTurn() {
        return currentTurn;
    }

    public int getLastScore() {
        return lastScore;
    }

    public String getPlayers() {
        return players;
    }

    public String getBag() {
        return bag;
    }

    public String getLastTurnBoard() {
        return lastTurnBoard;
    }

    public String getBoard() {
        return board;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setCurrentTurn(int currentTurn) {
        this.currentTurn = currentTurn;
    }

    public void setLastScore(int lastScore) {
        this.lastScore = lastScore;
    }

    public void setPlayers(String players) {
        this.players = players;
    }

    public void setBag(String bag) {
        this.bag = bag;
    }

    public void setLastTurnBoard(String lastTurnBoard) {
        this.lastTurnBoard = lastTurnBoard;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String toString()
    {
        return "id: " + id + " ip: " + ip + " port: " + port + " currentTurn: " + currentTurn + " lastScore: " + lastScore + " players: " + players + " bag: " + bag + " lastTurnBoard: " + lastTurnBoard + " board: " + board;
    }
}
