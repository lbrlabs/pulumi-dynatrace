// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.ManagementZoneRuleConditionTagValue;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagementZoneRuleConditionTag {
    private @Nullable Boolean negate;
    private String operator;
    private @Nullable String unknowns;
    private @Nullable ManagementZoneRuleConditionTagValue value;

    private ManagementZoneRuleConditionTag() {}
    public Optional<Boolean> negate() {
        return Optional.ofNullable(this.negate);
    }
    public String operator() {
        return this.operator;
    }
    public Optional<String> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }
    public Optional<ManagementZoneRuleConditionTagValue> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementZoneRuleConditionTag defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean negate;
        private String operator;
        private @Nullable String unknowns;
        private @Nullable ManagementZoneRuleConditionTagValue value;
        public Builder() {}
        public Builder(ManagementZoneRuleConditionTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.negate = defaults.negate;
    	      this.operator = defaults.operator;
    	      this.unknowns = defaults.unknowns;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder negate(@Nullable Boolean negate) {
            this.negate = negate;
            return this;
        }
        @CustomType.Setter
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        @CustomType.Setter
        public Builder unknowns(@Nullable String unknowns) {
            this.unknowns = unknowns;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable ManagementZoneRuleConditionTagValue value) {
            this.value = value;
            return this;
        }
        public ManagementZoneRuleConditionTag build() {
            final var o = new ManagementZoneRuleConditionTag();
            o.negate = negate;
            o.operator = operator;
            o.unknowns = unknowns;
            o.value = value;
            return o;
        }
    }
}
