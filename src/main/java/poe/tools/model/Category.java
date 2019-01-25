package poe.tools.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Category {

    @JsonProperty("currency")
    private List<Object> currency = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    public List<Object> getCurrency() {
        return currency;
    }

    public void setCurrency(List<Object> currency) {
        this.currency = currency;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}