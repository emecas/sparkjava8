package emecas.sparkjava8.main;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
    	staticFileLocation("/public");
    	
        get("/hello", (req, res) -> "Hello World");
                
        
    }
}