package com.budget.first_project.rest;

import com.budget.first_project.entity.Report;
import com.budget.first_project.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReportRestController {

    private ReportService reportService;

    @Autowired
    public ReportRestController(ReportService theReportService) {
        reportService = theReportService;
    }

    // expose "/reports" and return list of reports
    @GetMapping("/reports")
    public List<Report> findAll() {
        return reportService.findAll();
    }

    // add mapping for GET /reports/{reportId}
    @GetMapping("/reports/{reportId}")
    public Report getReport(@PathVariable int reportId) {

        Report theReport = reportService.findById(reportId);

        if (theReport == null) {
            throw new RuntimeException("Record id not found - " + reportId);
        }

        return theReport;
    }

    // add mapping for POST /reports - add new record
    @PostMapping("/reports")
    public Report addReport(@RequestBody Report theReport) {

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update

        theReport.setId(0);

        reportService.save(theReport);

        return theReport;
    }

    // add mapping for PUT /reports - update existing report
    @PutMapping("/reports")
    public Report updateReport(@RequestBody Report theReport) {

        reportService.save(theReport);

        return theReport;
    }

    // add mapping for DELETE /reports/{reportId} - delete report
    @DeleteMapping("/reports/{reportId}")
    public String deleteReport(@PathVariable int reportId) {

        Report tempReport = reportService.findById(reportId);

        // throw exception if null

        if (tempReport == null) {
            throw new RuntimeException("Report id not found - " + reportId);
        }

        reportService.deleteById(reportId);

        return "Deleted report id - " + reportId;
    }
}
