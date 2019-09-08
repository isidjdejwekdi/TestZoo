package cba;
import java.util.ArrayList;

public class CageForHishnie {
    public int allowedCountOfAnimal;
    public int countOfAnimal;
    public ArrayList<Animal> tList = new ArrayList<Animal>();

    public CageForHishnie(int allowedCountOfAnimal){
        this.allowedCountOfAnimal=allowedCountOfAnimal;
    }

    public void addAnimal(Animal animal){
        if(animal.isHishnoe()){
            if(countOfAnimal<allowedCountOfAnimal){
                tList.add(animal);
                countOfAnimal++;
                System.out.println(animal.name+ " добавлен в клетку!");
            }
            else
                System.out.println("Клетка переполнена!");
        }
        else
            System.out.println("Нельзя добавить травоядное к хищникам");
    }
}
