/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author skypper
 */
public class Provider {

    private String prefix;
    private ArrayList<DataSimulation> dataSimulationList;
    private int counter;

    public Provider(String prefix) {
        this.prefix = prefix;
        this.dataSimulationList = new ArrayList<>();
        this.counter = 0;
        populateDaSimulationList(prefix);
    }

    private void populateDaSimulationList(String prefix) {
        dataSimulationList.add(new DataSimulation(100, prefix, "06:00"));
        dataSimulationList.add(new DataSimulation(110, prefix, "06:10"));
        dataSimulationList.add(new DataSimulation(120, prefix, "06:20"));
        dataSimulationList.add(new DataSimulation(140, prefix, "06:30"));
        dataSimulationList.add(new DataSimulation(160, prefix, "06:40"));
        dataSimulationList.add(new DataSimulation(180, prefix, "06:50"));
        
        dataSimulationList.add(new DataSimulation(200, prefix, "07:00"));
        dataSimulationList.add(new DataSimulation(120, prefix, "07:10"));
        dataSimulationList.add(new DataSimulation(130, prefix, "07:20"));
        dataSimulationList.add(new DataSimulation(150, prefix, "07:30"));
        dataSimulationList.add(new DataSimulation(170, prefix, "07:40"));
        dataSimulationList.add(new DataSimulation(180, prefix, "07:50"));
        dataSimulationList.add(new DataSimulation(200, prefix, "08:00"));
        
        dataSimulationList.add(new DataSimulation(190, prefix, "09:00"));
        dataSimulationList.add(new DataSimulation(170, prefix, "09:10"));
        dataSimulationList.add(new DataSimulation(150, prefix, "09:20"));
        dataSimulationList.add(new DataSimulation(130, prefix, "09:30"));
        dataSimulationList.add(new DataSimulation(110, prefix, "09:40"));
        dataSimulationList.add(new DataSimulation(100, prefix, "09:50"));
        
        dataSimulationList.add(new DataSimulation(100, prefix, "10:00"));
        dataSimulationList.add(new DataSimulation(100, prefix, "10:10"));
        dataSimulationList.add(new DataSimulation(100, prefix, "10:20"));
        dataSimulationList.add(new DataSimulation(100, prefix, "10:30"));
        dataSimulationList.add(new DataSimulation(100, prefix, "10:40"));
        dataSimulationList.add(new DataSimulation(100, prefix, "10:50"));
        
        dataSimulationList.add(new DataSimulation(100, prefix, "11:00"));
        dataSimulationList.add(new DataSimulation(100, prefix, "11:10"));
        dataSimulationList.add(new DataSimulation(100, prefix, "11:20"));
        dataSimulationList.add(new DataSimulation(100, prefix, "11:30"));
        dataSimulationList.add(new DataSimulation(100, prefix, "11:40"));
        dataSimulationList.add(new DataSimulation(100, prefix, "11:50"));
        
        dataSimulationList.add(new DataSimulation(200, prefix, "12:00"));
        dataSimulationList.add(new DataSimulation(100, prefix, "12:10"));
        dataSimulationList.add(new DataSimulation(100, prefix, "12:20"));
        dataSimulationList.add(new DataSimulation(100, prefix, "12:30"));
        dataSimulationList.add(new DataSimulation(100, prefix, "12:40"));
        dataSimulationList.add(new DataSimulation(100, prefix, "12:50"));
        
        dataSimulationList.add(new DataSimulation(300, prefix, "13:00"));
        dataSimulationList.add(new DataSimulation(100, prefix, "13:10"));
        dataSimulationList.add(new DataSimulation(100, prefix, "13:20"));
        dataSimulationList.add(new DataSimulation(100, prefix, "13:30"));
        dataSimulationList.add(new DataSimulation(100, prefix, "13:40"));
        dataSimulationList.add(new DataSimulation(100, prefix, "13:50"));
        
        dataSimulationList.add(new DataSimulation(200, prefix, "14:00"));
        dataSimulationList.add(new DataSimulation(100, prefix, "14:10"));
        dataSimulationList.add(new DataSimulation(100, prefix, "14:20"));
        dataSimulationList.add(new DataSimulation(100, prefix, "14:30"));
        dataSimulationList.add(new DataSimulation(100, prefix, "14:40"));
        dataSimulationList.add(new DataSimulation(100, prefix, "14:50"));
        
        dataSimulationList.add(new DataSimulation(150, prefix, "15:00"));
        dataSimulationList.add(new DataSimulation(100, prefix, "15:10"));
        dataSimulationList.add(new DataSimulation(100, prefix, "15:20"));
        dataSimulationList.add(new DataSimulation(100, prefix, "15:30"));
        dataSimulationList.add(new DataSimulation(100, prefix, "15:40"));
        dataSimulationList.add(new DataSimulation(100, prefix, "15:50"));
        
        dataSimulationList.add(new DataSimulation(100, prefix, "16:00"));
        dataSimulationList.add(new DataSimulation(100, prefix, "16:10"));
        dataSimulationList.add(new DataSimulation(100, prefix, "16:20"));
        dataSimulationList.add(new DataSimulation(100, prefix, "16:30"));
        dataSimulationList.add(new DataSimulation(100, prefix, "16:40"));
        dataSimulationList.add(new DataSimulation(100, prefix, "16:50"));
        
        dataSimulationList.add(new DataSimulation(100, prefix, "17:00"));
        dataSimulationList.add(new DataSimulation(100, prefix, "17:10"));
        dataSimulationList.add(new DataSimulation(100, prefix, "17:20"));
        dataSimulationList.add(new DataSimulation(100, prefix, "17:30"));
        dataSimulationList.add(new DataSimulation(100, prefix, "17:40"));
        dataSimulationList.add(new DataSimulation(100, prefix, "17:50"));
        
        dataSimulationList.add(new DataSimulation(150, prefix, "18:00"));
        dataSimulationList.add(new DataSimulation(100, prefix, "18:10"));
        dataSimulationList.add(new DataSimulation(100, prefix, "18:20"));
        dataSimulationList.add(new DataSimulation(100, prefix, "18:30"));
        dataSimulationList.add(new DataSimulation(100, prefix, "18:40"));
        dataSimulationList.add(new DataSimulation(100, prefix, "18:50"));
        
        dataSimulationList.add(new DataSimulation(200, prefix, "19:00"));
        dataSimulationList.add(new DataSimulation(100, prefix, "19:10"));
        dataSimulationList.add(new DataSimulation(100, prefix, "19:20"));
        dataSimulationList.add(new DataSimulation(100, prefix, "19:30"));
        dataSimulationList.add(new DataSimulation(100, prefix, "19:40"));
        dataSimulationList.add(new DataSimulation(100, prefix, "19:50"));
        
        dataSimulationList.add(new DataSimulation(300, prefix, "20:00"));
        dataSimulationList.add(new DataSimulation(100, prefix, "20:10"));
        dataSimulationList.add(new DataSimulation(100, prefix, "20:20"));
        dataSimulationList.add(new DataSimulation(100, prefix, "20:30"));
        dataSimulationList.add(new DataSimulation(100, prefix, "20:40"));
        dataSimulationList.add(new DataSimulation(100, prefix, "20:50"));
        
        dataSimulationList.add(new DataSimulation(100, prefix, "21:00"));
        dataSimulationList.add(new DataSimulation(100, prefix, "21:10"));
        dataSimulationList.add(new DataSimulation(100, prefix, "21:20"));
        dataSimulationList.add(new DataSimulation(100, prefix, "21:30"));
        dataSimulationList.add(new DataSimulation(100, prefix, "21:40"));
        dataSimulationList.add(new DataSimulation(100, prefix, "21:50"));
        
        dataSimulationList.add(new DataSimulation(150, prefix, "22:00"));
        dataSimulationList.add(new DataSimulation(100, prefix, "22:10"));
        dataSimulationList.add(new DataSimulation(100, prefix, "22:20"));
        dataSimulationList.add(new DataSimulation(100, prefix, "22:30"));
        dataSimulationList.add(new DataSimulation(100, prefix, "22:40"));
        dataSimulationList.add(new DataSimulation(100, prefix, "22:50"));
        
        
        dataSimulationList.add(new DataSimulation(90, prefix, "23:00"));
        

    }

    public DefaultCategoryDataset getData() {
        if ((counter + 1) == dataSimulationList.size()) {
            counter = 0;
        }
        counter++;
        return buildData(counter);
    }

    public DataSimulation getLastData() {
        return dataSimulationList.get(counter);
    }

    private DefaultCategoryDataset buildData(int index) {
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        if (index < dataSimulationList.size()) {
            for (int i = 0; i <= index; i++) {
                DataSimulation dataSimulation = dataSimulationList.get(i);
                data.addValue(dataSimulation.getCantPasajeros(), dataSimulation.getLinea(), dataSimulation.getHora());
            }
        }
        return data;
    }
}
