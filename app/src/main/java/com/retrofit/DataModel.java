package com.retrofit;

/**
 * Created by agc-android on 18/1/17.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataModel {

    @SerializedName("meta")
    @Expose
    private Meta meta;

    @SerializedName("data")
    @Expose
    private List<SubDataModel> subDataModels;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<SubDataModel> getSubDataModels() {
        return subDataModels;
    }

    public void setSubDataModels(List<SubDataModel> subDataModels) {
        this.subDataModels = subDataModels;
    }

    public class SubDataModel {
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("description")
        @Expose
        private String description;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}