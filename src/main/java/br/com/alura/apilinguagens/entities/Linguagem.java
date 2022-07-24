package br.com.alura.apilinguagens.entities;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/*Annotation para identificar que no application.properties
 há a string de conexão com a banco no MongoDb*/

@Data
@Getter
@Setter
@Document(collection = "principaisLinguagens")
public class Linguagem {
    
    @Id
    private String id;
    private String title;
    private String image;
    private int ranking;
    
}
