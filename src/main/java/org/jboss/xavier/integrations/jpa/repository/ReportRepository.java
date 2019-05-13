package org.jboss.xavier.integrations.jpa.repository;

import org.jboss.xavier.integrations.migrationanalytics.output.ReportDataModel;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ReportRepository extends PagingAndSortingRepository<ReportDataModel, Long> 
{
}
