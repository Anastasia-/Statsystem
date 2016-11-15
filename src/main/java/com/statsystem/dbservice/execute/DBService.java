/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.statsystem.dbservice.execute;

import com.statsystem.dbservice.DAO.*;
import com.statsystem.dbservice.DAO.impl.*;

/**
 *
 * @author sereg
 */
public class DBService {
    
    private static ProjectDAO projectDAO = null;
    private static AnalysisDAO analysisDAO = null;
    private static SampleDAO sampleDAO = null;
    private static UnitDAO unitDAO = null;
    private static DBService instance = null;

    public static synchronized DBService getInstance(){
        if (instance == null)
            instance = new DBService();
        return instance;
    }
    
    public ProjectDAO getProjectDAO(){
        if (projectDAO == null)
            projectDAO = new ProjectDAOImpl();
        return projectDAO;
    }
    
    private AnalysisDAO getAnalysisDAO(){
        if (analysisDAO == null)
            analysisDAO = new AnalysisDAOImpl();
        return analysisDAO;
    }
    

    private SampleDAO getSampleDAO(){
        if (sampleDAO == null)
            sampleDAO = new SampleDAOImpl();
        return sampleDAO;
    }

    private UnitDAO getUnitDAO(){
        if (unitDAO == null)
            unitDAO = new UnitDAOImpl();
        return unitDAO;
    }

}