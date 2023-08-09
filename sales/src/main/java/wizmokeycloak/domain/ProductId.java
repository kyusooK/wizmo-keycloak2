package wizmokeycloak.domain;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;


//<<< DDD / Value Object
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductId {

    CompanyQuery

    
    
    
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String name;
    
    
    
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;



}

//>>> DDD / Value Object