package com.statsystem.entity.impl;

import com.statsystem.entity.AnalysisData;
import com.statsystem.logic.statchars.CorrelationFunction;
/**
 * Created by Илья on 25.11.2016.
 */
public class CorrelationAnalisisData implements AnalysisData {

    private double[] values;

    private double[] quantity;

    private transient CorrelationFunction f;

    public CorrelationAnalisisData() {
    }
    public CorrelationAnalisisData(double[] values, double[] quantity) {
        this.values = values;
        this.quantity = quantity;
        this.f = new CorrelationFunction(values, quantity);
    }

    public double[] getValues() {
        return values;
    }

    public double[] getQuantity() {
        return quantity;
    }

    public CorrelationFunction getF() {
        return f;
    }
}
