// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.AutotagV2RulesRuleAttributeRule;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutotagV2RulesRule {
    private @Nullable AutotagV2RulesRuleAttributeRule attributeRule;
    private Boolean enabled;
    private @Nullable String entitySelector;
    private String type;
    private @Nullable String valueFormat;
    private String valueNormalization;

    private AutotagV2RulesRule() {}
    public Optional<AutotagV2RulesRuleAttributeRule> attributeRule() {
        return Optional.ofNullable(this.attributeRule);
    }
    public Boolean enabled() {
        return this.enabled;
    }
    public Optional<String> entitySelector() {
        return Optional.ofNullable(this.entitySelector);
    }
    public String type() {
        return this.type;
    }
    public Optional<String> valueFormat() {
        return Optional.ofNullable(this.valueFormat);
    }
    public String valueNormalization() {
        return this.valueNormalization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutotagV2RulesRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AutotagV2RulesRuleAttributeRule attributeRule;
        private Boolean enabled;
        private @Nullable String entitySelector;
        private String type;
        private @Nullable String valueFormat;
        private String valueNormalization;
        public Builder() {}
        public Builder(AutotagV2RulesRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeRule = defaults.attributeRule;
    	      this.enabled = defaults.enabled;
    	      this.entitySelector = defaults.entitySelector;
    	      this.type = defaults.type;
    	      this.valueFormat = defaults.valueFormat;
    	      this.valueNormalization = defaults.valueNormalization;
        }

        @CustomType.Setter
        public Builder attributeRule(@Nullable AutotagV2RulesRuleAttributeRule attributeRule) {
            this.attributeRule = attributeRule;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder entitySelector(@Nullable String entitySelector) {
            this.entitySelector = entitySelector;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder valueFormat(@Nullable String valueFormat) {
            this.valueFormat = valueFormat;
            return this;
        }
        @CustomType.Setter
        public Builder valueNormalization(String valueNormalization) {
            this.valueNormalization = Objects.requireNonNull(valueNormalization);
            return this;
        }
        public AutotagV2RulesRule build() {
            final var o = new AutotagV2RulesRule();
            o.attributeRule = attributeRule;
            o.enabled = enabled;
            o.entitySelector = entitySelector;
            o.type = type;
            o.valueFormat = valueFormat;
            o.valueNormalization = valueNormalization;
            return o;
        }
    }
}
