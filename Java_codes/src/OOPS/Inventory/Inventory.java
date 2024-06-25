package OOPS.Inventory;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import OOPS.Guitar.Guitar;

public class Inventory {
    private List<Guitar> guitarsList;

    public Inventory() {
        guitarsList = new LinkedList<>();
    }

    public void addGuitar(String serialNumber, String builder, String model, String type, String backWood,
            String topWood, double price) {
        Guitar guitar = new Guitar(serialNumber, builder, model, type, backWood, topWood, price);
        guitarsList.add(guitar);
    }

    private boolean isMatch(String searchValue, String guitarValue) {
        return searchValue == null || searchValue.isEmpty() || searchValue.equals(guitarValue);
    }

    public Guitar geGuitar(String serialNumber) {
        for (Iterator<Guitar> i = guitarsList.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public Guitar search(Guitar searchGuitar) {
        for (Guitar guitar : guitarsList) {
            if (!isMatch(searchGuitar.getBuilder(), guitar.getBuilder()))
                continue;
            if (!isMatch(searchGuitar.getModel(), guitar.getModel()))
                continue;
            if (!isMatch(searchGuitar.getType(), guitar.getType()))
                continue;
            if (!isMatch(searchGuitar.getBackWood(), guitar.getBackWood()))
                continue;
            if (!isMatch(searchGuitar.getTopWood(), guitar.getTopWood()))
                continue;

            return guitar;
        }
        return null;
    }
}
