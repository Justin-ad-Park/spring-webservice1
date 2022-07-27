package com.justin.webservice.springwebservice.service.oopSample.lsp.Game;

public interface IWeapon {
    void attack(EnemyCharacter otherCharacter);
    void showAttackStatus(String targetName);
    void damage(EnemyCharacter otherCharacter);
}