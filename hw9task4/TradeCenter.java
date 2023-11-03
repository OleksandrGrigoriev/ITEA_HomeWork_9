package org.hw9task4;

public class TradeCenter {
    private final String name;
    private final int floors;
    private final int amountOfOffices;
    private int personal;
    private final boolean hasElevators;

    public TradeCenter(String name, int floors, int amountOfOffices, boolean hasElevators) {
        this.name = name;
        this.amountOfOffices = amountOfOffices;
        this.floors = floors;
        this.hasElevators = hasElevators;
    }

    public void setPersonal(int personal) {
        this.personal = personal;
    }

    public String getName() {
        return name;
    }

    public int getFloors() {
        return floors;
    }

    public int getAmountOfOffices() {
        return amountOfOffices;
    }

    public int getPersonal() {
        return personal;
    }

    public boolean isHasElevators() {
        return hasElevators;
    }

    @Override
    public String toString() {
        return "TradeCenter{" +
                "name='" + name + '\'' +
                ", floors=" + floors +
                ", amountOfOficces=" + amountOfOffices +
                ", personel=" + personal +
                ", hasElevators=" + hasElevators +
                '}';
    }
}
