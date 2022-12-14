// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.ManagementZoneRuleConditionCustomProcessMetadataConditionKeyDynamicKey;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagementZoneRuleConditionCustomProcessMetadataConditionKey {
    private String attribute;
    private ManagementZoneRuleConditionCustomProcessMetadataConditionKeyDynamicKey dynamicKey;
    /**
     * @deprecated
     * The value of the attribute type is implicit, therefore shouldn&#39;t get specified
     * 
     */
    @Deprecated /* The value of the attribute type is implicit, therefore shouldn't get specified */
    private @Nullable String type;
    private @Nullable String unknowns;

    private ManagementZoneRuleConditionCustomProcessMetadataConditionKey() {}
    public String attribute() {
        return this.attribute;
    }
    public ManagementZoneRuleConditionCustomProcessMetadataConditionKeyDynamicKey dynamicKey() {
        return this.dynamicKey;
    }
    /**
     * @deprecated
     * The value of the attribute type is implicit, therefore shouldn&#39;t get specified
     * 
     */
    @Deprecated /* The value of the attribute type is implicit, therefore shouldn't get specified */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    public Optional<String> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementZoneRuleConditionCustomProcessMetadataConditionKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String attribute;
        private ManagementZoneRuleConditionCustomProcessMetadataConditionKeyDynamicKey dynamicKey;
        private @Nullable String type;
        private @Nullable String unknowns;
        public Builder() {}
        public Builder(ManagementZoneRuleConditionCustomProcessMetadataConditionKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.dynamicKey = defaults.dynamicKey;
    	      this.type = defaults.type;
    	      this.unknowns = defaults.unknowns;
        }

        @CustomType.Setter
        public Builder attribute(String attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }
        @CustomType.Setter
        public Builder dynamicKey(ManagementZoneRuleConditionCustomProcessMetadataConditionKeyDynamicKey dynamicKey) {
            this.dynamicKey = Objects.requireNonNull(dynamicKey);
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder unknowns(@Nullable String unknowns) {
            this.unknowns = unknowns;
            return this;
        }
        public ManagementZoneRuleConditionCustomProcessMetadataConditionKey build() {
            final var o = new ManagementZoneRuleConditionCustomProcessMetadataConditionKey();
            o.attribute = attribute;
            o.dynamicKey = dynamicKey;
            o.type = type;
            o.unknowns = unknowns;
            return o;
        }
    }
}
