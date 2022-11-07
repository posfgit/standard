package ro.anre.posf.standard;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import javax.xml.bind.annotation.*;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiError", propOrder = {
        "status",
        "message",
        "error"
})
@XmlRootElement(name = "ApiError")
@NoArgsConstructor
public class ApiError {
    @XmlElement(required = true)
    private int status;
    @XmlElement(required = true)
    private String message;

    @XmlElement(required = true)
    private String error;

    public ApiError(HttpStatus status, String message) {
        this.status = status.value();
        this.message = message;
        this.error = status.getReasonPhrase();
    }



}
