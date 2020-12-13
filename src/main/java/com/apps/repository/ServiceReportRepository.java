package com.apps.repository;



import com.apps.models.ServiceReport;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ServiceReportRepository extends CrudRepository<ServiceReport,Integer>{
    

    @Query(value="SELECT * FROM SERVICE_REPORT where technical_id=?1 and WEEK(started_date)=?2 and WEEK(end_date)=?2", nativeQuery = true)
    public Iterable<ServiceReport> findbytechnicalIdAndWeekYear(@Param("technicalId") String technicalId,@Param("weekYear") int weekYear);
}
