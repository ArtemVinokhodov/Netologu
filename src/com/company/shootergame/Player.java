package com.company.shootergame;

public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    public Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{new BigGun(), new Slingshot(), new WaterPistolet()};
        // TODO заполнить слоты оружием
        // new BigGun(),
        // new WaterPistol()
    }
    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO проверить на выход за границы
        // если значение slot некорректно, то
        // выйти из метода написав об этом в консоль
        // Получаем оружие из выбранного слота
        if (slot <= -2 || slot >= getSlotsCount()) {
            System.out.println("Такого оружия нет");
            return;
        }
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shot();
    }
}
