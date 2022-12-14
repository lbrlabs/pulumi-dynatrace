// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebApplicationMonitoringSettingsContentCaptureResourceTimingSettings {
    private Integer instrumentationDelay;
    private @Nullable Boolean nonW3cResourceTimings;
    private @Nullable String resourceTimingCaptureType;
    private @Nullable Integer resourceTimingsDomainLimit;
    private @Nullable Boolean w3cResourceTimings;

    private WebApplicationMonitoringSettingsContentCaptureResourceTimingSettings() {}
    public Integer instrumentationDelay() {
        return this.instrumentationDelay;
    }
    public Optional<Boolean> nonW3cResourceTimings() {
        return Optional.ofNullable(this.nonW3cResourceTimings);
    }
    public Optional<String> resourceTimingCaptureType() {
        return Optional.ofNullable(this.resourceTimingCaptureType);
    }
    public Optional<Integer> resourceTimingsDomainLimit() {
        return Optional.ofNullable(this.resourceTimingsDomainLimit);
    }
    public Optional<Boolean> w3cResourceTimings() {
        return Optional.ofNullable(this.w3cResourceTimings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebApplicationMonitoringSettingsContentCaptureResourceTimingSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer instrumentationDelay;
        private @Nullable Boolean nonW3cResourceTimings;
        private @Nullable String resourceTimingCaptureType;
        private @Nullable Integer resourceTimingsDomainLimit;
        private @Nullable Boolean w3cResourceTimings;
        public Builder() {}
        public Builder(WebApplicationMonitoringSettingsContentCaptureResourceTimingSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instrumentationDelay = defaults.instrumentationDelay;
    	      this.nonW3cResourceTimings = defaults.nonW3cResourceTimings;
    	      this.resourceTimingCaptureType = defaults.resourceTimingCaptureType;
    	      this.resourceTimingsDomainLimit = defaults.resourceTimingsDomainLimit;
    	      this.w3cResourceTimings = defaults.w3cResourceTimings;
        }

        @CustomType.Setter
        public Builder instrumentationDelay(Integer instrumentationDelay) {
            this.instrumentationDelay = Objects.requireNonNull(instrumentationDelay);
            return this;
        }
        @CustomType.Setter
        public Builder nonW3cResourceTimings(@Nullable Boolean nonW3cResourceTimings) {
            this.nonW3cResourceTimings = nonW3cResourceTimings;
            return this;
        }
        @CustomType.Setter
        public Builder resourceTimingCaptureType(@Nullable String resourceTimingCaptureType) {
            this.resourceTimingCaptureType = resourceTimingCaptureType;
            return this;
        }
        @CustomType.Setter
        public Builder resourceTimingsDomainLimit(@Nullable Integer resourceTimingsDomainLimit) {
            this.resourceTimingsDomainLimit = resourceTimingsDomainLimit;
            return this;
        }
        @CustomType.Setter
        public Builder w3cResourceTimings(@Nullable Boolean w3cResourceTimings) {
            this.w3cResourceTimings = w3cResourceTimings;
            return this;
        }
        public WebApplicationMonitoringSettingsContentCaptureResourceTimingSettings build() {
            final var o = new WebApplicationMonitoringSettingsContentCaptureResourceTimingSettings();
            o.instrumentationDelay = instrumentationDelay;
            o.nonW3cResourceTimings = nonW3cResourceTimings;
            o.resourceTimingCaptureType = resourceTimingCaptureType;
            o.resourceTimingsDomainLimit = resourceTimingsDomainLimit;
            o.w3cResourceTimings = w3cResourceTimings;
            return o;
        }
    }
}
