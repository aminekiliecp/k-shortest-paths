package filereading.relation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Properties {

    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("cout")
    @Expose
    private Integer cout;
    @SerializedName("dureeEtCout")
    @Expose
    private Integer dureeEtCout;
    @SerializedName("stopsNumber")
    @Expose
    private Integer stopsNumber;
    @SerializedName("duree")
    @Expose
    private Integer duree;
    @SerializedName("cityId")
    @Expose
    private String cityId;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("spec")
    @Expose
    private String spec;
    @SerializedName("direction")
    @Expose
    private String direction;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getCout() {
        return cout;
    }

    public void setCout(Integer cout) {
        this.cout = cout;
    }

    public Integer getDureeEtCout() {
        return dureeEtCout;
    }

    public void setDureeEtCout(Integer dureeEtCout) {
        this.dureeEtCout = dureeEtCout;
    }

    public Integer getStopsNumber() {
        return stopsNumber;
    }

    public void setStopsNumber(Integer stopsNumber) {
        this.stopsNumber = stopsNumber;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("gender", gender).append("cout", cout).append("dureeEtCout", dureeEtCout).append("stopsNumber", stopsNumber).append("duree", duree).append("cityId", cityId).append("type", type).append("spec", spec).append("direction", direction).toString();
    }

}
