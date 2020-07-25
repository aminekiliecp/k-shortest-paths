package filereading.stations;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class StationInside {

    @SerializedName("identity")
    @Expose
    private Integer identity;
    @SerializedName("labels")
    @Expose
    private List<String> labels = null;
    @SerializedName("properties")
    @Expose
    private Properties properties;

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("identity", identity).append("labels", labels).append("properties", properties).toString();
    }

}