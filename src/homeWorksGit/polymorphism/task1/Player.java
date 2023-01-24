package homeWorksGit.polymorphism.task1;

public class Player {
    private Weapon[] weaponSlots;

    public Player() {
        Weapon[] weaponSlots = new Weapon[]{new Pistolet(), new Avtomat(), new Rogatka(), new Bazuka()};
        this.weaponSlots = weaponSlots;
    }

    public int getSlotsCount() {
        return this.weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot < this.getSlotsCount() && slot >= -1) {
            Weapon weapon = this.weaponSlots[slot];
            weapon.shot();
        } else {
            System.out.println("Невозможное значение");
        }
    }
}