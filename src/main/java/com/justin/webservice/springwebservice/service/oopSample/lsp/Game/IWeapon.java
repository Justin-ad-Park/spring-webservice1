package com.justin.webservice.springwebservice.service.oopSample.lsp.Game;

public interface IWeapon {
    void attach(EnemyCharacter otherCharacter);
    void showAttachStatus(String targetName);
    void damage(EnemyCharacter otherCharacter);
}