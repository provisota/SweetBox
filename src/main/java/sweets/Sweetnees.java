package sweets;

public abstract class Sweetnees {
    String title;
    int weight; //in gramm
    double price;
    String unique_parameter;

    protected String getInfo() {
        String info = "";
        info += "Сладость{" +
                "название='" + title + '\'' +
                ", вес=" + weight +
                ", цена=" + price +
                ", уникальный параметр='" + unique_parameter + '\'' +
                '}';
        return info;
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
