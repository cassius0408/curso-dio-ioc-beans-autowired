package dio.springboot.app;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Todas as classes externas ficam aqui para todas as injeções
 * de dependencias externas
 */
@Configuration
public class BeansFactory {

    @Bean
    public Gson gson(){
        return new Gson();
    }

}
