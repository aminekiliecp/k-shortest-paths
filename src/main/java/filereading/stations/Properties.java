package filereading.stations;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Properties {

    @SerializedName("stationName")
    @Expose
    private String stationName;
    @SerializedName("cityId")
    @Expose
    private String cityId;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("stationId")
    @Expose
    private String stationId;
    @SerializedName("longitude")
    @Expose
    private Double longitude;

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("stationName", stationName).append("cityId", cityId).append("latitude", latitude).append("stationId", stationId).append("longitude", longitude).toString();
    }

}