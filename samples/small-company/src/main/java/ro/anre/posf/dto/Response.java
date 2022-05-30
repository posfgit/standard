
package ro.anre.posf.dto;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;
import java.util.UUID;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", propOrder = {
    "responseID"
})
@XmlRootElement(name = "Response")
@Data
public class Response {

    protected String authorID;
    protected String authorName;

    protected UUID correlationID;
    protected String description;

    protected UUID messageID;

    @XmlJavaTypeAdapter(Adapter1.class)
    protected LocalDateTime timestamp;
    protected String type;

    protected UUID responseID;


}
