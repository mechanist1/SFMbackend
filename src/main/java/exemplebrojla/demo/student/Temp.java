package exemplebrojla.demo.student;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="temp")
public class Temp {

    private String sn;
    private String date;
    private Long temp;
    private Long hum;



    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getTemp() {
        return temp;
    }

    public void setTemp(Long temp) {
        this.temp = temp;
    }

    public Long getHum() {
        return hum;
    }

    public void setHum(Long hum) {
        this.hum = hum;
    }

    public Long getMotion() {
        return motion;
    }

    public void setMotion(Long motion) {
        this.motion = motion;
    }

    private Long motion;

}
