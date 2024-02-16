package Lesson25;

public class Garage {
    Transport[] transports;
    String name;

     void add1(Transport transport) {
        for (int i = 0; i < transports.length; i++) {
            if (transports[i] == null) {
                transports[i] = transport;
                break;
            }
        }
    }
    void printTranspor() {
        System.out.println("Транспорт: ");
        for (Transport transport : transports) {
            if (transport != null) {
                System.out.println(transport.type+"- "+ transport.name+"- "+transport.wheel+" "+transport.index);
            }
        }
    }
}
