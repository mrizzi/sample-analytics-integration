package org.jboss.xavier.integrations.route.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class InputDataModel implements Serializable {
    String customerId;
    String filename;
    Long numberOfHosts;
    Long totalDiskSpace;
}
