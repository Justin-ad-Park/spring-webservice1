package com.justin.webservice.springwebservice.service.oopSample.lsp.chainofresponsibility;

public class EvenHandler extends Handler {
    public EvenHandler() {
        super("짝수");
    }

    public boolean canHandle(int number) {
        return number % 2 == 0;
    }

    @Override
    public void doSomething(int number) {
        System.out.println(number + ":" + name + "로 처리");
    }
}
