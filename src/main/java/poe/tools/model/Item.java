package poe.tools.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Item {

    @JsonProperty("verified")
    private Boolean verified;

    @JsonProperty("w")
    private Integer slotWidth;

    @JsonProperty("h")
    private Integer slotHeight;

    @JsonProperty("ilvl")
    private Integer level;

    @JsonProperty("icon")
    private String pictureUrl;

    @JsonProperty("league")
    private String leagueName;

    @JsonProperty("id")
    private String identifier;

    @JsonProperty("name")
    private String uniqueName;

    @JsonProperty("typeLine")
    private String baseType;

    @JsonProperty("identified")
    private Boolean identified;

    @JsonProperty("properties")
    private List<Property> properties = null;

    @JsonProperty("explicitMods")
    private List<String> explicitMods = null;

    @JsonProperty("descrText")
    private String descriptionText;

    @JsonProperty("frameType")
    private Integer frameType;

    @JsonProperty("stackSize")
    private Integer stackSize;

    @JsonProperty("maxStackSize")
    private Integer maxStackSize;

    @JsonProperty("category")
    private Category category;

    @JsonProperty("x")
    private Integer stashPositionX;

    @JsonProperty("y")
    private Integer stashPositionY;

    @JsonProperty("inventoryId")
    private String inventoryId;

    @JsonProperty("corrupted")
    private Boolean corrupted;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Integer getSlotWidth() {
        return slotWidth;
    }

    public void setSlotWidth(Integer slotWidth) {
        this.slotWidth = slotWidth;
    }

    public Integer getSlotHeight() {
        return slotHeight;
    }

    public void setSlotHeight(Integer slotHeight) {
        this.slotHeight = slotHeight;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    public Boolean getIdentified() {
        return identified;
    }

    public void setIdentified(Boolean identified) {
        this.identified = identified;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public List<String> getExplicitMods() {
        return explicitMods;
    }

    public void setExplicitMods(List<String> explicitMods) {
        this.explicitMods = explicitMods;
    }

    public String getDescriptionText() {
        return descriptionText;
    }

    public void setDescriptionText(String descriptionText) {
        this.descriptionText = descriptionText;
    }

    public Integer getFrameType() {
        return frameType;
    }

    public void setFrameType(Integer frameType) {
        this.frameType = frameType;
    }

    public Integer getStackSize() {
        return stackSize;
    }

    public void setStackSize(Integer stackSize) {
        this.stackSize = stackSize;
    }

    public Integer getMaxStackSize() {
        return maxStackSize;
    }

    public void setMaxStackSize(Integer maxStackSize) {
        this.maxStackSize = maxStackSize;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getStashPositionX() {
        return stashPositionX;
    }

    public void setStashPositionX(Integer stashPositionX) {
        this.stashPositionX = stashPositionX;
    }

    public Integer getStashPositionY() {
        return stashPositionY;
    }

    public void setStashPositionY(Integer stashPositionY) {
        this.stashPositionY = stashPositionY;
    }

    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Boolean getCorrupted() {
        return corrupted;
    }

    public void setCorrupted(Boolean corrupted) {
        this.corrupted = corrupted;
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
