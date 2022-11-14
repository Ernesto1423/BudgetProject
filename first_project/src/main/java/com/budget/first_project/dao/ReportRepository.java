package com.budget.first_project.dao;

import com.budget.first_project.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository <Report, Integer> {

}
