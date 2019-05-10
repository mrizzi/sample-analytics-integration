package io.fabric8.quickstarts.camel.drools.jpa.service;

import io.fabric8.quickstarts.camel.drools.jpa.repository.ReportRepository;
import io.fabric8.quickstarts.camel.drools.model.migrationanalytics.output.ReportDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReportService
{
    @Autowired
    ReportRepository reportRepository;

    public Iterable<ReportDataModel> findReports()
    {
        return reportRepository.findAll();
    }
}
