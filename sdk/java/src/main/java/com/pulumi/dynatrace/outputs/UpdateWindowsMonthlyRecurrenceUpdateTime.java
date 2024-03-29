// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UpdateWindowsMonthlyRecurrenceUpdateTime {
    private Integer duration;
    private String startTime;
    private String timeZone;

    private UpdateWindowsMonthlyRecurrenceUpdateTime() {}
    public Integer duration() {
        return this.duration;
    }
    public String startTime() {
        return this.startTime;
    }
    public String timeZone() {
        return this.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpdateWindowsMonthlyRecurrenceUpdateTime defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer duration;
        private String startTime;
        private String timeZone;
        public Builder() {}
        public Builder(UpdateWindowsMonthlyRecurrenceUpdateTime defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.startTime = defaults.startTime;
    	      this.timeZone = defaults.timeZone;
        }

        @CustomType.Setter
        public Builder duration(Integer duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        @CustomType.Setter
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        @CustomType.Setter
        public Builder timeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }
        public UpdateWindowsMonthlyRecurrenceUpdateTime build() {
            final var o = new UpdateWindowsMonthlyRecurrenceUpdateTime();
            o.duration = duration;
            o.startTime = startTime;
            o.timeZone = timeZone;
            return o;
        }
    }
}
