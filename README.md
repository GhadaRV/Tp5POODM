étape 5 : les dépendances: 
* spring-boot-starter-web: Il est utilisé pour créer des applications Web, y compris RESTful, à l'aide de Spring MVC. Utilise Tomcat comme conteneur intégré par défaut.
* spring-boot-starter-data-jpa: Il est utilisé pour Spring Data JPA avec Hibernate. Il gère la majeure partie de la complexité de l'accès aux bases de données JDBC et des mappages relationnels aux objets.
* spring-boot-starter-thymeleaf: Il est utilisé pour créer des applications Web MVC à l'aide de vues Thymeleaf.
* spring-boot-devtools: Chaque fois qu'il y a un changement de fichiers sur le chemin de classe, DevTools redémarre automatiquement l'application en cours d'exécution avec les nouvelles modifications appliquées. Lors du développement local, cela peut être utile car nous n'avons pas besoin de redéployer l'application manuellement.
* com.h2database: H2 est un système de gestion de base de données relationnelle intégrable écrit en Java.
* spring-boot-starter-test: Il est utilisé pour tester les applications Spring Boot avec des bibliothèques telles que JUnit, Hamcrest et Mockito.
*Hibernate: utilisé pour accéder à la couche de données

étape 13: 
* Q1: Avec quelle partie du code avons-nous parametre l'url d'appel /greeting ?
* R1: Avec l'annotation : @GetMapping ("/greeting") 
* Q2: Avec quelle partie du code avons-nous choisi le fichier HTML à afficher ?
* R2: return "greeting"
* Q3: Comment envoyons-nous le nom à qui nous disons bonjour avec le second lien ?
* R3: @RequestParam(name ="nameGET",required =false,defaultValue ="World") 

étape 17: 
* La table ADDRESS a été créée.

étape 18: 
* Hibernate permet grâce aux annotations d'acceder a la base de donnée et de créer la table. Il est alors compatible avec H2.

étape 20: 
* Oui, on peut voir tout de contenu le data.sql qui s'est ajouté dans la table "Address"

étape 23: 
* @Autowired:C’est une annotation qui nous permet de faire l’injection de dépendances entre les beans de l’application.

étape 30: 
* 1/ Dans le fichier pom.xml, on ajoute ces dépendances : 
* <dependency>
    <groupId>org.webjars</groupId>
    <artifactId>bootstrap</artifactId>
    <version>3.3.6</version>
</dependency>

* <dependency>
    <groupId>org.webjars</groupId>
    <artifactId>bootstrap-datepicker</artifactId>
    <version>1.0.1</version>
</dependency>

* <dependency>
    <groupId>org.webjars</groupId>
    <artifactId>jquery</artifactId>
    <version>1.9.1</version>
</dependency>
* 2/ on ajoute : "link rel="stylesheet" th:href="@{/webjars/bootstrap/4.0.0-1/css/bootstrap.min.css} "/"
ou bien on copie ce fichier et on le met sous /ressources/static/css et on l'appelle avec "link href="css/bootstrap.min.css" rel="stylesheet"" 

étape 6 (partie2): 
* Oui il faudra un clé API pour appeler DarkSky

* https://api.darksky.net/forecast/clé/lat,lon

* HTTP Get

* on passe les paramètres d'appel dans le lien http : 
"https://api.darksky.net/forecast/d1bf2f23b28666bd98b89f22772eee2c/" + lat+ "," + lon + "?lang=fr&exclude=hourly&exclude=daily&exclude=flags&units=si"

* pour afficher la température : ${meteo.currently.temperature}

* pour afficher la prévision du météo: ${meteo.currently.summary}

étape 7 (partie 2): 
* https://github.com/GhadaRV/Tp5_DM