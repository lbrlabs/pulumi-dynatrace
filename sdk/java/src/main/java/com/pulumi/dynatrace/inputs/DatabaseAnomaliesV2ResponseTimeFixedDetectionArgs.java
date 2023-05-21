// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.DatabaseAnomaliesV2ResponseTimeFixedDetectionOverAlertingProtectionArgs;
import com.pulumi.dynatrace.inputs.DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeAllArgs;
import com.pulumi.dynatrace.inputs.DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowestArgs;
import java.lang.String;
import java.util.Objects;


public final class DatabaseAnomaliesV2ResponseTimeFixedDetectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseAnomaliesV2ResponseTimeFixedDetectionArgs Empty = new DatabaseAnomaliesV2ResponseTimeFixedDetectionArgs();

    @Import(name="overAlertingProtection", required=true)
    private Output<DatabaseAnomaliesV2ResponseTimeFixedDetectionOverAlertingProtectionArgs> overAlertingProtection;

    public Output<DatabaseAnomaliesV2ResponseTimeFixedDetectionOverAlertingProtectionArgs> overAlertingProtection() {
        return this.overAlertingProtection;
    }

    @Import(name="responseTimeAll", required=true)
    private Output<DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeAllArgs> responseTimeAll;

    public Output<DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeAllArgs> responseTimeAll() {
        return this.responseTimeAll;
    }

    @Import(name="responseTimeSlowest", required=true)
    private Output<DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowestArgs> responseTimeSlowest;

    public Output<DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowestArgs> responseTimeSlowest() {
        return this.responseTimeSlowest;
    }

    @Import(name="sensitivity", required=true)
    private Output<String> sensitivity;

    public Output<String> sensitivity() {
        return this.sensitivity;
    }

    private DatabaseAnomaliesV2ResponseTimeFixedDetectionArgs() {}

    private DatabaseAnomaliesV2ResponseTimeFixedDetectionArgs(DatabaseAnomaliesV2ResponseTimeFixedDetectionArgs $) {
        this.overAlertingProtection = $.overAlertingProtection;
        this.responseTimeAll = $.responseTimeAll;
        this.responseTimeSlowest = $.responseTimeSlowest;
        this.sensitivity = $.sensitivity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseAnomaliesV2ResponseTimeFixedDetectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseAnomaliesV2ResponseTimeFixedDetectionArgs $;

        public Builder() {
            $ = new DatabaseAnomaliesV2ResponseTimeFixedDetectionArgs();
        }

        public Builder(DatabaseAnomaliesV2ResponseTimeFixedDetectionArgs defaults) {
            $ = new DatabaseAnomaliesV2ResponseTimeFixedDetectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder overAlertingProtection(Output<DatabaseAnomaliesV2ResponseTimeFixedDetectionOverAlertingProtectionArgs> overAlertingProtection) {
            $.overAlertingProtection = overAlertingProtection;
            return this;
        }

        public Builder overAlertingProtection(DatabaseAnomaliesV2ResponseTimeFixedDetectionOverAlertingProtectionArgs overAlertingProtection) {
            return overAlertingProtection(Output.of(overAlertingProtection));
        }

        public Builder responseTimeAll(Output<DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeAllArgs> responseTimeAll) {
            $.responseTimeAll = responseTimeAll;
            return this;
        }

        public Builder responseTimeAll(DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeAllArgs responseTimeAll) {
            return responseTimeAll(Output.of(responseTimeAll));
        }

        public Builder responseTimeSlowest(Output<DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowestArgs> responseTimeSlowest) {
            $.responseTimeSlowest = responseTimeSlowest;
            return this;
        }

        public Builder responseTimeSlowest(DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowestArgs responseTimeSlowest) {
            return responseTimeSlowest(Output.of(responseTimeSlowest));
        }

        public Builder sensitivity(Output<String> sensitivity) {
            $.sensitivity = sensitivity;
            return this;
        }

        public Builder sensitivity(String sensitivity) {
            return sensitivity(Output.of(sensitivity));
        }

        public DatabaseAnomaliesV2ResponseTimeFixedDetectionArgs build() {
            $.overAlertingProtection = Objects.requireNonNull($.overAlertingProtection, "expected parameter 'overAlertingProtection' to be non-null");
            $.responseTimeAll = Objects.requireNonNull($.responseTimeAll, "expected parameter 'responseTimeAll' to be non-null");
            $.responseTimeSlowest = Objects.requireNonNull($.responseTimeSlowest, "expected parameter 'responseTimeSlowest' to be non-null");
            $.sensitivity = Objects.requireNonNull($.sensitivity, "expected parameter 'sensitivity' to be non-null");
            return $;
        }
    }

}