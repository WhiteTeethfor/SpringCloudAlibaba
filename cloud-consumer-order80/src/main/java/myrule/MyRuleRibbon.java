package myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Wang
 * @date 2022/10/9 14:51
 */

@Configuration
public class MyRuleRibbon {
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
