public class Truck extends Transport implements Service {


    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    public void updateTyre() {
        System.out.println("Меняем покрышку грузовику ");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовику ");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовику ");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем грузовик " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();

    }
}
