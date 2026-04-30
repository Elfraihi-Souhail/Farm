package student2;

public class Alert {
    SeverityLevel level;
    ValidationStatus validationStatus;
    Reading reading;

    public Alert(SeverityLevel level, ValidationStatus status,Reading reading ){
        this.level = level;
        this.validationStatus = status;
        this.reading = reading;
    }
}
