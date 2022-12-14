// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.AlertingProfileEventTypeFilterCustomEventFilterCustomDescriptionFilter;
import com.pulumi.dynatrace.outputs.AlertingProfileEventTypeFilterCustomEventFilterCustomTitleFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertingProfileEventTypeFilterCustomEventFilter {
    private @Nullable List<AlertingProfileEventTypeFilterCustomEventFilterCustomDescriptionFilter> customDescriptionFilters;
    private @Nullable List<AlertingProfileEventTypeFilterCustomEventFilterCustomTitleFilter> customTitleFilters;
    /**
     * @return allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    private @Nullable String unknowns;

    private AlertingProfileEventTypeFilterCustomEventFilter() {}
    public List<AlertingProfileEventTypeFilterCustomEventFilterCustomDescriptionFilter> customDescriptionFilters() {
        return this.customDescriptionFilters == null ? List.of() : this.customDescriptionFilters;
    }
    public List<AlertingProfileEventTypeFilterCustomEventFilterCustomTitleFilter> customTitleFilters() {
        return this.customTitleFilters == null ? List.of() : this.customTitleFilters;
    }
    /**
     * @return allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    public Optional<String> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertingProfileEventTypeFilterCustomEventFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<AlertingProfileEventTypeFilterCustomEventFilterCustomDescriptionFilter> customDescriptionFilters;
        private @Nullable List<AlertingProfileEventTypeFilterCustomEventFilterCustomTitleFilter> customTitleFilters;
        private @Nullable String unknowns;
        public Builder() {}
        public Builder(AlertingProfileEventTypeFilterCustomEventFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customDescriptionFilters = defaults.customDescriptionFilters;
    	      this.customTitleFilters = defaults.customTitleFilters;
    	      this.unknowns = defaults.unknowns;
        }

        @CustomType.Setter
        public Builder customDescriptionFilters(@Nullable List<AlertingProfileEventTypeFilterCustomEventFilterCustomDescriptionFilter> customDescriptionFilters) {
            this.customDescriptionFilters = customDescriptionFilters;
            return this;
        }
        public Builder customDescriptionFilters(AlertingProfileEventTypeFilterCustomEventFilterCustomDescriptionFilter... customDescriptionFilters) {
            return customDescriptionFilters(List.of(customDescriptionFilters));
        }
        @CustomType.Setter
        public Builder customTitleFilters(@Nullable List<AlertingProfileEventTypeFilterCustomEventFilterCustomTitleFilter> customTitleFilters) {
            this.customTitleFilters = customTitleFilters;
            return this;
        }
        public Builder customTitleFilters(AlertingProfileEventTypeFilterCustomEventFilterCustomTitleFilter... customTitleFilters) {
            return customTitleFilters(List.of(customTitleFilters));
        }
        @CustomType.Setter
        public Builder unknowns(@Nullable String unknowns) {
            this.unknowns = unknowns;
            return this;
        }
        public AlertingProfileEventTypeFilterCustomEventFilter build() {
            final var o = new AlertingProfileEventTypeFilterCustomEventFilter();
            o.customDescriptionFilters = customDescriptionFilters;
            o.customTitleFilters = customTitleFilters;
            o.unknowns = unknowns;
            return o;
        }
    }
}
