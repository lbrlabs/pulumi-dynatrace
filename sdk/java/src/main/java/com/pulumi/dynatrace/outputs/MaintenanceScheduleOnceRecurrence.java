// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MaintenanceScheduleOnceRecurrence {
    private String endTime;
    private String startTime;
    private String timeZone;

    private MaintenanceScheduleOnceRecurrence() {}
    public String endTime() {
        return this.endTime;
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

    public static Builder builder(MaintenanceScheduleOnceRecurrence defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endTime;
        private String startTime;
        private String timeZone;
        public Builder() {}
        public Builder(MaintenanceScheduleOnceRecurrence defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
    	      this.timeZone = defaults.timeZone;
        }

        @CustomType.Setter
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
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
        public MaintenanceScheduleOnceRecurrence build() {
            final var o = new MaintenanceScheduleOnceRecurrence();
            o.endTime = endTime;
            o.startTime = startTime;
            o.timeZone = timeZone;
            return o;
        }
    }
}
