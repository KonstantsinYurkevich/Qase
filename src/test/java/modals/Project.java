package modals;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Project {
    String projectName;
    String projectCode;
    String description;
    String projectAccessType;
    String membersAccess;
}
