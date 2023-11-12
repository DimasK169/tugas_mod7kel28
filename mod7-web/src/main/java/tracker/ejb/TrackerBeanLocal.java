// TrackerBeanLocal.java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package tracker.ejb;
import jakarta.ejb.Local;
import java.util.ArrayList;
/**
 *
 * @author usser
 */
@Local
public interface TrackerBeanLocal {
    public double add(double value);
    public double average();
    public int getCount();
    public double getTotal();
    public ArrayList addArray(double value);
    public double getMax(ArrayList<Double> array);
    public double getMin(ArrayList<Double> array);
}