package zw.co.afrosoft.subject;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.io.FileNotFoundException;
import java.util.*;

public class CustomeReport {
    public static void main(String[] args) {

        try {
            String pathFile = "C:\\Users\\sheltons\\IdeaProjects\\jasper-reports\\src\\main\\resources\\Student.jrxml";

            Subject s1 = new Subject("PHP",10);
            Subject s2 = new Subject("JAVA",100);
            Subject s3 = new Subject("C#",45);
            Subject s4 = new Subject("PYTHON",12);
            List<Subject> subjects = Arrays.asList(s1,s2,s3,s4);
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(subjects);
            Map<String,Object> parameters = new HashMap<>();
            parameters.put("studentName" , "Shelton");
            parameters.put("tableData",dataSource);
            JasperReport jasperReport = JasperCompileManager.compileReport(pathFile);
            JasperPrint print = JasperFillManager.fillReport(jasperReport,parameters,new JREmptyDataSource());
            JasperExportManager.exportReportToPdfFile("C:\\Users\\sheltons\\Desktop\\StudentReport.pdf");
            System.out.println("******Report Created");

        }catch (Exception e) {
            System.out.println("File Not Found");
        }

    }
}
