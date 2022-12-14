// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatabaseAnomaliesResponseTimeThresholds {
    /**
     * @return Configuration for anomalies regarding load drops and spikes
     * 
     */
    private String load;
    private Integer milliseconds;
    private String sensitivity;
    private Integer slowestMilliseconds;
    private @Nullable String unknowns;

    private DatabaseAnomaliesResponseTimeThresholds() {}
    /**
     * @return Configuration for anomalies regarding load drops and spikes
     * 
     */
    public String load() {
        return this.load;
    }
    public Integer milliseconds() {
        return this.milliseconds;
    }
    public String sensitivity() {
        return this.sensitivity;
    }
    public Integer slowestMilliseconds() {
        return this.slowestMilliseconds;
    }
    public Optional<String> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseAnomaliesResponseTimeThresholds defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String load;
        private Integer milliseconds;
        private String sensitivity;
        private Integer slowestMilliseconds;
        private @Nullable String unknowns;
        public Builder() {}
        public Builder(DatabaseAnomaliesResponseTimeThresholds defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.load = defaults.load;
    	      this.milliseconds = defaults.milliseconds;
    	      this.sensitivity = defaults.sensitivity;
    	      this.slowestMilliseconds = defaults.slowestMilliseconds;
    	      this.unknowns = defaults.unknowns;
        }

        @CustomType.Setter
        public Builder load(String load) {
            this.load = Objects.requireNonNull(load);
            return this;
        }
        @CustomType.Setter
        public Builder milliseconds(Integer milliseconds) {
            this.milliseconds = Objects.requireNonNull(milliseconds);
            return this;
        }
        @CustomType.Setter
        public Builder sensitivity(String sensitivity) {
            this.sensitivity = Objects.requireNonNull(sensitivity);
            return this;
        }
        @CustomType.Setter
        public Builder slowestMilliseconds(Integer slowestMilliseconds) {
            this.slowestMilliseconds = Objects.requireNonNull(slowestMilliseconds);
            return this;
        }
        @CustomType.Setter
        public Builder unknowns(@Nullable String unknowns) {
            this.unknowns = unknowns;
            return this;
        }
        public DatabaseAnomaliesResponseTimeThresholds build() {
            final var o = new DatabaseAnomaliesResponseTimeThresholds();
            o.load = load;
            o.milliseconds = milliseconds;
            o.sensitivity = sensitivity;
            o.slowestMilliseconds = slowestMilliseconds;
            o.unknowns = unknowns;
            return o;
        }
    }
}
