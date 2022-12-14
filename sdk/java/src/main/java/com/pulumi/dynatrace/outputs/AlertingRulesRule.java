// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AlertingRulesRule {
    private Integer delayInMinutes;
    private String includeMode;
    private String severityLevel;
    private @Nullable List<String> tags;

    private AlertingRulesRule() {}
    public Integer delayInMinutes() {
        return this.delayInMinutes;
    }
    public String includeMode() {
        return this.includeMode;
    }
    public String severityLevel() {
        return this.severityLevel;
    }
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertingRulesRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer delayInMinutes;
        private String includeMode;
        private String severityLevel;
        private @Nullable List<String> tags;
        public Builder() {}
        public Builder(AlertingRulesRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delayInMinutes = defaults.delayInMinutes;
    	      this.includeMode = defaults.includeMode;
    	      this.severityLevel = defaults.severityLevel;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder delayInMinutes(Integer delayInMinutes) {
            this.delayInMinutes = Objects.requireNonNull(delayInMinutes);
            return this;
        }
        @CustomType.Setter
        public Builder includeMode(String includeMode) {
            this.includeMode = Objects.requireNonNull(includeMode);
            return this;
        }
        @CustomType.Setter
        public Builder severityLevel(String severityLevel) {
            this.severityLevel = Objects.requireNonNull(severityLevel);
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public AlertingRulesRule build() {
            final var o = new AlertingRulesRule();
            o.delayInMinutes = delayInMinutes;
            o.includeMode = includeMode;
            o.severityLevel = severityLevel;
            o.tags = tags;
            return o;
        }
    }
}
