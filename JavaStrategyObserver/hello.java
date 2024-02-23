import java.util.ArrayList;
import java.util.List;

public class hello {

	public static void main(String[] args) {
	
 /**
  * Clase que representa a un usuario.
  */
	public class User {
		public String name;
		public double money;

    /**
     * Constructor para la clase User.
     * @param name Nombre del usuario.
     * @param money Dinero del usuario.
     */
    public User(String name, double money) {
        this.name = name;
        this.money = money;
    }

    /**
     * Obtiene el nombre del usuario.
     * @return Nombre del usuario.
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene el dinero del usuario.
     * @return Dinero del usuario.
     */
    public double getMoney() {
        return money;
    }

    /**
     * Establece el dinero del usuario.
     * @param money Nuevo dinero del usuario.
     */
    public void setMoney(double money) {
        this.money = money;
    }
}

 /**
 * Clase que representa una plataforma de streaming.
 */
	public class Platform {
		String name;
		List<String> recommendations;
		StrategyMethods strategy;

    /**
     * Constructor para la clase Platform.
     * @param name     Nombre de la plataforma.
     * @param strategy Estrategia de la plataforma.
     */
    public Platform(String name, StrategyMethods strategy) {
        this.name = name;
        this.recommendations = new ArrayList<>();
        this.strategy = strategy;
    }

    /**
     * Añade recomendaciones a la plataforma.
     * @param recommendations Lista de recomendaciones.
     */
    public void addRecommendations(List<String> recommendations) {
        this.recommendations.addAll(recommendations);
    }

    /**
     * Ejecuta la estrategia de la plataforma.
     */
    public void execute() {
        strategy.execute(this);
    }
}

/**
 * Interfaz para las estrategias de las plataformas.
 */
interface StrategyMethods {
    /**
     * Método principal de ejecución de la estrategia.
     * @param platform Plataforma en la que se ejecuta la estrategia.
     */
    void execute(Platform platform);
}

/**
 * Estrategia específica para Spotify.
 */
 class Inter_Spotify implements StrategyMethods {
    private List<String> recommendations;

    public Inter_Spotify() {
        this.recommendations = new ArrayList<>();
    }

    /**
     * Añade recomendaciones específicas para Spotify.
     * @param recommendations Lista de recomendaciones de Spotify.
     */
    public void add_recommen(List<String> recommendations) {
        this.recommendations.addAll(recommendations);
    }

    @Override
    public void execute(Platform platform) {
        System.out.println("Recomendaciones de Spotify: " + recommendations);    
	}
 }

/**
 * Estrategia específica para Amazon.
 */
 class Inter_Amazon implements StrategyMethods {
    private List<String> recommendations;

    public Inter_Amazon() {
        this.recommendations = new ArrayList<>();
    }

    /**
     * Añade recomendaciones específicas para Amazon.
     * @param recommendations Lista de recomendaciones de Amazon.
     */
    public void add_recommen(List<String> recommendations) {
        this.recommendations.addAll(recommendations);
    }

    @Override
    public void execute(Platform platform) {
        System.out.println("Recomendaciones de Amazon: " + recommendations);
    }
 }

/**
 * Estrategia específica para Disney.
 */
 class Inter_Disney implements StrategyMethods {
    private List<String> recommendations;

    public Inter_Disney() {
        this.recommendations = new ArrayList<>();
    }

    /**
     * Añade recomendaciones específicas para Disney.
     * @param recommendations Lista de recomendaciones de Disney.
     */
    public void add_recommen(List<String> recommendations) {
        this.recommendations.addAll(recommendations);
    }

    @Override
    public void execute(Platform platform) {
		
        System.out.println("Recomendaciones de Amazon: " + recommendations);   
	 }
 }

/**
 * Estrategia específica para HBO.
 */
  class Inter_HBO implements StrategyMethods {
    private List<String> recommendations;

    public Inter_HBO() {
        this.recommendations = new ArrayList<>();
    }

    /**
     * Añade recomendaciones específicas para HBO.
     * @param recommendations Lista de recomendaciones de HBO.
     */
    public void add_recommen(List<String> recommendations) {
        this.recommendations.addAll(recommendations);
    }

    @Override
    public void execute(Platform platform) {
        System.out.println("Recomendaciones de HBO: " + recommendations);
	    }
 }

/**
 * Estrategia específica para Netflix.
 */
 class Inter_Netflix implements StrategyMethods {
    private List<String> recommendations;

    public Inter_Netflix() {
        this.recommendations = new ArrayList<>();
    }

    /**
     * Añade recomendaciones específicas para Netflix.
     * @param recommendations Lista de recomendaciones de Netflix.
     */
    public void add_recommen(List<String> recommendations) {
        this.recommendations.addAll(recommendations);
    }

    @Override
    public void execute(Platform platform) {
			System.out.println("Recomendaciones de Netflix: " + recommendations);
	}
  }
 }
 }

	