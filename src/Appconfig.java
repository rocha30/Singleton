
public class Appconfig {

    private String serverUrl;
    private  int port;
    private String name;
    private  int id;

    private static  Appconfig instance;

    private Appconfig (){

    }

    public static synchronized Appconfig getInstance(){
        if (instance == null ){
            instance = new Appconfig();
        }
        return instance;
    }

    public String getServerUrl(){
        return serverUrl;
    }

    public void setServerUrl(String serverUrl){
        this.serverUrl = serverUrl;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
