package filereading.relation;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Relation {

    @SerializedName("r")
    @Expose
    private RelationInside r;

    public RelationInside getR() {
        return r;
    }

    public void setR(RelationInside r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("r", r).toString();
    }

}