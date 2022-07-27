package com.justin.webservice.springwebservice.service.oopSample.lsp.Game;

public class Bow extends Weapon {
    public Bow() {
        super("나무활", 1);
    }

    public Bow(String name, int attackPower) {
        super(name, attackPower);
    }

    @Override
    public void showAttachStatus(String targetName) {
        System.out.println(name + "(으)로 " + targetName + "(을)를 쐈다.");
    }
}