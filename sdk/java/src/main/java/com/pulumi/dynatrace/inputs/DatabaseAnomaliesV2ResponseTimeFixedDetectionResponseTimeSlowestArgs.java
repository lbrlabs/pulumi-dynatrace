// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


public final class DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowestArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowestArgs Empty = new DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowestArgs();

    @Import(name="slowestDegradationMilliseconds", required=true)
    private Output<Double> slowestDegradationMilliseconds;

    public Output<Double> slowestDegradationMilliseconds() {
        return this.slowestDegradationMilliseconds;
    }

    private DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowestArgs() {}

    private DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowestArgs(DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowestArgs $) {
        this.slowestDegradationMilliseconds = $.slowestDegradationMilliseconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowestArgs $;

        public Builder() {
            $ = new DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowestArgs();
        }

        public Builder(DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowestArgs defaults) {
            $ = new DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowestArgs(Objects.requireNonNull(defaults));
        }

        public Builder slowestDegradationMilliseconds(Output<Double> slowestDegradationMilliseconds) {
            $.slowestDegradationMilliseconds = slowestDegradationMilliseconds;
            return this;
        }

        public Builder slowestDegradationMilliseconds(Double slowestDegradationMilliseconds) {
            return slowestDegradationMilliseconds(Output.of(slowestDegradationMilliseconds));
        }

        public DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowestArgs build() {
            $.slowestDegradationMilliseconds = Objects.requireNonNull($.slowestDegradationMilliseconds, "expected parameter 'slowestDegradationMilliseconds' to be non-null");
            return $;
        }
    }

}
