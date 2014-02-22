/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package config;

import Service.implementation.truefalseImpl;
import Service.trueFalse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author student
 */
@Configuration
public class TrueFalseConfig {
    @Bean(name="whatIsIt")
    public trueFalse callServ()
    {
        return (trueFalse) new truefalseImpl();
    }
    
}
