package filereading.stations;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;
        import org.apache.commons.lang.builder.ToStringBuilder;

public class Station {

    @SerializedName("n")
    @Expose
    private StationInside n;

    public StationInside getN() {
        return n;
    }

    public void setN(StationInside n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("n", n).toString();
    }

}