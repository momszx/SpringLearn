package hu.uni.eszterhazy.frameworks;

import hu.uni.eszterhazy.frameworks.dao.ActorRepository;
import hu.uni.eszterhazy.frameworks.dao.ISCORepository;
import hu.uni.eszterhazy.frameworks.service.ActorSearchService;
import hu.uni.eszterhazy.frameworks.service.ActorSearchServiceImpl;
import hu.uni.eszterhazy.frameworks.service.ISCOSearchService;
import hu.uni.eszterhazy.frameworks.service.ISCOSearchServiceImpl;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class WebConfiguration {

    @Bean
    public ActorSearchService actorSearchService(ActorRepository actorRepository){
        return new ActorSearchServiceImpl(actorRepository);
    }

    @Bean
    public ISCOSearchService iscoSearchService(ISCORepository iscoRepository){
        return  new ISCOSearchServiceImpl(iscoRepository);
    }

}
