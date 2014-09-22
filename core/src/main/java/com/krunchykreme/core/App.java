package com.krunchykreme.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.krunchykreme.config.JPAConfigurationMysql;
import com.krunchykreme.core.services.ProductService;
import com.krunchykreme.persistence.domain.Product;

@Configuration
@ComponentScan({"com.krunchykreme.core", "com.krunchykreme.persistence", "com.krunchykreme.rest" })
@EnableAutoConfiguration
@EnableJpaRepositories("com.krunchykreme.persistence.repository")
@EntityScan("com.krunchykreme.persistence.domain")
public class App 
{
    //private static ApplicationContext context = new AnnotationConfigApplicationContext(JPAConfigurationMysql.class);
	
   // @Autowired
   // private ProductService productService;
    
    public static void main( String[] args )
    {
//        CrudRepository<Product, Integer> repository = context.getBean(ProductsRepository.class);
//        
//        Iterable<Product> p = repository.findAll();
//        System.out.println(p);
    	
    	//productService.
    	
    	SpringApplication.run(App.class, args);
    }
}
