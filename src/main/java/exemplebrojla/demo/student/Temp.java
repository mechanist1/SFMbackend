package exemplebrojla.demo.student;


import jdk.jfr.Enabled;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Enabled
public class Temp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Temp;
    private Date date;
}
