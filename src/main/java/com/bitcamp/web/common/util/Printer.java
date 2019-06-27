package com.bitcamp.web.common.util;

import java.util.function.Consumer;

import com.bitcamp.web.common.lambda.IConsumer;

import org.springframework.stereotype.Service;


@Service
public class Printer implements IConsumer{

    @Override
    public void accept(Object o) {
        Consumer <String> c = System.out :: println;
        c.accept((String)o);
    }

    
}