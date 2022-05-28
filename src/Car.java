public class Car extends Transport implements Service {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку машине");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель машине");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем машину " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
}
