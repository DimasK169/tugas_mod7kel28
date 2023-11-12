// TrackerBean.java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package tracker.ejb;
import jakarta.ejb.Stateful;
import java.util.ArrayList;
@Stateful
public class TrackerBean implements TrackerBeanLocal {

    private double total = 0;
    private int count = 0;
    ArrayList<Double> array = new ArrayList<>();
    private double max = 0;
    private double min = 0;

    @Override
    public double add(double value) {
        total += value;
        count += 1;
        return total;
    }

    @Override
    public double average() {
        return total / count;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public double getTotal() {
        return total;
    }

    @Override
    public ArrayList addArray(double value) {
        array.add(value);
        return array;
    }

    @Override
    public double getMax(ArrayList<Double> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > max) {
                max = array.get(i);
            }
        }
        return max;
    }

    @Override
    public double getMin(ArrayList<Double> array) {
        if (count == 1) {
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i) > min) {
                    min = array.get(i);
                }
            }
        } else {
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i) < min) {
                    min = array.get(i);
                }
            }
        }
        return min;
    }

}
