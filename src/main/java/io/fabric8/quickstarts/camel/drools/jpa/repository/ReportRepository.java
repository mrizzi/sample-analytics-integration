package io.fabric8.quickstarts.camel.drools.jpa.repository;

import io.fabric8.quickstarts.camel.drools.model.migrationanalytics.output.ReportDataModel;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ReportRepository extends PagingAndSortingRepository<ReportDataModel, Long> 
{
}
