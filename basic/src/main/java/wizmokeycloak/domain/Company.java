package wizmokeycloak.domain;

import wizmokeycloak.domain.CompanyCreated;
import wizmokeycloak.domain.CompanyDeleted;
import wizmokeycloak.BasicApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;


@Entity
@Table(name="Company_table")
@Data


//<<< DDD / Aggregate Root
public class Company  {

    123

    
    @Id
    
    
    
    
    
    private String code;
    
    
    
    
    private String name;
    
    
    
    
    private String industry;
    
    
    
    
    private Date foundedDate;

    @PostPersist
    public void onPostPersist(){


        CompanyCreated companyCreated = new CompanyCreated(this);
        companyCreated.publishAfterCommit();



        CompanyDeleted companyDeleted = new CompanyDeleted(this);
        companyDeleted.publishAfterCommit();

    }
    @PreRemove
    public void onPreRemove(){
    }

    public static CompanyRepository repository(){
        CompanyRepository companyRepository = BasicApplication.applicationContext.getBean(CompanyRepository.class);
        return companyRepository;
    }

    public void CreateCompany(){
        //
    }


//<<< Clean Arch / Port Method
    public void updateCompany(UpdateCompanyCommand updateCompanyCommand){
        
        //implement business logic here:
        
        CompanyUpdated companyUpdated = new CompanyUpdated(this);
        companyUpdated.publishAfterCommit();
        
    }
//>>> Clean Arch / Port Method



}
//>>> DDD / Aggregate Root
