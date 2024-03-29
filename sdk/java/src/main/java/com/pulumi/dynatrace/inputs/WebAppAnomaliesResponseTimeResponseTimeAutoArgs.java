// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.WebAppAnomaliesResponseTimeResponseTimeAutoOverAlertingProtectionArgs;
import com.pulumi.dynatrace.inputs.WebAppAnomaliesResponseTimeResponseTimeAutoResponseTimeAllArgs;
import com.pulumi.dynatrace.inputs.WebAppAnomaliesResponseTimeResponseTimeAutoResponseTimeSlowestArgs;
import java.util.Objects;


public final class WebAppAnomaliesResponseTimeResponseTimeAutoArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAppAnomaliesResponseTimeResponseTimeAutoArgs Empty = new WebAppAnomaliesResponseTimeResponseTimeAutoArgs();

    @Import(name="overAlertingProtection", required=true)
    private Output<WebAppAnomaliesResponseTimeResponseTimeAutoOverAlertingProtectionArgs> overAlertingProtection;

    public Output<WebAppAnomaliesResponseTimeResponseTimeAutoOverAlertingProtectionArgs> overAlertingProtection() {
        return this.overAlertingProtection;
    }

    @Import(name="responseTimeAll", required=true)
    private Output<WebAppAnomaliesResponseTimeResponseTimeAutoResponseTimeAllArgs> responseTimeAll;

    public Output<WebAppAnomaliesResponseTimeResponseTimeAutoResponseTimeAllArgs> responseTimeAll() {
        return this.responseTimeAll;
    }

    @Import(name="responseTimeSlowest", required=true)
    private Output<WebAppAnomaliesResponseTimeResponseTimeAutoResponseTimeSlowestArgs> responseTimeSlowest;

    public Output<WebAppAnomaliesResponseTimeResponseTimeAutoResponseTimeSlowestArgs> responseTimeSlowest() {
        return this.responseTimeSlowest;
    }

    private WebAppAnomaliesResponseTimeResponseTimeAutoArgs() {}

    private WebAppAnomaliesResponseTimeResponseTimeAutoArgs(WebAppAnomaliesResponseTimeResponseTimeAutoArgs $) {
        this.overAlertingProtection = $.overAlertingProtection;
        this.responseTimeAll = $.responseTimeAll;
        this.responseTimeSlowest = $.responseTimeSlowest;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppAnomaliesResponseTimeResponseTimeAutoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppAnomaliesResponseTimeResponseTimeAutoArgs $;

        public Builder() {
            $ = new WebAppAnomaliesResponseTimeResponseTimeAutoArgs();
        }

        public Builder(WebAppAnomaliesResponseTimeResponseTimeAutoArgs defaults) {
            $ = new WebAppAnomaliesResponseTimeResponseTimeAutoArgs(Objects.requireNonNull(defaults));
        }

        public Builder overAlertingProtection(Output<WebAppAnomaliesResponseTimeResponseTimeAutoOverAlertingProtectionArgs> overAlertingProtection) {
            $.overAlertingProtection = overAlertingProtection;
            return this;
        }

        public Builder overAlertingProtection(WebAppAnomaliesResponseTimeResponseTimeAutoOverAlertingProtectionArgs overAlertingProtection) {
            return overAlertingProtection(Output.of(overAlertingProtection));
        }

        public Builder responseTimeAll(Output<WebAppAnomaliesResponseTimeResponseTimeAutoResponseTimeAllArgs> responseTimeAll) {
            $.responseTimeAll = responseTimeAll;
            return this;
        }

        public Builder responseTimeAll(WebAppAnomaliesResponseTimeResponseTimeAutoResponseTimeAllArgs responseTimeAll) {
            return responseTimeAll(Output.of(responseTimeAll));
        }

        public Builder responseTimeSlowest(Output<WebAppAnomaliesResponseTimeResponseTimeAutoResponseTimeSlowestArgs> responseTimeSlowest) {
            $.responseTimeSlowest = responseTimeSlowest;
            return this;
        }

        public Builder responseTimeSlowest(WebAppAnomaliesResponseTimeResponseTimeAutoResponseTimeSlowestArgs responseTimeSlowest) {
            return responseTimeSlowest(Output.of(responseTimeSlowest));
        }

        public WebAppAnomaliesResponseTimeResponseTimeAutoArgs build() {
            $.overAlertingProtection = Objects.requireNonNull($.overAlertingProtection, "expected parameter 'overAlertingProtection' to be non-null");
            $.responseTimeAll = Objects.requireNonNull($.responseTimeAll, "expected parameter 'responseTimeAll' to be non-null");
            $.responseTimeSlowest = Objects.requireNonNull($.responseTimeSlowest, "expected parameter 'responseTimeSlowest' to be non-null");
            return $;
        }
    }

}
