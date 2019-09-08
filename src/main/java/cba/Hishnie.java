package cba;

public abstract class Hishnie extends Animal {
    public boolean isHishnoe;

    public Hishnie(String name, int hungry) {
        super(name, hungry);
    }

    @Override
    public boolean isHishnoe() {
        return true;
    }

    @Override
    public boolean eat(Food food) {
        if (!food.isTrava()){
            hungry += food.value;
            food.value = 0;
        }
        else
            System.out.println("нельзя кормить хищника травой!");
        return hungry >= 0;
    }
}



