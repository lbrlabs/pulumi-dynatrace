// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FailureDetectionRulesConditionsConditionPredicate {
    private @Nullable Boolean caseSensitive;
    private @Nullable List<String> managementZones;
    private String predicateType;
    private @Nullable List<String> serviceTypes;
    private @Nullable List<String> tagKeys;
    private @Nullable List<String> tags;
    private @Nullable List<String> textValues;

    private FailureDetectionRulesConditionsConditionPredicate() {}
    public Optional<Boolean> caseSensitive() {
        return Optional.ofNullable(this.caseSensitive);
    }
    public List<String> managementZones() {
        return this.managementZones == null ? List.of() : this.managementZones;
    }
    public String predicateType() {
        return this.predicateType;
    }
    public List<String> serviceTypes() {
        return this.serviceTypes == null ? List.of() : this.serviceTypes;
    }
    public List<String> tagKeys() {
        return this.tagKeys == null ? List.of() : this.tagKeys;
    }
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public List<String> textValues() {
        return this.textValues == null ? List.of() : this.textValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailureDetectionRulesConditionsConditionPredicate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean caseSensitive;
        private @Nullable List<String> managementZones;
        private String predicateType;
        private @Nullable List<String> serviceTypes;
        private @Nullable List<String> tagKeys;
        private @Nullable List<String> tags;
        private @Nullable List<String> textValues;
        public Builder() {}
        public Builder(FailureDetectionRulesConditionsConditionPredicate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caseSensitive = defaults.caseSensitive;
    	      this.managementZones = defaults.managementZones;
    	      this.predicateType = defaults.predicateType;
    	      this.serviceTypes = defaults.serviceTypes;
    	      this.tagKeys = defaults.tagKeys;
    	      this.tags = defaults.tags;
    	      this.textValues = defaults.textValues;
        }

        @CustomType.Setter
        public Builder caseSensitive(@Nullable Boolean caseSensitive) {
            this.caseSensitive = caseSensitive;
            return this;
        }
        @CustomType.Setter
        public Builder managementZones(@Nullable List<String> managementZones) {
            this.managementZones = managementZones;
            return this;
        }
        public Builder managementZones(String... managementZones) {
            return managementZones(List.of(managementZones));
        }
        @CustomType.Setter
        public Builder predicateType(String predicateType) {
            this.predicateType = Objects.requireNonNull(predicateType);
            return this;
        }
        @CustomType.Setter
        public Builder serviceTypes(@Nullable List<String> serviceTypes) {
            this.serviceTypes = serviceTypes;
            return this;
        }
        public Builder serviceTypes(String... serviceTypes) {
            return serviceTypes(List.of(serviceTypes));
        }
        @CustomType.Setter
        public Builder tagKeys(@Nullable List<String> tagKeys) {
            this.tagKeys = tagKeys;
            return this;
        }
        public Builder tagKeys(String... tagKeys) {
            return tagKeys(List.of(tagKeys));
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder textValues(@Nullable List<String> textValues) {
            this.textValues = textValues;
            return this;
        }
        public Builder textValues(String... textValues) {
            return textValues(List.of(textValues));
        }
        public FailureDetectionRulesConditionsConditionPredicate build() {
            final var o = new FailureDetectionRulesConditionsConditionPredicate();
            o.caseSensitive = caseSensitive;
            o.managementZones = managementZones;
            o.predicateType = predicateType;
            o.serviceTypes = serviceTypes;
            o.tagKeys = tagKeys;
            o.tags = tags;
            o.textValues = textValues;
            return o;
        }
    }
}
