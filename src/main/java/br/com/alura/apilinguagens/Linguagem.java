package br.com.alura.apilinguagens;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/*Annotation para identificar que no application.properties
 há a string de conexão com a banco no MongoDb*/

@Document(collection = "principaisLinguagens")
public class Linguagem {
    
    @Id
    private String id;
    private String title;
    private String image;
    private int ranking;
    
    public Linguagem() {
    
    }
    
    public Linguagem(String title, String image, int ranking) {
        this.title = title;
        this.image = image;
        this.ranking = ranking;
    }
    
    public String getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }
    public String getImage() {
        return image;
    }
    public int getRanking() {
        return ranking;
    }

}
