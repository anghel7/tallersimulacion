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
        dataSimulationList.add(new DataSimulation(200, prefix, "07:00"));
        dataSimulationList.add(new DataSimulation(150, prefix, "08:00"));
        dataSimulationList.add(new DataSimulation(100, prefix, "09:00"));
        dataSimulationList.add(new DataSimulation(100, prefix, "10:00"));
        dataSimulationList.add(new DataSimulation(100, prefix, "11:00"));
        dataSimulationList.add(new DataSimulation(200, prefix, "12:00"));
        dataSimulationList.add(new DataSimulation(300, prefix, "13:00"));
        dataSimulationList.add(new DataSimulation(200, prefix, "14:00"));
        dataSimulationList.add(new DataSimulation(150, prefix, "15:00"));
        dataSimulationList.add(new DataSimulation(100, prefix, "16:00"));
        dataSimulationList.add(new DataSimulation(100, prefix, "17:00"));
        dataSimulationList.add(new DataSimulation(150, prefix, "18:00"));
        dataSimulationList.add(new DataSimulation(200, prefix, "19:00"));
        dataSimulationList.add(new DataSimulation(300, prefix, "20:00"));
        dataSimulationList.add(new DataSimulation(100, prefix, "21:00"));
        dataSimulationList.add(new DataSimulation(150, prefix, "22:00"));
        dataSimulationList.add(new DataSimulation(90, prefix, "23:00"));

    }

    public DefaultCategoryDataset getData() {
        if ((counter + 1) == dataSimulationList.size()) {
            counter = 0;
        }
        counter++;
        return buildData(counter);
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
