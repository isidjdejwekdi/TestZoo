package cba;

public abstract class Travoyadnie extends Animal {
    public Travoyadnie(String name, int hungry) {
        super(name, hungry);
    }

    @Override
    public boolean isHishnoe() {
        return false;
    }

    @Override
    public boolean eat(Food food) {
        if (food.isTrava()){
            hungry += food.value;
            food.value = 0;
        }
        else
            System.out.println("нельзя кормить травоядное мясом!");
        return hungry >= 0;
    }
}
