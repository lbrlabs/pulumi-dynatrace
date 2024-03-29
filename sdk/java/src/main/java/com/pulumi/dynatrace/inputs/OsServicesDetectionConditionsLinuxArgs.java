// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.OsServicesDetectionConditionsLinuxLinuxDetectionConditionArgs;
import java.util.List;
import java.util.Objects;


public final class OsServicesDetectionConditionsLinuxArgs extends com.pulumi.resources.ResourceArgs {

    public static final OsServicesDetectionConditionsLinuxArgs Empty = new OsServicesDetectionConditionsLinuxArgs();

    @Import(name="linuxDetectionConditions", required=true)
    private Output<List<OsServicesDetectionConditionsLinuxLinuxDetectionConditionArgs>> linuxDetectionConditions;

    public Output<List<OsServicesDetectionConditionsLinuxLinuxDetectionConditionArgs>> linuxDetectionConditions() {
        return this.linuxDetectionConditions;
    }

    private OsServicesDetectionConditionsLinuxArgs() {}

    private OsServicesDetectionConditionsLinuxArgs(OsServicesDetectionConditionsLinuxArgs $) {
        this.linuxDetectionConditions = $.linuxDetectionConditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OsServicesDetectionConditionsLinuxArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OsServicesDetectionConditionsLinuxArgs $;

        public Builder() {
            $ = new OsServicesDetectionConditionsLinuxArgs();
        }

        public Builder(OsServicesDetectionConditionsLinuxArgs defaults) {
            $ = new OsServicesDetectionConditionsLinuxArgs(Objects.requireNonNull(defaults));
        }

        public Builder linuxDetectionConditions(Output<List<OsServicesDetectionConditionsLinuxLinuxDetectionConditionArgs>> linuxDetectionConditions) {
            $.linuxDetectionConditions = linuxDetectionConditions;
            return this;
        }

        public Builder linuxDetectionConditions(List<OsServicesDetectionConditionsLinuxLinuxDetectionConditionArgs> linuxDetectionConditions) {
            return linuxDetectionConditions(Output.of(linuxDetectionConditions));
        }

        public Builder linuxDetectionConditions(OsServicesDetectionConditionsLinuxLinuxDetectionConditionArgs... linuxDetectionConditions) {
            return linuxDetectionConditions(List.of(linuxDetectionConditions));
        }

        public OsServicesDetectionConditionsLinuxArgs build() {
            $.linuxDetectionConditions = Objects.requireNonNull($.linuxDetectionConditions, "expected parameter 'linuxDetectionConditions' to be non-null");
            return $;
        }
    }

}
