/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.controller;

import com.tienda.service.PersonaService;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import static net.sf.jasperreports.engine.JasperCompileManager.compileReport;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author josea
 */
@RestController
public class reporteController {
    
    @Autowired
    private PersonaService personaservice;
    
    @GetMapping("/pdf")
    public String generatedPdf() throws FileNotFoundException, JRException{
        
        JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(personaservice.getAllPersona());
        JasperReport compileReport = JasperCompileManager.compileReport(new FileInputStream("C:\\Users\\josea\\OneDrive\\Desktop\\U Fidelitas\\4to Cuatrimestre\\Desarrollo de aplicaciones web\\Tienda\\src\\main\\resources\\Reports\\PersonasReport.jrxml"));
        
        HashMap<String,Object> map=new HashMap<>();
        JasperPrint report = JasperFillManager.fillReport(compileReport, map, beanCollectionDataSource);
        JasperExportManager.exportReportToPdfFile(report,"reporte.pdf");
        
        return "generated";
    }
}
