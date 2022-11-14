package com.budget.first_project.service;

import com.budget.first_project.entity.Report;

import java.util.List;

public interface ReportService {
    public List<Report> findAll();

    public Report findById(int theId);

    public void save(Report theReport);

    public void deleteById(int theId);
}
