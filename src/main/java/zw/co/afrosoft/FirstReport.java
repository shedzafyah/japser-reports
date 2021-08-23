package zw.co.afrosoft;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.base.JRBaseTextField;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstReport {
    public static void main(String[] args) {
        try {
            String filePath = "C:\\Users\\sheltons\\IdeaProjects\\jasper-reports\\src\\main\\resources\\SimpleReport.jrxml";
            Map<String,Object> parameters = new HashMap<String,Object>();
            parameters.put("studentName","Shelton");

            Student s1 = new Student(1L,"Shelton","Shamuyarira","Kuwadzana Ext","Harare");
            Student s2 = new Student(1L,"Ashton","Shamuyarira","Queens Park","Bulawayo");
            List<Student> studentList = new ArrayList<>();
            studentList.add(s1);
            studentList.add(s2);

            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(studentList);
          JasperReport jasperReport= JasperCompileManager.compileReport(filePath);
       //  JRBaseTextField textField= (JRBaseTextField) jasperReport.getTitle().getElementByKey("name");
         JasperPrint print=  JasperFillManager.fillReport(jasperReport,parameters,dataSource);
            JasperExportManager.exportReportToPdfFile(print,"C:\\Users\\sheltons\\Desktop\\SimpleReport.pdf");
            System.out.println("*****Report Created*****");
        }catch (Exception e){
            System.out.println("File Not Found");
        }
    }
}
