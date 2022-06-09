package com.changhong.cdc.todo.config;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;


/**
 * @author liwei
 * example for apollo configuration
 */
//@Configuration
@Getter
@ToString
public class CustomConfig {
    @Value("${foo}")
    private String foo;
}
