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
public class SalesItem {

    CompanyQuery

    
    
    
    
    private String qty;
    
    
    
    
    private String price;
    
    
    @Embedded
    
    private ProductId productId;



}

//>>> DDD / Value Object